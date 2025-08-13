// class fun{
//     <T> void geneticDisplay(T element){
//         System.out.println(element.getClass().getName()+" = "+element);
//     }
// }
// public class Ze {
//     public static void main(String[] args) {
//         fun obj=new fun();
//         obj.geneticDisplay(10);
//         obj.geneticDisplay("Hello");
//         obj.geneticDisplay('A');
//         obj.geneticDisplay(11.0);
//     }
// }
import java.util.Arrays;
import java.util.List;
class Ze{
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(4,5,6,7);
        System.out.println("Total sum is "+sum(list1));
        // List<Double> list2=Arrays.asList(4.1,5.1,6.1);
        // // System.out.println("Total sum is: "+sum(list2));
    }
    private static double sum(List<? extends Integer> list){
        double sum=0.0;
        for(Number i:list){
            sum+=i.doubleValue();
        }
        return sum;
    }
}