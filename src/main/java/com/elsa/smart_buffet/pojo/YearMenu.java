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
@TableName("year_menu")
public class YearMenu implements Serializable {

    @JsonProperty(value ="yId")
    private Integer yId;

    @JsonProperty(value ="mId")
    private Integer mId;

    @JsonProperty(value ="mName")
    private String mName;

    @JsonProperty(value ="ymNum")
    private Integer ymNum;

    @JsonProperty(value ="ymIncome")
    private Double ymIncome;

    @JsonProperty(value ="ymExpand")
    private Double ymExpand;

    @JsonProperty(value ="ymProfit")
    private Double ymProfit;

}