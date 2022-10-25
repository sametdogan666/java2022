package business.concretes;

import business.abstracts.LecturerService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.LecturerDao;
import entities.concretes.Lecturer;

public class LecturerManager implements LecturerService {

    private LecturerDao lecturerDao;
    private Logger[] loggers;

    public LecturerManager(LecturerDao lecturerDao, Logger[] loggers) {
        this.lecturerDao = lecturerDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Lecturer lecturer) {
        lecturerDao.add(lecturer);
        for (Logger logger: loggers){
            logger.log(lecturer.getFirstName());
        }
    }
}
