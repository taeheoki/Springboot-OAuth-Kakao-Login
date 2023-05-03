package com.example.taelogin.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KakaoToken {
    private String accessToken;
    private String tokenType;
    private String refreshToken;
    private Integer expiresIn;
    private String scope;
    private Integer refreshTokenExpiresIn;
}
