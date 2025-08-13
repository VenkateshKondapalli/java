import java.util.Scanner;
public class JaggedArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][] = new int[3][];
        a[0] = new int [2];
        a[1] = new int [3];
        a[2] = new int [4];
        for(int i=0;i<3;i++){
            for(int j=0;j<i+1 ;j++){
                a[i][j] = sc.nextInt();
                System.out.println(a[i][j]);
            }
        }
        sc.close();
        
    } 
}