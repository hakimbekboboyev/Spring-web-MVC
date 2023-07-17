package org.example.controller.database;

import org.example.controller.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    String URL = "jdbc:postgresql://localhost:5432/student";



    String user = "postgres";
    String password = "1";

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addStudent(Student student){
        String query = "insert into students(fullName,age,phoneNumber) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,student.getFullName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.setString(3,student.getPhoneNumber());
            boolean execute = preparedStatement.execute();
            return execute;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> listStudent(){
        List<Student> studentList = new ArrayList<>();
        Student student;
        String query = "select * from students";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("fullName");
                int age = resultSet.getInt("age");
                String phoneNumber = resultSet.getString("phoneNumber");
                student = new Student(id,fullName,age,phoneNumber);
                studentList.add(student);
            }
            return studentList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
