package com.kabarxx.store_example.domain.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO
{
    private Long id;
    private String username;
    private String email;
    private String role;
}
