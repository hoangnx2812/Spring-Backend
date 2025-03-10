package com.devteria.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticationReq {

    @Size(min = 4, message = "User name must be at least 4 characters")
    String username;

    @Size(min = 6, message = "Password must be at least 6 characters")
    String password;
}
