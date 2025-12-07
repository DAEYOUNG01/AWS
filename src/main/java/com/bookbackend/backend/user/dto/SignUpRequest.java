package com.bookbackend.backend.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String loginId;   // 아이디
    private String password;  // 비밀번호
    private String name;      // 이름
}
