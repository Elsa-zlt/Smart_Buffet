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
@TableName("year")
public class Year implements Serializable {

    @TableId
    @JsonProperty(value ="yId")
    private Integer yId;

    @JsonProperty(value ="yIncome")
    private Double yIncome;

    @JsonProperty(value ="yExpend")
    private Double yExpend;

    @JsonProperty(value ="yProfit")
    private Double yProfit;

}