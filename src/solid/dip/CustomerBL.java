package solid.dip;
// heigh level module
public class CustomerBL {
    public CustomerBL() {
    }
    public void  getCustomerNameBL() {
        ICustomerDataAccess customerDataAccess = DataAccessFactory.getCustomerName();

        System.out.println(customerDataAccess.getCustomerNameDataAccess());
    }
}
