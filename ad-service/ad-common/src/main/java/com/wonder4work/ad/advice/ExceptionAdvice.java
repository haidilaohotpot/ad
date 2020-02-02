package com.wonder4work.ad.advice;

import com.wonder4work.ad.exception.AdException;
import com.wonder4work.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="https://github.com/haidilaohotpot">cheng</a>
 * @since 1.0.0 2020/1/26
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request,AdException ex) {

        CommonResponse<String> commonResponse = new CommonResponse<>(-1,"server error");
        commonResponse.setData(ex.getMessage());

        return commonResponse;
    }

}
