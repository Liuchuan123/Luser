package cn.itcast.utils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @program: ssm-crud
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-12 19:23
 **/
public   class Client{
    /**
    * @Description:
    * @Param:
    * @return:
    * @Author: Mr.Liu
    * @Date: 2018/12/13
    */

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( getValue( 2 ) );
    }
}
