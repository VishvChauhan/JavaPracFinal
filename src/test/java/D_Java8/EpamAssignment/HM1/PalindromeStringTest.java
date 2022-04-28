package D_Java8.EpamAssignment.HM1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeStringTest {

    PalindromeString P = new PalindromeString();


    @DataProvider(name = "testDataForPalindrome")
    public Object[][] testDataPalindrome(){
        return new Object[][]{
                {"BOB", true},
                {"chauhan", false}
        };
    }


    @Test(dataProvider = "testDataForPalindrome")
    public void PalindromeTest(String str, boolean expectedResult){
        boolean actualResult = P.isPalindromeW(str);
        Assert.assertEquals(actualResult,expectedResult);
    }


}