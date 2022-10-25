package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veri tabanına eklendi: " + category.getCategoryName());
    }
}
