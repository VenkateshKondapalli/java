class fun<T,U>
 {
    T a;
    U b;
    void fun1(T c,U d){
        a=c;
        b=d;
        System.out.println(a+" "+b);
    } 
}
public class Gentic {

    public static void main(String[] args) {
        // fun<Integer> obj=new fun<Integer>();
        // fun<String> obj1=new fun<String>();
        // obj.fun1(5);
        // obj1.fun1("Hello");
        fun<Integer,String> obj=new fun<Integer,String>();
        fun<String,Integer> obj1=new fun<String,Integer>();
        obj.fun1(5, "Hello");
        obj1.fun1("World", 6);
    }
}