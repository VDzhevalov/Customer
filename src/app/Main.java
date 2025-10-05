package app;

public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = getFormattedCustomerInfo(customer);
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"Vasyl", "5551238596"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static String getFormattedCustomerInfo(Customer customer) {
        return String.format("Customer: %s, phone: %s", customer.getName(), customer.getPhone());
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
