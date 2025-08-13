package END;
import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        /*
        charAt 
        first.compareTo(second){f>s +ve:f=s 0: f<s -ve}
        substring(beg index, end index)
         */
        StringBuilder sb= new StringBuilder(name);
        /* name.setCharAt(index,"a")
        name.insert(index,'b')
        name.delete(start,end)
        sp.append("last add element")
         */
        System.out.println(sb);
        sc.close();
}
}
