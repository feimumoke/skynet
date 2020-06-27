package com.skynet.dipper.statics.backend.dto;


import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class DataDTO<T> implements Serializable {
    private int code;
    private T data;
    private String error;
}
