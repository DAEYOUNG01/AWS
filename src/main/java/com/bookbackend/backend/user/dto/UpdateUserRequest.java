package com.bookbackend.backend.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequest {
    private Long userId;
    private String loginId;   // 변경할 로그인 ID (nullable)
    private String password;  // 변경할 비밀번호 (nullable)
    private String name;      // 변경할 이름 (nullable)
}
