package pract30;

public class Customer {
    public final String firstName;
    public final String secondName;
    public final int age;
    public final Customer MATURE_UNKNOWN_CUSTOMER;
    public final Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(String firstName, String secondName, int age, Customer mature_unknown_customer, Customer not_mature_unknown_customer) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        MATURE_UNKNOWN_CUSTOMER = mature_unknown_customer;
        NOT_MATURE_UNKNOWN_CUSTOMER = not_mature_unknown_customer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}
