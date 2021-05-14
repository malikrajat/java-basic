package solid.dip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main get call");
        CustomerBL customerBL  = new CustomerBL();
        customerBL.getCustomerNameBL();
    }
}
