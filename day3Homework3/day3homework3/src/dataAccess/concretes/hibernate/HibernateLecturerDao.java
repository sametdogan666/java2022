package dataAccess.concretes.hibernate;

import dataAccess.abstracts.LecturerDao;
import entities.concretes.Lecturer;

public class HibernateLecturerDao implements LecturerDao {
    @Override
    public void add(Lecturer lecturer) {
        System.out.println("Hibernate ile veri tabanına eklendi: " +lecturer.getFirstName() + " "+ lecturer.getLastName());
    }
}
