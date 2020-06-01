package com.github.wx.api;

import com.github.wx.domain.GetAccessTokenResponse;
import com.github.wx.result.Code2SessionRequest;
import com.github.wx.result.Code2SessionResponse;

import java.io.IOException;

public interface BaseRest {
    Code2SessionResponse code2Session(Code2SessionRequest request) throws IOException;

    GetAccessTokenResponse getAccessToken() throws IOException;
}
