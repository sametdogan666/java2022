package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veri tabanına eklendi: " + category.getCategoryName());
    }
}
