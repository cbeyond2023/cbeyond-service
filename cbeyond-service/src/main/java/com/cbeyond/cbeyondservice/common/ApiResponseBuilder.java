package com.cbeyond.cbeyondservice.common;

public class ApiResponseBuilder {
    public static ApiResponseModel buildApiResponse(int code, String message) {

        return ApiResponseModel.builder()
                .statusCode(code)
                .message(message)
                .build();
    }
}
