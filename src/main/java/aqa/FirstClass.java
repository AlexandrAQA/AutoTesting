package aqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
    public static final String EMPTY = "";

    public String calcMethod(int num) {
        if (num == 0) {
            return "";
        } else if (num % 15 == 0) {
            return "AB";
        } else if (num % 3 == 0) {
            return "A";
        } else if (num % 5 == 0) {
            return "B";
        }
        return "";
        }


    @Test
    public void firstTest() {
        //Assert.assertEquals() - we can choose method
        // which one suit for our case: int actual res - int expected res
        Assert.assertEquals(calcMethod(0), EMPTY);
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(calcMethod(3), "A");
    }

    @Test
    public void thirdTest() {
        Assert.assertEquals(calcMethod(5), "B");
    }

    @Test
    public void forthTest() {
        Assert.assertEquals(calcMethod(15), "AB");
    }
    @Test
    public void fifthTest() {
        Assert.assertEquals(calcMethod(-1), EMPTY);
    }


}


