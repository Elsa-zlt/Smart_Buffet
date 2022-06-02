package com.elsa.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("month_menu")
public class MonthMenu implements Serializable {

    @JsonProperty(value = "monId")
    private Integer monId;

    @JsonProperty(value = "mId")
    private Integer mId;

    @JsonProperty(value = "mName")
    private String mName;

    @JsonProperty(value = "mmNum")
    private String mmNum;

    @JsonProperty(value = "mmIncome")
    private Double mmIncome;

    @JsonProperty(value = "mmExpand")
    private Double mmExpand;

    @JsonProperty(value = "mmProfit")
    private Double mmProfit;

}