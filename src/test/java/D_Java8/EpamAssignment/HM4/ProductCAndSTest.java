package D_Java8.EpamAssignment.HM4;


import D_Java8.EpamAssignment.HM2.ProductCategory;
import D_Java8.EpamAssignment.HM2.ProductGrade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductCAndSTest {

    private static final Logger logger = LogManager.getLogger(ProductCAndSTest.class.getName());

    ProductCAndSTest productCTest;

    @BeforeTest
    void setUp(){
        productCTest = new ProductCAndSTest();
    }

    @DataProvider(name = "ProductCTestData")
    public Object[] ProductCTestData(){
        return new Object[]{
                new ProductCAndS[]{
                        new ProductCAndS("Product1", ProductCategory.ELECTRONICS, ProductGrade.A, 2000.22),
                        new ProductCAndS("Product2", ProductCategory.ELECTRONICS, ProductGrade.A, 152.12),

                        new ProductCAndS("Product3", ProductCategory.ELECTRONICS, ProductGrade.B, 80.02),
                        new ProductCAndS("Product4", ProductCategory.ELECTRONICS, ProductGrade.B, 1909.99),


                        new ProductCAndS("Product5", ProductCategory.OTHERS, ProductGrade.A, 650.00),
                        new ProductCAndS("Product6", ProductCategory.OTHERS, ProductGrade.B, 7200.00),

                        new ProductCAndS("Product7", ProductCategory.OTHERS, ProductGrade.B, 300.00),
                        new ProductCAndS("Product8", ProductCategory.OTHERS, ProductGrade.B, 929.99)
                }
        };
    }

 /*   public void getProductC(Predicate<ProductCAndS> predicate, ProductCAndS[] productCS){
        List<String> list = new ArrayList<>();
        for(ProductCAndS productC : productCS){
            if(predicate.test(productC)){
                list.add(productC.getProductName());
            }
        }

    }*/


    @Test(dataProvider = "ProductCTestData")
    private void printTheProduct(ProductCAndS[] productCTests){
        Consumer<String> stringConsumer = (string) ->{
            if(string.equalsIgnoreCase("file")){
                File file = new File("consumer.txt");
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    for(ProductCAndS p : productCTests){
                        fileWriter.append(p.getProductName());
                    }
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else
            {
                for (ProductCAndS p : productCTests){
                    logger.info(p.getProductName());
                }
            }
        };stringConsumer.accept("");

    }


    @Test(dataProvider = "ProductCTestData")
    private void updateTheProductGrade(ProductCAndS[] productCTests){
        Consumer<ProductCAndS[]> consumer =
                p1->{
                    for(ProductCAndS productCAndS :p1){
                        if(productCAndS.getProductPrice()>1000){
                            productCAndS.setProductGrade(ProductGrade.PREMIUM);
                            logger.info(productCAndS.getProductName() + " : "+ productCAndS.getProductGrade() );
                        }
                    }
                };
        consumer.accept(productCTests);

    }


    @Test(dataProvider = "ProductCTestData")
    private void updateTheProductName(ProductCAndS[] productCTests){
        Consumer<ProductCAndS[]> consumer =
                p->{
                    for(ProductCAndS productCAndS :p){
                        if(productCAndS.getProductPrice()>3000){
                            productCAndS.setProductName(productCAndS.productName + "*");
                            logger.info(productCAndS.productName +"  :  "+ productCAndS.getProductPrice());
                        }
                    }
                };
        consumer.accept(productCTests);
    }



    @Test(dataProvider = "ProductCTestData")
    private void printThePremiumProduct(ProductCAndS[] productCTests){
        Consumer<ProductCAndS[]> consumer =
                p->{
                    for(ProductCAndS productCAndS :p){
                        if(productCAndS.getProductName().endsWith("*")){
                            logger.info(productCAndS.productName +"  :  "+ productCAndS.getProductGrade());
                        }
                    }
                };
        consumer.accept(productCTests);

    }

/*Supplier
    1. Write a supplier to produce a random product.
    2. Write a supplier to produce a random OTP.*/

    @Test
    public void randomProduct(){
       Supplier<ProductCAndS> productCAndSSupplier = ()->{
            return new ProductCAndS("Product10", ProductCategory.ELECTRONICS, ProductGrade.A, 2000.22);
        };
       logger.info(productCAndSSupplier.get().getProductName());
    }


    @Test
    public void generateOTP(){
      IntSupplier otpSupplier = ()->{
            return new Random().nextInt(9000000) +1000;
        };
        logger.info(otpSupplier.getAsInt());
    }


}