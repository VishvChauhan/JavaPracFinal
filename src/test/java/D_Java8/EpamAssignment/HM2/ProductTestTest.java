package D_Java8.EpamAssignment.HM2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductTestTest {

    ProductTestTest productTestTest;
    private static final Logger logger = LogManager.getLogger(ProductTestTest.class.getName());

    @BeforeTest
    public void setUp() {
        productTestTest = new ProductTestTest();
    }


    @DataProvider(name = "ProductTestData")
    public Object[] ProductTestD()
        {
               return new Object[]
                    {
                                new ProductTest[]
                                        {
                                                new ProductTest("Product1", ProductCategory.ELECTRONICS, ProductGrade.A, 2000.22),
                                                new ProductTest("Product2", ProductCategory.ELECTRONICS, ProductGrade.A, 152.12),

                                                new ProductTest("Product3", ProductCategory.ELECTRONICS, ProductGrade.B, 80.02),
                                                new ProductTest("Product4", ProductCategory.ELECTRONICS, ProductGrade.B, 1909.99),


                                                new ProductTest("Product5", ProductCategory.OTHERS, ProductGrade.A, 650.00),
                                                new ProductTest("Product6", ProductCategory.OTHERS, ProductGrade.B, 7200.00),

                                                new ProductTest("Product7", ProductCategory.OTHERS, ProductGrade.B, 300.00),
                                                new ProductTest("Product8", ProductCategory.OTHERS, ProductGrade.B, 929.99)
                                        }
                    };
        }


            @DataProvider(name = "Responses")
            public Object[] dataResponses() {
                return new Object[]{
                        new Response[]{
                                new Response("R1", ResponseStatusCode.STATUS_CODE_200, ResponseType.HTML),
                                new Response("R2", ResponseStatusCode.STATUS_CODE_400, ResponseType.JSON),

                                new Response("R3", ResponseStatusCode.STATUS_CODE_500, ResponseType.XML),
                                new Response("R4", ResponseStatusCode.STATUS_CODE_500, ResponseType.JSON),


                                new Response("R5", ResponseStatusCode.STATUS_CODE_400, ResponseType.TXT),
                                new Response("R6", ResponseStatusCode.STATUS_CODE_200, ResponseType.TXT),

                                new Response("R7", ResponseStatusCode.STATUS_CODE_200, ResponseType.HTML),
                                new Response("R8", ResponseStatusCode.STATUS_CODE_400, ResponseType.HTML)
                        }
                };
            }


        private  List<String> getProduct(Predicate<ProductTest> predicate, ProductTest[] productTests){

            List<String> list = new ArrayList<>();
            for(ProductTest productTest : productTests){
                if(predicate.test(productTest)){
                    list.add(productTest.getProductName());
                    System.out.println(list);
                }
            }
            return list;
        }


        private List<String> getResponses(Predicate<Response> predicate, Response[] responses) {
            List<String> responseList = new ArrayList<>();
            for (Response response : responses) {
                if (predicate.test(response))
                    responseList.add(response.getResponseBody());
                System.out.println(responseList);
            }
            return responseList;
        }


/*
1. Define a predicate to check if the price of given product is greater than 1000/-. Print all the products from the given list of the products if the price is greater than 1000/-.
2. Define a predicate to check if the product is of electronics category. Print all the products from the given list of the products if the product is of electronics category.
3. Print all the products from the given list of product if the product price is greater than 100/- which are in electronics category.
4. Print all the products from the given list of product if the product price is greater than 100/- or product is in electronics category.
5. Print all the products from the given list of product if the product price is less than 100/- and product is in electronics category.

        */

       @Test(dataProvider ="ProductTestData", priority = 0)
        private void printProductWithPriceMoreThen1000(ProductTest[] productTests4){
        Predicate<ProductTest> predicate = productTest -> productTest.getProductPrice()>1000;
           logger.info(productTestTest.getProduct(predicate,productTests4 ));
        }

        @Test(dataProvider = "ProductTestData", priority = 1)
        private void printElectronicsCategoryProduct(ProductTest[] productTests){
        Predicate<ProductTest> predicate = productTest -> productTest.getProductCategory().equals(ProductCategory.ELECTRONICS);
        logger.info(productTestTest.getProduct(predicate,productTests));
        }

        @Test(dataProvider = "ProductTestData", priority = 2)
        private void printElectronicsCategoryProductAndWithPriceMoreThen100(ProductTest[] productTests){
        Predicate<ProductTest> predicate = productTest -> productTest.getProductCategory().equals(ProductCategory.ELECTRONICS);
        Predicate<ProductTest> predicate1 = productTest -> productTest.getProductPrice()>100;
        logger.info(productTestTest.getProduct(predicate.and(predicate1),productTests));
        }

        @Test(dataProvider = "ProductTestData", priority = 3)
        private void printElectronicsCategoryProducOrtWithPriceMoreThen100(ProductTest[] productTests){
        Predicate<ProductTest> predicate = productTest -> productTest.getProductCategory().equals(ProductCategory.ELECTRONICS);
        Predicate<ProductTest> predicate1 = productTest -> productTest.getProductPrice()>100;
        logger.info(productTestTest.getProduct(predicate.or(predicate1),productTests));
        }

        @Test(dataProvider = "ProductTestData", priority = 3)
        private void printElectronicsCategoryProducAndtWithPriceLessThen100(ProductTest[] productTests){
        Predicate<ProductTest> predicate = productTest -> productTest.getProductCategory().equals(ProductCategory.ELECTRONICS);
        Predicate<ProductTest> predicate1 = productTest -> productTest.getProductPrice()<100;
        logger.info(productTestTest.getProduct(predicate.and(predicate1),productTests));
        }


/*
6. Define a predicate to check if the status code is 400. Print all the responses with status code 400 from the given list of responses.
7. Define a predicate to check if the response type JSON. Print all the responses the response type JSON from the given list of responses.
*/


    @Test(dataProvider = "Responses")
    public void get400Responses(Response[] responses) {
        Predicate<Response> predicate = response -> response.getResponseStatusCode().equals(ResponseStatusCode.STATUS_CODE_400);
        logger.info(productTestTest.getResponses(predicate, responses));
    }

    @Test(dataProvider = "Responses")
    public void getJSONresponses(Response[] responses) {
        Predicate<Response> predicate = response -> response.getResponseType().equals(ResponseType.JSON);
        logger.info(productTestTest.getResponses(predicate, responses));
    }

    @Test(dataProvider = "Responses")
    public void get400JSONResponses(Response[] responses) {
        Predicate<Response> predicate = response -> response.getResponseStatusCode().equals(ResponseStatusCode.STATUS_CODE_400);
        Predicate<Response> predicate1 = response -> response.getResponseType().equals(ResponseType.JSON);
        logger.info(productTestTest.getResponses(predicate.and(predicate1), responses));
    }

    @Test(dataProvider = "Responses")
    public void get400orJSONResponses(Response[] responses) {
        Predicate<Response> predicate = response -> response.getResponseStatusCode().equals(ResponseStatusCode.STATUS_CODE_400);
        Predicate<Response> predicate1 = response -> response.getResponseType().equals(ResponseType.JSON);
        System.out.println(productTestTest.getResponses(predicate.or(predicate1), responses));
    }

    @Test(dataProvider = "Responses")
    public void getNot400JSONResponses(Response[] responses) {
        Predicate<Response> predicate = response -> response.getResponseStatusCode().equals(ResponseStatusCode.STATUS_CODE_400);
        Predicate<Response> predicate1 = response -> response.getResponseType().equals(ResponseType.JSON);
        logger.info(productTestTest.getResponses(predicate.negate().and(predicate1), responses));
    }


}