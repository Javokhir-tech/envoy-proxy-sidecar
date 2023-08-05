FROM envoyproxy/envoy:v1.27-latest

COPY logging.lua /etc/envoy/logging.lua

CMD /usr/local/bin/envoy -c /etc/envoy.yml
