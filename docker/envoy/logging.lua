-- logging.lua

-- Define a function for logging requests
local function log_request(request_handle)
    local method = request_handle:headers():get(":method")
    local path = request_handle:headers():get(":path")
    local headers = request_handle:headers():get("x-request-headers")

    local log_message = string.format("Method: %s, Path: %s, Headers: %s", method, path, headers)
    request_handle:logInfo(log_message)
end

-- Return the function so that it can be used by the Lua filter in envoy.yaml
return {
    log_request = log_request
}
