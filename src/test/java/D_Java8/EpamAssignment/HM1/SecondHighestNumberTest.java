package D_Java8.EpamAssignment.HM1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class SecondHighestNumberTest {

    SecondHighestNumber secondHighestNumber = new SecondHighestNumber();
    @DataProvider(name = "SecondHighestNumberTestdata")
    public Object[][] SecondHighestNumberTestdata(){
        return new Object[][]{
                {new int[] {4, 3, 2, 6}, 4},
                {new int[] {14, 34, 63, 44}, 44},
                {new int[] {1}, -1}};


    /* @Test(dataProvider ="SecondHighestNumberTestdata" )
     public void  SecondHighestNumberTestA(Integer []arr, int key, int ExpectedResults){
         int actualResult = secondHighestNumber.getKthHighest(arr, 2);
        }*/



    }


}