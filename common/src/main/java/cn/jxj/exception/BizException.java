package cn.jxj.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by jxj on 2018/3/20.
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class BizException extends RuntimeException {

    public BizException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public BizException( String msg) {
        this.msg = msg;
    }
    public BizException(String msg, Throwable throwable) {
        this.msg = msg;
        this.throwable = throwable;
    }

    private String code;
    private String msg;
    private Throwable throwable;
    private Object object;
}
