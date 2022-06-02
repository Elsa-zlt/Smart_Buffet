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
@TableName("day_menu")
public class DayMenu implements Serializable {

    @JsonProperty(value = "did")
    private Integer dId;

    @JsonProperty(value = "mid")
    private Integer mId;

    @JsonProperty(value = "name")
    private String mName;

    @JsonProperty(value = "num")
    private Integer dmNum;

    @JsonProperty(value = "income")
    private Double dmIncome;

    @JsonProperty(value = "expand")
    private Double dmExpand;

    @JsonProperty(value = "profit")
    private Double dmProfit;

}