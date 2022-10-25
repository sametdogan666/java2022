package dataAccess.concretes.jdbc;

import dataAccess.abstracts.LecturerDao;
import entities.concretes.Lecturer;

public class JdbcLecturereDao implements LecturerDao {
    @Override
    public void add(Lecturer lecturer) {
        System.out.println("JDBC ile veri tabanına eklendi: " + lecturer.getFirstName() + " " + lecturer.getLastName());
    }
}
