class Outer{
    int x=10; static int y=20;
    void demo(){
       // int z=30;
        System.out.println("Local class is loading...");
        class Local {
           // int a =10;
            void myLocal(){
                System.out.println("x="+x);
                System.out.println("y="+x);
              //  System.out.println("z="+x);
                //System.out.println("a="+x);
            }
        }
        Local obj1=new Local();
        obj1.myLocal();
    }
}
public class Main1 {
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.demo();
    }
    
}