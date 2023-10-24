package org.example;

public class Main {
    public static void main(String[] args)
    {
        String name ="Vade oranı";
                //set value=değer atamak
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

                //get value=değeri okumak
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("SMEG Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(5500);
        product3.setUnitsInStock(1);
        product3.setImageUrl("image3.jpg");


        //Product data type veri vermem gerekir.
        Product[] products ={product1,product2,product3};

        for (Product product : products)
        {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("0599999999");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Nida");
        individualCustomer.setLastName("Kasap");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodluyorum");
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        //individual ve corporate customer, customer'e extend edildiği için
        //customer type altında listelenebildi.

        Customer[] customer = {individualCustomer,corporateCustomer};

    }
}