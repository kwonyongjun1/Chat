package com.chat.vo;

import com.chat.util.ResultStatus;

import java.util.Map;

public class ResultVO {

    private ResultStatus status; // 일반적인 코드 분류 ( ex : SUCCESS, FAILED, .. )

    private Map<String, Object> data;

    public ResultVO isSuccess() {
        this.status = ResultStatus.SUCCESS;
        return this;
    }

    public ResultVO isFailed() {
        this.status = ResultStatus.FAILED;
        return this;
    }
}
