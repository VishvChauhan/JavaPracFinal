package C_Collections.RandomTest;

import java.util.ArrayList;

public class AmazonCart {
    public static void main(String[] args) {

        purchaseItems p = new purchaseItems();

        System.out.println(p.purchaseItemData(5,"MOBILE"));

    }
}



class purchaseItems{
    int number = 0;
    ArrayList<Object> mobile = new ArrayList<Object>();

    public Object purchaseItemsA(String Type) {
        Object object = null;

            if (Type == "MOBILE") {
                 object = new MOBILE(number,"mb" );
            }
            if (Type == "tv") {
                 object = new TV(number,"mb" );
            }
            if (Type == "SOFA") {
                 object = new SOFA(number,"mb" );
            }
        return object;
    }


    public ArrayList<Object> purchaseItemData(int itemNum, String ItemName){
    ArrayList A = new ArrayList();
        for(int i=0;i<itemNum;i++){
            A.add(purchaseItemsA(ItemName));
        }

        return A;
    }

}


class MOBILE{

    int mobileNumber;
    String mobileBrand;

    MOBILE(int mobileNumber, String mobileBrand) {
        this.mobileNumber = mobileNumber;
        this.mobileBrand = mobileBrand;
    }


    public String purchaseTV(int mobileNumber, String mobileBrand){
       return  "mobileNumber : "+ mobileNumber + "and" + "mobileBrand  : " +mobileBrand;
    }

}

class TV{
    int tvNumber;
    String tvBrand;

    public TV(int tvNumber, String tvBrand) {
        this.tvNumber = tvNumber;
        this.tvBrand = tvBrand;
    }
    public void purchaseTV(int tvNumber, String tvBrand){
        System.out.println("tvNumber : "+ tvNumber + "and" + "tvBrand  : " +tvBrand);
    }
}

class SOFA{
    int sofaNumber;
    String sofaType;

    public SOFA(int sofaNumber, String sofaType) {
        this.sofaNumber = sofaNumber;
        this.sofaType = sofaType;
    }

    public void purchaseSofa(int sofaNumber, String sofaType){
        System.out.println("sofaNumber : "+ sofaNumber + "and" + "sofaType  : " +sofaType);
    }



}