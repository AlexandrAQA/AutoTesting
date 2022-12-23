package aqa.about;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Taxes {
    public double salaryTax(double salary) {
        double tax = 0;
        if (salary <= 0) {
            return 0;
        } else if (salary > 0 && salary < 10000) {
            System.out.println(tax = salary * 0.13);
        } else if (salary >= 10000 && salary < 50000) {
            System.out.println(tax = salary * 0.2);
        } else if (salary >= 50000) {
            System.out.println(tax = salary * 0.3);

        }

        return tax;
    }

    @Test
    public void test1() {
        Assert.assertEquals(salaryTax(0), 0);
    }

    @Test
    public void test2() {
        Assert.assertEquals(salaryTax(9999), 1299, 1300);
    }

    @Test
    public void test3() {
        Assert.assertEquals(salaryTax(10000), 2000);
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
}
