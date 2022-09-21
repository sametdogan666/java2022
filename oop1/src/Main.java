public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05300010101");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Samet");
        individualCustomer.setLastName("DOGAN");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("123123");
        corporateCustomer.setPhone("05300000202");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("12345678910");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }
}
