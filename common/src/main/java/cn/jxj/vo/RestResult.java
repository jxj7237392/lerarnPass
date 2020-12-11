package cn.jxj.vo;

import cn.jxj.constant.ErrorCodeConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jxj
 */
@Data
public class RestResult<T> implements Serializable {
    private static final long serialVersionUID = -6254845219426574222L;
//    @ApiModelProperty(value = "是否成功")
    private boolean result;
//    @ApiModelProperty(value = "错误信息")
    private String message;
//    @ApiModelProperty(value = "返回编码")
    private String code;
//    @ApiModelProperty(value = "返回对象")
    private T object;

    public RestResult() {
    }

    /**
     *@描述
     *@参数  [result]
     *@返回值
     *@创建人  Alex.Chen
     *@创建时间
     *@修改人和其它信息
     */
    public RestResult(boolean result) {

        this.result = result;
    }

    /**
     *@描述
     *@参数  [result, message]
     *@返回值
     *@创建人  Alex.Chen
     *@创建时间
     *@修改人和其它信息
     */
    public RestResult(boolean result, String message) {

        this.result = result;
        this.message = message;
    }

    /**
     *@描述
     *@参数  [result, message, code]
     *@返回值
     *@创建人  Alex.Chen
     *@创建时间
     *@修改人和其它信息
     */
    public RestResult(boolean result, String message, String code) {
        this.result = result;
        this.message = message;
        this.code = code;
    }

    /**
     *@描述
     *@参数  [result, message, code ,object]
     *@返回值
     *@创建人  Alex.Chen
     *@创建时间
     *@修改人和其它信息
     */
    public RestResult(boolean result, String message, String code, T object) {
        this.result = result;
        this.message = message;
        this.code = code;
        this.object = object;
    }

    /**
     *@描述
     *@参数  []
     *@返回值  com.nflow.common.gateway.vo.RestResult
     *@创建人  Alex.Chen
     *@创建时间  2018/8/7
     *@修改人和其它信息
     */
    public static RestResult error() {
        return new RestResult(false, "", ErrorCodeConstant.S001);
    }

    /**
     *@描述
     *@参数  []
     *@返回值  com.nflow.common.gateway.vo.RestResult
     *@创建人  Alex.Chen
     *@创建时间  2018/8/7
     *@修改人和其它信息
     */
    public static RestResult success() {
        return new RestResult(true,"success","01");
    }

    /**
     *@描述
     *@参数  [code]
     *@返回值  com.nflow.common.gateway.vo.RestResult
     *@创建人  Alex.Chen
     *@创建时间  2018/8/7
     *@修改人和其它信息
     */
    public static RestResult success(String code) {
        RestResult restResult = success();
        restResult.setCode(code);
        return restResult;
    }

    public static RestResult success(Object data) {
        RestResult restResult = success();
        restResult.setObject(data);
        return restResult;
    }

    /**
     *@描述
     *@参数  [message]
     *@返回值  com.nflow.common.gateway.vo.RestResult
     *@创建人  Alex.Chen
     *@创建时间  2018/8/7
     *@修改人和其它信息
     */
    public static RestResult fail(String message) {
        return new RestResult(false, message);
    }

}
