package solid.dip;

public class DataAccessFactory {
    public static ICustomerDataAccess getCustomerName() {
        return new CustomerDataAccess();
    }
}
