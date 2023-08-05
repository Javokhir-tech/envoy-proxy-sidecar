
local function jwt_authorization(request_handle)
    -- Check if the request has been authorized with JWT token
    local metadata = request_handle:streamInfo():dynamicMetadata()
    local jwt_authorized = metadata:lookupFilterMetadata("envoy.filters.http.jwt_authn", "auth_result")
    if jwt_authorized and jwt_authorized.string_value == "true" then
        return
    else
        -- Return 401 Unauthorized response for requests without a valid JWT token
        request_handle:sendLocalResponse(401, "Unauthorized", "", {})
    end
end

return jwt_authorization
