package business.abstracts;

import entities.concretes.Course;

public interface CourseService {
    void add(Course course) throws Exception;
}
