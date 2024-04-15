import java.util.Scanner;
class Account {
String custName;
long accNo;
Account() {
}
Account(String custName, long accNo) {
this.custName = custName;
this.accNo = accNo;
}
}
class SavingAccount extends Account {
double savingBal;
double minBal;
SavingAccount() {
}
SavingAccount(String custName, long accNo, double savingBal,
double minBal) {
super(custName, accNo);
this.savingBal = savingBal;
this.minBal = minBal;
}
}
class AccountDetail extends SavingAccount {
double depositAmt;
double withdrawalAmt;AccountDetail() {
}
AccountDetail(String custName, long accNo, double savingBal,
double minBal, double depositAmt, double withdrawalAmt) {
super(custName, accNo, savingBal, minBal);
this.depositAmt = depositAmt;
this.withdrawalAmt = withdrawalAmt;
}
void displayCustomerDetails() {
System.out.println("Customer Name: " + custName);
System.out.println("Account Number: " + accNo);
System.out.println("Saving Balance: " + savingBal);
System.out.println("Minimum Balance: " + minBal);
System.out.println("Deposit Amount: " + depositAmt);
System.out.println("Withdrawal Amount: " + withdrawalAmt);
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Customer Name: ");
String custName = scanner.nextLine();
System.out.print("Enter Account Number: ");
long accNo = scanner.nextLong();
System.out.print("Enter Saving Balance: ");
double savingBal = scanner.nextDouble();
System.out.print("Enter Minimum Balance: ");
double minBal = scanner.nextDouble();
System.out.print("Enter Deposit Amount: ");
double depositAmt = scanner.nextDouble();
System.out.print("Enter Withdrawal Amount: ");
double withdrawalAmt = scanner.nextDouble();
AccountDetail accountDetails = new AccountDetail(custName,
accNo, savingBal, minBal, depositAmt, withdrawalAmt);
accountDetails.displayCustomerDetails();scanner.close();
}
}
