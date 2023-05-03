package com.example.taelogin.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username; // kakao_2774224107
    private String password; // UUID
    private String email; // taeheoki@naver.com
    private String provider; // me, kakao, naver
}
