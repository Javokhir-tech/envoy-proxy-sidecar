from flask import Flask, jsonify
import requests

app = Flask(__name__)

inventory_service_url = "http://sc-inventory:8081"


@app.route('/products/<int:product_id>', methods=['GET'])
def get_product(product_id):
    response = requests.get(f"{inventory_service_url}/inventory/{product_id}")

    if response.status_code != 200:
        return jsonify({"error": "Failed to retrieve product information"}), response.status_code

    try:
        product = response.json()
        return jsonify(product), 200
    except json.JSONDecodeError as e:
        return jsonify({"error": "Invalid JSON response from inventory service"}), 500


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8082)
