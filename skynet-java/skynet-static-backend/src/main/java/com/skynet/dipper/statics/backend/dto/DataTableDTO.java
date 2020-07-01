package com.skynet.dipper.statics.backend.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;
}
