package cn.jxj.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.jxj.dao.orderTestMapper;
import cn.jxj.entity.OrderTest;
import cn.jxj.service.OrderTestService;
import cn.jxj.vo.OrderTestVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 用户表
 * @author: 19040179
 * @date: 2020年12月11日
 */
@Service
public class OrderTestServiceImpl extends ServiceImpl<orderTestMapper, OrderTest> implements OrderTestService {

    public static OrderTestVo apply(OrderTest orderTest) {
        OrderTestVo orderTestVo = new OrderTestVo();
        BeanUtil.copyProperties(orderTest,orderTestVo);
        return orderTestVo;
    }

    @Override
    @Transactional
    public void saveOrder() {
        OrderTest orderTest = new OrderTest();
        orderTest.setName("orderTest");
        save(orderTest);
    }
}