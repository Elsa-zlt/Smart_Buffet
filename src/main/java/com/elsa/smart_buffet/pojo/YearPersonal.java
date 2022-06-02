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
@TableName("year_personal")
public class YearPersonal implements Serializable {

    @TableId
    @JsonProperty(value ="ypId")
    private Integer ypId;

    @JsonProperty(value ="ypCalorie")
    private Double ypCalorie;

    @JsonProperty(value ="ypExpend")
    private Double ypExpend;

}