import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        /*List<Integer> l1=new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(1);
	l2.add(2);
	l2.add(3);
	l1.addAll(1,12);
	System.out.println(l1);
	l1.remove(4);
	System.out.println(l1);
	System.out.println(l1.get(3));
	l1.set(0,5);
	System.out.println(l1);
	l1.clear();
	int n=5;
	List<Integer> arrli= new ArrayList<Integer>(n);
	for(int i=1;i<=n;i++){
	arrli.add(i);
	System.out.println(arrli);
	// Write a program to add a element into the array list from the user and display the list and also remove third element of the list
	Scanner sc new Scanner(System.in);
	int n=sc.nextLine();
	List<Integer> arrli= new ArrayList<Integer>(n);
	for(int i=1;i<=n;i++){
	arrli.add(i);
	System.out.println(arrli)*/
	List<String> l1=new LinkedList<>();
	l1.add("A");
	l1.add("B");
	l1.addLast("C");
	l1.addFirst("D");
	l1.add(2,"4E");
	System.out.println(l1);
	l1.remove("B");
	l1.remove(3);
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
    }
}
