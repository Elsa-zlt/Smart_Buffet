package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("day")
public class Day implements Serializable {

    @TableId
    @JsonProperty(value = "id")
    private Integer dId;

    @JsonProperty(value = "income")
    private Double dIncome;

    @JsonProperty(value = "expend")
    private Double dExpend;

    @JsonProperty(value = "profit")
    private Double dProfit;

}