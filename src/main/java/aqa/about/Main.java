package aqa.about;

public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        String s = firstClass.calcMethod(-1);
        System.out.println(s);
        System.out.println();

        Taxes taxes = new Taxes();
        taxes.salaryTax(10000);
    }
}
