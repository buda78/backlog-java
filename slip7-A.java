import java.util.Scanner;
class BankDetails {
private String accno;
private String name;
private String acc_type;
private long balance;
Scanner sc = new Scanner(System.in);
public void openAccount() {
System.out.print("Enter Account No: ");
accno = sc.next();
System.out.print("Enter Account type: ");
acc_type = sc.next();
System.out.print("Enter Name: ");
name = sc.next();
System.out.print("Enter Balance: ");
balance = sc.nextLong();
}
public void showAccount() {
System.out.println("Name: " + name);
System.out.println("Account No.: " + accno);
System.out.println("Account Type: " + acc_type);
System.out.println("Balance: " + balance);
}
public void deposit() {
System.out.print("Enter the amount to deposit: ");
long amt = sc.nextLong();
balance += amt;
System.out.println("Balance after deposit: " + balance);}
public void withdrawal() {
System.out.print("Enter the amount to withdraw: ");
long amt = sc.nextLong();
if (balance >= amt) {
balance -= amt;
System.out.println("Balance after withdrawal: " +
balance);
} else {
System.out.println("Insufficient balance. Transaction
failed.");
}
}
public boolean search(String ac_no) {
return accno.equals(ac_no);
}
}
public class Main {
public static void main(String arg[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of customers: ");
int n = sc.nextInt();
BankDetails[] accounts = new BankDetails[n];
for (int i = 0; i < accounts.length; i++) {
accounts[i] = new BankDetails();
accounts[i].openAccount();
}
int choice;
do {
System.out.println("\n*** Banking System Application
***");
System.out.println("1. Display all account details");
System.out.println("2. Search by Account number");
System.out.println("3. Deposit amount");
System.out.println("4. Withdraw amount");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:for (BankDetails account : accounts) {
account.showAccount();
}
break;
case 2:
System.out.print("Enter account number to search:
");
String ac_no = sc.next();
boolean found = false;
for (BankDetails account : accounts) {
if (account.search(ac_no)) {
account.showAccount();
found = true;
break;
}
}
if (!found) {
System.out.println("Account not found.");
}
break;
case 3:
System.out.print("Enter Account No.: ");
ac_no = sc.next();
found = false;
for (BankDetails account : accounts) {
if (account.search(ac_no)) {
account.deposit();
found = true;
break;
}
}
if (!found) {
System.out.println("Account not found.");
}
break;
case 4:
System.out.print("Enter Account No.: ");
ac_no = sc.next();
found = false;
for (BankDetails account : accounts) {
if (account.search(ac_no)) {
account.withdrawal();
found = true;
break;
}
}if (!found) {
System.out.println("Account not found.");
}
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please enter a
valid option.");
}
} while (choice != 5);
sc.close();
}
}
