import java.util.Scanner;
class ZeroException extends Exception {
public ZeroException(String message) {
super(message);
}
}
public class PrimeChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter a number: ");
int number = scanner.nextInt();
if (number == 0) {
throw new ZeroException("Number is 0");
}
if (isPrime(number)) {System.out.println(number + " is a prime number.");
} else {
System.out.println(number + " is not a prime
number.");
}
} catch (ZeroException e) {
System.out.println("Exception: " + e.getMessage());
} catch (Exception e) {
System.out.println("Invalid input. Please enter a valid
number.");
} finally {
scanner.close();
}
}
// Static method to check whether a number is prime
public static boolean isPrime(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}
