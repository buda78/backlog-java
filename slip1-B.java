import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class Staff{
String name,address;
}class FullTimeStaff extends Staff{
String department;
double salary;
public void accept() throws IOException{
System.out.println("Enter the name, address, department and
salary: ");
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
name=br.readLine();
address=br.readLine();
department=br.readLine();
salary=Double.parseDouble(br.readLine());
}
public void display(){
System.out.println("Name: "+name);
System.out.println("Address: "+address);
System.out.println("Department: "+department);
System.out.println("Salary: "+salary);
System.out.println("----------------------");
}
}
class PartTimeStaff extends Staff{
int hours, rate;
public void accept() throws IOException{
System.out.println("Enter the name, address, No of working hours
and rate per hour: ");
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
name=br.readLine();
address=br.readLine();
hours=Integer.parseInt(br.readLine());
rate=Integer.parseInt(br.readLine());
}
public void display(){
System.out.println("Name: "+name);
System.out.println("Address: "+address);
System.out.println("No of Working Hours: "+hours);
System.out.println("Rate per hour: "+rate);
System.out.println("----------------------");
}
}
public class Student {
public static void main(String [] args) throws IOException{
int i;
System.out.println("Select Any One: ");
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));System.out.println("1.Full Time Staff");
System.out.println("2.Part Time Satff");
int ch=Integer.parseInt(br.readLine());
switch(ch){
case 1:
System.out.println("Enter the number of Full Time Staff: ");
int n=Integer.parseInt(br.readLine());
FullTimeStaff [] l=new FullTimeStaff[n];
for(i=0;i<n;i++){
l[i]=new FullTimeStaff();
l[i].accept();
}
for(i=0;i<n;i++){
l[i].display();
}
break;
case 2:
System.out.println("Enter the number of Part Time Staff: ");
int m=Integer.parseInt(br.readLine());
PartTimeStaff [] h=new PartTimeStaff[m];
for(i=0;i<m;i++){
h[i]=new PartTimeStaff();
h[i].accept();
}
for(i=0;i<m;i++){
h[i].display();
}
break;
}
}
