package cn.jxj.exception;

import cn.jxj.vo.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jxj
 * @date 2019/9/6
 */
@ControllerAdvice
@Slf4j
@ResponseBody
public class BizExceptionHandler {

    @ExceptionHandler(BizException.class)
    public RestResult handleBizException(BizException e) {
        log.error(e.getMsg(), e);
        RestResult response = RestResult.error();
        response.setMessage(e.getMsg());
        response.setCode(e.getCode());
        response.setObject(e.getObject());
        return response;
    }

//    @ExceptionHandler(Exception.class)
//    public RestResult handleException(Exception e) {
//        RestResult response = RestResult.error();
//        response.setMessage(e.getMessage());
//        return response;
//    }

    /*@ExceptionHandler(value = {FeignException.class})
    public RestResult handleFeignException(FeignException e) {
        log.error(e.getMessage(), e);
        RestResult restResult = RestResult.error();
        restResult.setMessage(e.getMessage());
        restResult.setCode(String.valueOf(e.status()));
        return restResult;
    }

    @ExceptionHandler(value = {ClientException.class})
    public RestResult handleClientException(ClientException e) {
        log.error(e.getMessage(), e);
        RestResult restResult = RestResult.error();
        restResult.setCode(String.valueOf(e.getErrorCode()));
        restResult.setMessage(e.getMessage());
        restResult.setObject(e.getErrorObject());
        return restResult;
    }*/


}
