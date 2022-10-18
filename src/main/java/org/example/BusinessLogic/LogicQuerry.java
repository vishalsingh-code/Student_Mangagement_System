package org.example.BusinessLogic;

import org.example.Connection.Conction_to_jdbc;
import org.example.Model.StudentInfo;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.sql.*;

public class LogicQuerry {

    public static boolean Addition(StudentInfo info) {
        boolean f=false;
        try {
            Connection conn= Conction_to_jdbc.create();
            String querry="INSERT INTO student (sname,sdeprt,scontact) VALUES (?,?,?)";
             PreparedStatement preparedStatement =conn.prepareStatement(querry);
             preparedStatement.setString(1, info.getSname());
             preparedStatement.setString(2, info.getSdeprt());
             preparedStatement.setString(3, info.getScontact());
             preparedStatement.executeUpdate();
             f=true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return f;
    }

    public static void Display() throws SQLException {
        Connection conn=Conction_to_jdbc.create();
        String disQuerry="select * from student";
        Statement st= conn.createStatement();
        ResultSet rs= st.executeQuery(disQuerry);

        while (rs.next()){

           int id= Integer.parseInt(rs.getString(1));
           String sname=rs.getString(2);
           String sdepart=rs.getString(3);
           String sconnt=rs.getString(4);
            System.out.println("_________________________________________");
           System.out.println(id +"|"+ sname +" |"+ sdepart +" |"+sconnt);
            System.out.println("_________________________________________");


        }
    }
}
