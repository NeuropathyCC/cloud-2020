package com.emon.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Author:   cafe babe
 * Date:     3/7/20 6:25 PM
 * Description:
 * History:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}


