FROM --platform=linux/amd64 python:3.9-slim

WORKDIR /app

COPY product_service.py /app/product_service.py
COPY requirements.txt /app/requirements.txt

RUN pip install -r requirements.txt

EXPOSE 8082

CMD ["python", "product_service.py"]
