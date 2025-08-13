import java.util.Scanner;
public class New{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char inputLetter = sc.next().charAt(0);
        System.out.println(inputLetter);
        System.out.println((char)(inputLetter+1));
        sc.close();
    } 
}
