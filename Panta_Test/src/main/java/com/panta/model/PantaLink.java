package com.panta.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("panta_link")
public class PantaLink {

    @TableId
    private int id;

    @TableField(fill = FieldFill.INSERT)
    private String name;
    private int number;
    private String linkAddress;
    private String imgAddress;

}
