public class StringMethods {

    public static void main(String... ar){
        String str = new String("Welcome");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat("to the java programming language"));
        System.out.println(str.substring(2, 5));
        System.out.println(str.indexOf('e',3));
        System.out.println(str);

    }
}