public class Agecheck{
public static void checkAge(String[] args){
int age1= Integer.parseInt(args[0]);
int age2= Integer.parseInt(args[1]);
if(age1<10||age2>60){
System.out.println("Discount price");
}
else{
System.out.println("Full price");
}
}
}
