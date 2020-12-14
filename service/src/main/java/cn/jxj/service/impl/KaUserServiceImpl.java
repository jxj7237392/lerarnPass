package cn.jxj.service.impl;

import cn.jxj.dao.KaUserMapper;
import cn.jxj.entity.KaUser;
import cn.jxj.service.KaUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @description: 用户表
 * @author: 19040179
 * @date: 2020年12月11日
 */
@Service
public class KaUserServiceImpl extends ServiceImpl<KaUserMapper,KaUser> implements KaUserService {

}