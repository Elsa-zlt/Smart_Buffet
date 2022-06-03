package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@TableName("order_com")
public class Order implements Serializable {

    @TableId
    @JsonProperty(value ="oId")
    private String oId;

    @JsonProperty(value ="cId")
    private Integer cId;

    @JsonProperty (value="oTime")
    private Date oTime;

    @JsonProperty("oTotalPrice")
    private Double oTotalPrice;

    @JsonProperty("oStatus")
    private Integer oStatus;

    public Order() {
        this.oTime = new Date();
    }

}