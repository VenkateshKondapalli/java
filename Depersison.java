// import java.io.FileInputStream;
// import java.io.ObjectInputStream;

// public class Depersison {
//     public static void main(String[] args) {
//         try{
//             FileInputStream obj=new FileInputStream("f.txt");
//             ObjectInputStream in =new ObjectInputStream(obj);
//             Student s=(Student)in.readObject();
//             System.out.println(s.id+""+s.name);
//             in.close();
//         }catch(Exception e){System.out.println(e);}
//     }
// }
