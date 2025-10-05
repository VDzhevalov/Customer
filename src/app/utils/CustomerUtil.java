package app.utils;

import app.Customer;

public class CustomerUtil {

    public static String[] getData() {
        return new String[]{"Vasyl", "5551238596"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static String getFormattedCustomerInfo(Customer customer) {
        return String.format("Customer: %s, phone: %s", customer.getName(), customer.getPhone());
    }
}
