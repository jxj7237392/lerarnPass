package cn.jxj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 用户表
 * @author: 19040179
 * @date: 2020年12月11日
 */
@Data
@TableName("order_test")
public class OrderTest implements Serializable {
    /** 主键id */
    @TableId(type= IdType.AUTO)
    private Integer id;
    /** 名称 */
    private String name;

}