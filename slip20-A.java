import java.util.Scanner;
class Continent {
String continentName;
Continent(String name) {
this.continentName = name;
}
void displayContinent() {
System.out.println("Continent: " + continentName);
}
}
class Country extends Continent {
String countryName;
Country(String continentName, String countryName) {
super(continentName);
this.countryName = countryName;
}
void displayCountry() {
displayContinent();
System.out.println("Country: " + countryName);
}
}
class State extends Country {
String stateName;
State(String continentName, String countryName, String stateName)
{
super(continentName, countryName);
this.stateName = stateName;
}
void displayState() {
displayCountry();
System.out.println("State: " + stateName);
}
}
public class PlaceHierarchy {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);System.out.print("Enter Continent Name: ");
String continentName = scanner.nextLine();
System.out.print("Enter Country Name: ");
String countryName = scanner.nextLine();
System.out.print("Enter State Name: ");
String stateName = scanner.nextLine();
State userState = new State(continentName, countryName,
stateName);
userState.displayState();
scanner.close();
}
}

