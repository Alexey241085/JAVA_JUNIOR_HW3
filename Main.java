package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {




    Db.con();
    Db.insertStudent();
    Db.printRes();
        System.out.println();
    Db.removeStudent();
    Db.printRes();



    }
}