package ru.rusya.dao;

import org.springframework.stereotype.Component;
import ru.rusya.models.Person;
import ru.rusya.models.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDao {
    private static final String URL = "jdbc:postgresql://localhost:5432/testtask";
    private static final String USERNAME = "postgres";
    private static final String PWD = "12357tr";
    private static int PEOPLE_COUNT = 0;
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME,PWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public List<Service> index() throws SQLException {

        List<Service> services = new ArrayList<>();
        Statement statement = connection.createStatement();
        String sql = "select * from services";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            Service service = new Service();
            service.setId(resultSet.getInt("id"));
            service.setName(resultSet.getString("name"));
            services.add(service);
        }
        return services;
    }

//    public Person show(int id){
//        return .stream().
//                filter(person -> person.getId() == id ).
//                findAny().orElse(null);
//    }
//
//    public void save(Person person) {
//        person.setId(++PEOPLE_COUNT); // setting autoincremented id
//        this.people.add(person);
//    }
}

