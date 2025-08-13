public class ExceptionHandling1 {
    public static void main(String[] args) {
        //1 Arthemtic
    //     try{
    //         int a=50/0;
    //     }catch(ArithmeticException b){
    //         System.out.println(b);
    //     }
    //2 nullpointer
        // try{
        //     String a=null;
        //     System.out.println(a);
        // }catch(NullPointerException b){
        //     System.out.println(b);
        // }
    //3 Array bound
    // try{
    //     int a[]=new int[5];
    //     a[5]=10;
    // }catch(ArrayIndexOutOfBoundsException b){
    //     System.out.println(b);

    // }
    //4 NumberFormat
    // try{
    //     String a="abc";
    //     int b=Integer.parseInt(a);
    // }catch(NumberFormatException e){
    //     System.out.println(e);
    // }
    //5 Exception class
    try{
        //int d=50/0;
        int a[]=new int[2];
        // System.out.println(a[3]);
        a[2]=50/0;

    }catch(Exception b){
        System.out.println(b);
    }
}
}
