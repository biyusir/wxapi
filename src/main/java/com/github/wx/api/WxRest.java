package com.github.wx.api;

import com.github.wx.result.Code2SessionRequest;
import com.github.wx.result.Code2SessionResponse;

import java.io.IOException;

public interface WxRest {

    Code2SessionResponse code2Session(Code2SessionRequest request) throws IOException;
}
