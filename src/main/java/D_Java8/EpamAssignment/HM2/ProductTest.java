package D_Java8.EpamAssignment.HM2;

public class ProductTest {


   private String productName;
   private ProductCategory productCategory;
   private ProductGrade productGrade;
   private double productPrice;

    public ProductTest(String productName, ProductCategory productCategory, ProductGrade productGrade, double productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productGrade = productGrade;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductGrade getProductGrade() {
        return productGrade;
    }

    public void setProductGrade(ProductGrade productGrade) {
        this.productGrade = productGrade;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductTest{" +
                "productName='" + productName + '\'' +
                ", productCategory=" + productCategory +
                ", productGrade=" + productGrade +
                ", productPrice=" + productPrice +
                '}';
    }
}
