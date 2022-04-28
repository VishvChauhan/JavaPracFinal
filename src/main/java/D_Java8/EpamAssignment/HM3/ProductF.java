package D_Java8.EpamAssignment.HM3;

import D_Java8.EpamAssignment.HM2.ProductCategory;
import D_Java8.EpamAssignment.HM2.ProductGrade;

public class ProductF {

    String productName;
    ProductCategory productCategory;
    ProductGrade productGrade;
    Double productPrice;

    public ProductF(String productName, ProductCategory productCategory, ProductGrade productGrade, Double productPrice) {
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

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }


    @Override
    public String toString() {
        return "ProductF{" +
                "productName='" + productName + '\'' +
                ", productCategory=" + productCategory +
                ", productGrade=" + productGrade +
                ", productPrice=" + productPrice +
                '}';
    }
}
