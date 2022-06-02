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
@TableName("day_personal")
public class DayPersonal implements Serializable {

    @TableId
    @JsonProperty(value = "dpId")
    private Integer dpId;

    @JsonProperty(value = "dpCalorie")
    private Double dpCalorie;

    @JsonProperty(value = "dpExpend")
    private Double dpExpend;

}