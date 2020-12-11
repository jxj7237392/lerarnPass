package cn.jxj.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: jxj
 * @Date: 2020/12/11 14:44
 */
@Data
public class Good {
    private Integer id;
    private Integer orderId;
    private BigDecimal price;
    private String description;
}
