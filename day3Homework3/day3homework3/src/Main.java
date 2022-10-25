import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.LecturerManager;
import core.logging.abstracts.Logger;
import core.logging.concretes.DatabaseLogger;
import core.logging.concretes.FileLogger;
import core.logging.concretes.MailLogger;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import dataAccess.concretes.jdbc.JdbcCategoryDao;
import dataAccess.concretes.jdbc.JdbcLecturereDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category = new Category(1, "Web Programlama");
        List<Category> categories = new ArrayList<>();

        Lecturer lecturer = new Lecturer(1, "Engin", "Demirog", "Yazılım Geliştirici");

        Course course = new Course(1, "JAVA", "Yazılım Geliştirici Yetiştirme Kampı", "imageURL", 0);
        List<Course> courses = new ArrayList<>();


        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
        LecturerManager lecturerManager = new LecturerManager(new JdbcLecturereDao(), loggers);

        categoryManager.add(category);
        courseManager.add(course);
        lecturerManager.add(lecturer);
    }
}