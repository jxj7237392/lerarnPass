package cn.jxj.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: jxj
 * @Date: 2020/12/11 14:44
 */
@Data
public class Order {
    private Integer id;
    private Integer goodId;
    private BigDecimal money;
    private String orderNo;
    private String remark;
}
