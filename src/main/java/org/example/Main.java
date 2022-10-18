package org.example;

import org.example.BusinessLogic.LogicQuerry;
import org.example.Model.StudentInfo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("#####################################");
            System.out.println("Enter your choice");
            System.out.println("1 for insert new data");
            System.out.println("2 for delete data");
            System.out.println("3 for Display data");
            System.out.println("4 for Exit");
            System.out.println("#####################################");

            int choice=Integer.parseInt(br.readLine());
            if (choice == 1) {
                //add

                System.out.println("Enter your name");
                String name= br.readLine();
                System.out.println("Enter your department");
                String deprt=br.readLine();
                System.out.println("Enter your contact number");
                String phone=br.readLine();



                StudentInfo info=new StudentInfo(name,deprt,phone);
               boolean ans= LogicQuerry.Addition(info);
               if (ans){
                   System.out.println("Inserted sucessfully");
               }else {
                   System.out.println("Something went wrong");
               }

            } else if (choice == 2) {
                //delete
                System.out.println("Enter row id");
                int rowid=Integer.parseInt(br.readLine());
            }
            else if (choice==3) {
                // display table
                  LogicQuerry.Display();
            }
           else if (choice==4){
               break;
            }
           else {
                System.out.println("Invalid input");
            }
        }

    }
}