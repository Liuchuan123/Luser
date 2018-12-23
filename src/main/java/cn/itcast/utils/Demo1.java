package cn.itcast.utils;

/**
 * @program: ssm-crud
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-12 16:02
 **/
public final class Demo1 {
    String name;

    public Demo1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "name='" + name + '\'' +
                '}';
    }
}