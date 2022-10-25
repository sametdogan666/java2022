package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.List;

public class CourseManager implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
        }

        for (Course checkCourse : courses) {
            if (checkCourse.getName().equals(course.getName())) {
                throw new Exception("Bu kurs mevcut. Lütfen tekrar deneyiniz.");
            }
        }
        courseDao.add(course);
        for (Logger logger: loggers){
            logger.log(course.getName());
        }

    }
}
