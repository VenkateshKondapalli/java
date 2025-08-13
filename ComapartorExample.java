import java.util.*;
class ComparatorExample{
public static void main(String[] args)
{ 
System.out.println("Sorting on the basis of name in Ascending order");
TreeSet<Employee> gfg = new TreeSet<>(new FirstComparator());
gfg.add(new Employee(1, "ram", 24));
gfg.add(new Employee(2, "krishna", 23));
gfg.add(new Employee(3, "sita", 26));
gfg.add(new Employee(4, "Lakshman", 25));
for(Employee employee : gfg){
System.out.println(employee);
}
System.out.println("Sorting on the basis of name in Descending order");
TreeSet<Employee> gfg2 = new TreeSet<>(new SecondComparator());
gfg2.add(new Employee(1, "ram", 24));
gfg2.add(new Employee(2, "krishna", 23));
gfg2.add(new Employee(3, "sita", 26));
gfg2.add(new Employee(4, "Lakshman", 25));

for(Employee employee : gfg2) {
System.out.println(employee);
}
System.out.println("Sorting on the basis of age in ascending order");
TreeSet<Employee> gfg3 = new TreeSet<>(new ThirdComparator());
gfg3.add(new Employee(1, "ram", 24));
gfg3.add(new Employee(2, "krishna", 23));
gfg3.add(new Employee(3, "sita", 26));
gfg3.add(new Employee(4, "Lakshman", 25));
for(Employee employee : gfg3) {
System.out.println(employee);
}
}
}
class FirstComparator implements Comparator<Employee> {
@Override public int compare(Employee e1, Employee e2)
{
return -(e1.name).compareTo(e2.name);
}
}
class SecondComparator implements Comparator<Employee> {
@Override public int compare(Employee e1, Employee e2)
{
return -(e1.name).compareTo(e2.name);
}
}
class ThirdComparator implements Comparator<Employee> {
@Override public int compare(Employee e1, Employee e2)
{
if(e1.age > e2.age){
return -1;
}
else if(e1.age < e2.age){
return 1;
}
else {
return (e1.age).compareTo(e2.age);
}
}
}

class Employee{
public int id;
public String name;
public Integer age;

Employee(){}
Employee(int id, String name, int age)
{
this.id = id;
this.name = name;
this.age = age;
}
@Override public String toString()
{
return "" + this.id + " " + this.name + " " + this.age;
}
}