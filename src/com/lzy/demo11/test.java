package com.lzy.demo11;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy");
        String format = sf.format(date);
        Date date1 = sf.parse("2019-11-22 16:25:14");
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.MONTH));




    }
}


