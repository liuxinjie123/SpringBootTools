package com.crazy.dream.common.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {
    public String returnCode;
    public String returnMsg;
    public Page page;
    public T data;

    public Result setReturnCode(String code) {
        this.returnCode = code;
        return this;
    }

    public Result setReturnMsg(String msg) {
        this.returnMsg = msg;
        return this;
    }

    public Result setPage(Page page) {
        this.page = page;
        return this;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public static Result setCode(String code) {
        return new Result().setReturnCode(code);
    }

    public static Result setCodeMsg(String code, String msg) {
        return new Result().setReturnCode(code).setReturnMsg(msg);
    }
}
