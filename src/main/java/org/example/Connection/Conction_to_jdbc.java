package org.example.Connection;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;


 public class Conction_to_jdbc {
        static Connection conn;
         public static Connection create(){
                 String driver="com.mysql.cj.jdbc.Driver";
                 String url="jdbc:mysql://localhost:3306/jdbc";
                 String username="root";
                 String pass="";

                 try {
                         Class.forName(driver);
                          conn= DriverManager.getConnection(url,username,pass);
                         System.out.println("*** JAVA====>>Connected===>>JDBC ***");

                 }catch (Exception e){
                         e.printStackTrace();
                 }
                 return conn;
         }




    }

