package com.geekbrains.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiUserConnectRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
