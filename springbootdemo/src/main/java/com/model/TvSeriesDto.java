package com.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author 张明亮
 * @date 2018/10/8 17:02
 */
public class TvSeriesDto {
    private int id;
    private String name;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date date;

    public TvSeriesDto(int id, String name,Date date) {
        this.id = id;
        this.name = name;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
