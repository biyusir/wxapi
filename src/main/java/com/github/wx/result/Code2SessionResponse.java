package com.github.wx.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Code2SessionResponse {
    private String openId;
    private String sessionKey;
    private String unionId;
    private String errcode;
    private String grantType;
}
