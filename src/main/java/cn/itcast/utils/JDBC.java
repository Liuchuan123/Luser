package cn.itcast.utils;

import java.sql.*;

/**
 * @program: ssm-crud
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-13 08:34
 **/
public class JDBC {


    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/springmvc" ,"root","123456");
//            String sql = ;
            preparedStatement = connection.prepareStatement( "select * from user where id =?" );
            preparedStatement.setInt(1,2);
//            preparedStatement.setString(2,"123456");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+"==="+resultSet.getString( "username" ));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}