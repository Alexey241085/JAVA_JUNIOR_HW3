package org.example;

import java.sql.*;

public class Db {

    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "berkut1985";

    public  static void con (){
        try (Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD)){
            Statement statement = con.createStatement();
            statement.execute("DROP SCHEMA `homework3`");
            statement.execute("CREATE SCHEMA `homework3`");
            statement.execute("""
                 CREATE TABLE `homework3`.`student`
                 (`id` INT NOT NULL DEFAULT  0,
                 `firaname` VARCHAR(30) NULL,
                 `secondname` VARCHAR(30) NULL,
                 `age` INT,
                 PRIMARY KEY (`id`));""");


        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void insertStudent(){
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)){
        Statement statement = connection.createStatement();
        statement.execute("""

                INSERT INTO `homework3`.`student` 
                (id, firaname, secondname, age) VALUES
                 (1, 'Ivan', 'Kalinin', 23),
                 (2, 'Nikolay', 'Shashkov', 21),
                 (3, 'Valeriy', 'Pedhkov', 26),
                 (4, 'Alexey', 'Ivanov', 26)
                """);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static void removeStudent(){
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)){
            Statement statement = connection.createStatement();
            statement.execute("""
                DELETE FROM `homework3`.`student` WHERE firaname = 'Nikolay';
                """);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static void printRes(){
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)){
            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT * FROM `homework3`.`student`");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firaName = resultSet.getNString("firaname");
                String secondName = resultSet.getNString("secondname");
                int age = resultSet.getInt("age");

                System.out.println("id = " + id + ", firaName " + firaName + ", secondName " + secondName + ", age " + age);
            }


        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }



}
















