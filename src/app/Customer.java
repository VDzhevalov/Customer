package app;

import static app.utils.PhoneFormatter.formatPhone;

public class Customer {

    //прибрав final бо на мою думку ім'я та телефон мають мати можливість бути змінені.
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = formatPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = formatPhone(phone);
    }
}