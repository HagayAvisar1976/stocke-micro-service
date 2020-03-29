package com.stock.micro.service.stockemicroservice.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


@ApiModel(description = "this is the model")
public class Stock {

    @ApiModelProperty(notes = "this is the model property")
    private String id;
    private int value;
    private Date valueDate;

    public Stock() {

    }

    public Stock(String id, int value, Date valueDate) {
        this.id = id;
        this.value = value;
        this.valueDate = valueDate;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", value=" + value +
                ", valueDate=" + valueDate +
                '}';
    }
}
