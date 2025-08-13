import java.util.Scanner;
public class Matrix{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a[][]= new int[2][2];
	int b[][]= new int[2][2];
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
		a[i][j] = sc.nextInt();
		b[i][j] = sc.nextInt();
		a[i][j] = a[i][j]+b[i][j];
		} }
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(a[i][j]);
			} }
			sc.close();
}
}