package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void add(Category category) throws Exception{
        for (Category checkCategory : categories) {
            if(checkCategory.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Bu kategori mevcut. Lütfen tekrar deneyiniz.");
            }
        }
        categoryDao.add(category);
        for (Logger logger: loggers){
            logger.log(category.getCategoryName());
        }
    }
}
