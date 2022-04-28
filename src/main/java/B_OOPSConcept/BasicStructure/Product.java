package B_OOPSConcept.BasicStructure;

public class Product {

    private String product;
    private int productNumber;


    public Product(String product,int productNumber ){
        this.product =product;
        this.productNumber =productNumber;
    }

/*
    public Product(String p1, ProductCategory electronics, ProductGrade a, double v) {
    }
*/

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", productNumber=" + productNumber +
                '}';
    }

    public static void main(String [] args){

        int x = 10;
        String z = "1";

        String s = Integer.toString(x);
        String s1 = String.valueOf(x);

        int m = Integer.parseInt(z);
        Integer m1 = Integer.valueOf(z);

        System.out.println(s +" " + s1 + " " + m +" " + m1);
    }


}
