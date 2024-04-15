public class BMICalculator {
public static void main(String[] args) {

provided
if (args.length != 4) {
System.out.println("Usage: java BMICalculator <FirstName>
<LastName> <WeightInKgs> <HeightInMeters>");
return;
}

String firstName = args[0];
String lastName = args[1];
double weight = Double.parseDouble(args[2]);
double height = Double.parseDouble(args[3]);

double bmi = calculateBMI(weight, height);

System.out.println("Name: " + firstName + " " + lastName);
System.out.println("Weight: " + weight + " kg");
System.out.println("Height: " + height + " meters");
System.out.println("BMI Index: " + bmi);
}

static double calculateBMI(double weight, double height) {
return weight / (height * height);
}
}
