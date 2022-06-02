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
@TableName("history")
public class History implements Serializable {

    @JsonProperty(value="cId")
    private Integer cId;

    @JsonProperty(value="hHistory")
    private String hHistory;

}