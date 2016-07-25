package com.example.stelar.snstest_withmvp;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Stelar on 2016-07-25.
 */
public class ApiResult {

    @JsonProperty("code")
    int code;
    @JsonProperty("message")
    String message;
    @JsonProperty("board_seq")
    int board_seq;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }
}
