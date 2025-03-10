package com.devteria.identityservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    int code;
    String message;
    T data;
}
