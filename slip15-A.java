import java.io.*;
import java.util.*;
public class FileCopy {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter the name of the source file: ");
String sourceFileName = scanner.nextLine();
System.out.print("Enter the name of the destination file:
");
String destinationFileName = scanner.nextLine();
copyFileContents(sourceFileName, destinationFileName);
System.out.println("Contents copied successfully!");
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
} finally {
scanner.close();
}
}
private static void copyFileContents(String sourceFileName, String
destinationFileName) throws IOException {
try (BufferedReader reader = new BufferedReader(new
FileReader(sourceFileName));
PrintWriter writer = new PrintWriter(new
FileWriter(destinationFileName))) {
String line;
while ((line = reader.readLine()) != null) {
String[] parts = line.split(",");
if (parts.length == 2) {
String bookName = parts[0].trim();
String authorName = parts[1].trim();
writer.println("Book: " + bookName + ", Author: "
+ authorName);
}
}
}
}
}
