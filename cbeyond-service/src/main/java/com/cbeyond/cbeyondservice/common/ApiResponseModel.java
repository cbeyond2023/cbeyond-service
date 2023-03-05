package com.cbeyond.cbeyondservice.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseModel {

    @ApiModelProperty(value = "Returns the http status code", example = "200")
    private int statusCode;
    @ApiModelProperty(value = "Message for the operation performed", example = "Record is created successfully.")
    private String message;

}
