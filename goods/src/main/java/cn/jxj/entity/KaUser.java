package cn.jxj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * @description: 用户表
 * @author: 19040179
 * @date: 2020年12月11日
 */
@Data
@TableName("ka_user")
public class KaUser implements Serializable {
    /** 主键id */
    @TableId(type= IdType.AUTO)
    private Integer id;
    /** 名称 */
    private String name;
    /** 账号、工号、登录名 */
    private String account;
    /** 头像 */
    private String headPhoto;
    /** 密码 */
    private String password;
    /** token */
    private String token;
    /** 校验码 */
    private String sysUserKey;
    /** 手机 */
    private String phone;
    /** 性别
(1男 、0女) */
    private Integer gender;
    /** 生日 */
    private String birthday;
    /** 邮箱 */
    private String email;
    /** 登录时间 */
    private Date loginTime;
    /** 登录ip */
    private String loginIp;
    /** 是否登陆，1是，0否 */
    private Integer isLogin;
    /** 存入用户 */
    private String createdBy;
    /** 创建时间 */
    private Date createdTime;
    /** 更新用户 */
    private String updatedBy;
    /** 更新时间 */
    private Date updatedTime;
    /** 0 未启用 1 已启用 2已锁定 */
    private Integer status;
    /** 是否删除 1是 0否 */
    @TableLogic
    private Integer deleted;
    /** 版本号 */
    private Integer version;

}