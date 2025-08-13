class A extends Exception {

}

public class OwnException {
    void m1(int a) {
        if (a % 2 == 0) {
            System.out.println(a);
        } else {
            try {
                throw new A();
            } catch (A b) {
                System.out.println("error");
            }
        }
    }

    public static void main(String[] args) {
        
        int a=6;
        try {

            OwnException obj = new OwnException();
            obj.m1(a);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer as a command-line argument.");
        }
    }
}
