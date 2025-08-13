class Student implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Student");
        }
    }
}
public class MultiThreading {
    public static void main(String args[]){
        // Runnable obj =new Student();
        // Thread obj12= new Thread();
        // obj12.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
/*class Student1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Student");
        }
    }
}
public class MultiThreading {
    public static void main(String args[]){
        Student1 obj = new Student1();
        obj.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
} */