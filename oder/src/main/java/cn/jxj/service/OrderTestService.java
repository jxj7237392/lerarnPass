package cn.jxj.service;

import cn.jxj.entity.OrderTest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @description: 用户表
 * @author: 19040179
 * @date: 2020年12月11日
 */
public interface OrderTestService extends IService<OrderTest> {
    void saveOrder();
}