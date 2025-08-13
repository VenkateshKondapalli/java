//import java.util.Scanner;
import java.util.function.Predicate;
public class Employee {
    public static void main(String[] args) {
        int a[]={15000,8000,12000,7000,9999};
        Predicate<Integer> ref= n->n>=10000;
        for(int i:a){
            System.out.println(ref.test(i));
        }

    }
}
