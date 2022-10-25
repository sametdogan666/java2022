package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ilev veri tabanına eklendi: " + course.getName());
    }
}
