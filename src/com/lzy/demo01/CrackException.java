package com.lzy.demo01;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author lzy
 * @version 1.0
 */
public class CrackException extends RuntimeException {
    private Date date = new Date();

    @Override
    public String getMessage() {
        return date.toString() + "出现异常";

    }


}
