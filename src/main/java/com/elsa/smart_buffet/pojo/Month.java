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
@TableName("month")
public class Month implements Serializable {

    @TableId
    @JsonProperty(value = "monId")
    private Integer monId;

    @JsonProperty(value = "monIncome")
    private Double monIncome;

    @JsonProperty(value = "monExpend")
    private Double monExpend;

    @JsonProperty(value = "monProfit")
    private Double monProfit;

}