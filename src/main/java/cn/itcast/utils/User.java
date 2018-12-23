package cn.itcast.utils;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: ssm-crud
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-13 08:30
 **/
public final class User {
    public String s;
    public Integer i;
    public NULL aNull;
    public Demo1 demo1;

    private User(String s,Integer i) {
        this.s=s;
        this.i=i;
    }

    public void change(NULL aNull,String s,Demo1 demo1,Integer i){
        aNull.name="fsa";
        s.replace('z','x');
        demo1.name="demo2";
        i=3;
    }

    @Override
    public String toString() {
        return "User{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", aNull=" + aNull +
                ", demo1=" + demo1 +
                '}';
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        User user = new User("zxy",1);
        User user1 = user;
        user.aNull=new NULL( "123" );
        user.demo1=new Demo1("demo1");
        System.out.println(user);
        user.change(user.aNull,user.s,user.demo1,user.i);
        System.out.println(user);
//        byte[] bytes = new byte[5];
//        String s = new String(bytes,"utf-8");
//        Long.parseLong(s);
//        Integer.parseInt(s);
        System.out.println(user==user1);
        Set set = new HashSet();
        set.add(null);
        set.add(null);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int i = 022;
        System.out.println(i);

    }
}