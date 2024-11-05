package ECOMS;

public class Customer {
    /***
     * Members
     * 1. name -> Name of the customer
     * 2. email -> Email ID of the customer
     * 3. address -> Address of the customer
     */
    private final String name;
    private final String email;
    private final String address;

    // Constructor
    public Customer(String name,String email,String address){
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /***
     * Methods
     * 1. get_contact_info() -> This method will return a String with all the information about customer.
     */
    public String get_contact_info(){
        return String.format("Name: %s, Email: %s, Address: %s",name,email,address);
    }
}
