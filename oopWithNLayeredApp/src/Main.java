import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone Xr", 10000);

       Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};

        ProductManager productManager =  new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}