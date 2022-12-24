package aqa.about;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Taxes {
    public double salaryTax(double salary) throws IllegalArgumentException{
        double tax = 0;
        if (salary == 0) {
            System.out.println("Salary value can not be Zero!");
            return 0;
        } else if (salary > 0 && salary < 10000) {
            System.out.println(tax = salary * 0.13);
        } else if (salary >= 10000 && salary < 50000) {
            System.out.println(tax = salary * 0.2);
        } else if (salary >= 50000) {
            System.out.println(tax = salary * 0.3);
        } else {
            System.out.println("invalid argument");
            throw new IllegalArgumentException();
        }

        return tax;
    }

    @Test
    public void test1() {
        Assert.assertEquals(salaryTax(0), 0);
    }

    @Test
    public void test2() {
        Assert.assertEquals(salaryTax(9999), 9999*0.13);
    }

    @Test
    public void test3() {
        Assert.assertEquals(salaryTax(10000), 10000*0.13 );
    }

    @Test
    public void test4() {
        Assert.assertEquals(salaryTax(10001), 2000.2);
    }

    @Test
    public void test5() {
        Assert.assertEquals(salaryTax(49999), 9999.8, 9999.82);
    }

    @Test
    public void test6() {
        Assert.assertEquals(salaryTax(50000), 15000);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test7() {
        salaryTax(-1);
    }
}
