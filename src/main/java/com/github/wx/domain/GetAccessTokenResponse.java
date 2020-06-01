package com.github.wx.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class GetAccessTokenResponse extends ErrorMsg {
    private String access_token;
    private String expires_in;
}
