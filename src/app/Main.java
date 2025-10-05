package app;

import static app.utils.CustomerUtil.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = getFormattedCustomerInfo(customer);
        getOutput(output);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
