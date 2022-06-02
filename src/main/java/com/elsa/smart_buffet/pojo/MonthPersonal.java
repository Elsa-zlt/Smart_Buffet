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
@TableName("month_personal")
public class MonthPersonal implements Serializable {

    @TableId
    @JsonProperty(value = "mpId")
    private Integer mpId;

    @JsonProperty(value = "mpCalorie")
    private Double mpCalorie;

    @JsonProperty(value = "mpExpend")
    private Double mpExpend;

}