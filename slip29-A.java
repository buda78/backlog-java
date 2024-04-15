import java.util.*;
class Customer {
private int custno;
private String custname;private String contactnumber;
private String custaddr;
public Customer(int custno, String custname, String contactnumber,
String custaddr) {
this.custno = custno;
this.custname = custname;
this.contactnumber = contactnumber;
this.custaddr = custaddr;
}
public String getContactNumber() {
return contactnumber;
}
public void displayDetails() {
System.out.println("Customer Number: " + custno);
System.out.println("Customer Name: " + custname);
System.out.println("Contact Number: " + contactnumber);
System.out.println("Customer Address: " + custaddr);
}
}
public class CustomerSearch {
public static void main(String[] args) {

ArrayList<Customer> customers = new ArrayList<>();

customers.add(new Customer(1, "John Doe", "1234567890", "123
Main St"));
customers.add(new Customer(2, "Jane Smith", "9876543210", "456
Oak Ave"));
customers.add(new Customer(3, "Bob Johnson", "5551112222",
"789 Elm Blvd"));

Scanner scanner = new Scanner(System.in);
System.out.print("Enter Contact Number to search: ");
String searchContactNumber = scanner.nextLine();

boolean found = false;
for (Customer customer : customers) {
if
(customer.getContactNumber().equals(searchContactNumber)) {customer.displayDetails();
found = true;
break; // Stop searching once found
}
}
if (!found) {
System.out.println("Customer with contact number " +
searchContactNumber + " not found.");
}
scanner.close();
}
}
