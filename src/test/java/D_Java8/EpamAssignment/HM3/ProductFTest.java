package D_Java8.EpamAssignment.HM3;

import D_Java8.EpamAssignment.HM2.ProductCategory;
import D_Java8.EpamAssignment.HM2.ProductGrade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class ProductFTest {
    ProductFTest productFTest;
    private static final Logger logger =  LogManager.getLogger(ProductFTest.class.getName());

    @BeforeTest
    void setUp(){
         productFTest = new ProductFTest();
    }


    @DataProvider(name = "ProductFTestData")
    public Object[] ProductFTestData(){
        return new Object[] {
                new ProductF[]{
                                new ProductF("Product1", ProductCategory.ELECTRONICS, ProductGrade.A, 2000.22),
                                new ProductF("Product2", ProductCategory.ELECTRONICS, ProductGrade.A, 152.12),

                                new ProductF("Product3", ProductCategory.ELECTRONICS, ProductGrade.B, 80.02),
                                new ProductF("Product4", ProductCategory.ELECTRONICS, ProductGrade.B, 1909.99),


                                new ProductF("Product5", ProductCategory.OTHERS, ProductGrade.A, 650.00),
                                new ProductF("Product6", ProductCategory.OTHERS, ProductGrade.B, 7200.00),

                                new ProductF("Product7", ProductCategory.OTHERS, ProductGrade.B, 300.00),
                                new ProductF("Product8", ProductCategory.OTHERS, ProductGrade.B, 929.99)
                }
        };
    }

/*    public List<String> getProductF(Predicate<ProductF> predicate, ProductF[] productF){
        List<String> list = new ArrayList<>();
        for(ProductF p : productF){
            if(predicate.test(p)){
                list.add(p.getProductName());
            }
        }return list;
    }*/

    @Test(dataProvider = "ProductFTestData")
    private void testTotalCost(ProductF[] productF){
       Function<ProductF[], Double> doublePrice = productFs->{
            double sum =0;
            for(ProductF productF1 : productFs){
                sum = sum + productF1.getProductPrice();
                System.out.println(sum);
            }
          return sum;
        };
       logger.info("total sum :" + doublePrice.apply(productF));
    }


    @Test(dataProvider = "ProductFTestData")
    private void testTotalCostGreaterThen1000(ProductF[] productF){
        Function<ProductF[] , Double> TotalCostGreaterThen1000 =
        p->{
            double total = 0;
            for(ProductF productF1 : p){
                if(productF1.getProductPrice()>1000){
                    total = total + productF1.getProductPrice();
                }
            }
            return total;
        };
        logger.info("TotalCostGreaterThen1000 : " + TotalCostGreaterThen1000.apply(productF));
    }


    @Test(dataProvider = "ProductFTestData")
    private void costOfAllElectronicProducts(ProductF[] productFS){
       Function<ProductF[], Double> AllElectronicProducts = p1->{
            double sum1 = 0;
            for(ProductF productF1 : p1 ){
                if(productF1.getProductCategory().equals(ProductCategory.ELECTRONICS)){
                    sum1 = sum1 + productF1.getProductPrice();
                }
            }
           return sum1;
       };
       logger.info("costOfAllElectronicProducts : " +AllElectronicProducts.apply(productFS) );
    }

    @Test(dataProvider = "ProductFTestData")
    private void allElectronicProductsCostGreaterThen1000(ProductF[] productFS){
        Function<ProductF[], Double> AllElectronicProductCostGreaterThen1000 = p1->{
            double sum1 = 0;
            for(ProductF productF1 : p1 ){
                if(productF1.getProductCategory().equals(ProductCategory.ELECTRONICS) && productF1.getProductPrice()>1000){
                    sum1 = sum1 + productF1.getProductPrice();
                }
            }
            return sum1;
        };
        logger.info("costOfAllElectronicProducts : " +AllElectronicProductCostGreaterThen1000.apply(productFS) );
    }


}