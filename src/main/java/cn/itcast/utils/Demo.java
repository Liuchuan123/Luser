package cn.itcast.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

/**
 * @program: ssm-crud
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-12 14:06
 **/
public class Demo {

    String str = new String("good");

    String[] ch = { "a", "b", "c" };

    public static void main(String args[]) {

        Demo ex = new Demo();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");

        System.out.print(ex.ch[0]);

    }

    public void change(String str, String[] ch) {

        str = new String("test ok");

        ch= new String[]{"b", "c", "c"};

    }
}