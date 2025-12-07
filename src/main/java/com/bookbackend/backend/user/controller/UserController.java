package com.bookbackend.backend.user.controller;

import com.bookbackend.backend.user.dto.*;
import com.bookbackend.backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // 회원가입
    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<SignUpResponse>> signup(
            @RequestBody SignUpRequest request
    ) {
        SignUpResponse response = userService.signup(request);

        return ResponseEntity.ok(
                new ApiResponse<>("success", "회원가입 성공", response)
        );
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> login(
            @RequestBody LoginRequset request
    ) {
        LoginResponse response = userService.login(request);

        return ResponseEntity.ok(
                new ApiResponse<>("success", "로그인 성공", response)
        );
    }

    // 회원정보 수정
    @PutMapping("/update")
    public ResponseEntity<ApiResponse<UpdateUserResponse>> updateUser(
            @RequestBody UpdateUserRequest request
    ) {
        UpdateUserResponse response = userService.updateUser(request);

        return ResponseEntity.ok(
                new ApiResponse<>("success", "회원 정보 수정 성공", response)
        );
    }

    // 회원 탈퇴
    @DeleteMapping("/resign")
    public ResponseEntity<ApiResponse<ResignResponse>> resign(
            @RequestBody ResignRequest request
    ) {
        ResignResponse response = userService.resign(request);

        return ResponseEntity.ok(
                new ApiResponse<>("success", "회원 탈퇴 성공", response)
        );
    }
}
