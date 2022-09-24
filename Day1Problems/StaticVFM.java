package Day1Problems;

public class StaticVFM {
    static int a = 5;
    static int b = 4;

    static void func(int c){
        System.out.println(" Value of a is:" +a);
        System.out.println(" Value of b is: " +b);
    }
    static {
        System.out.println("Running Static Block");
        b = a+b;
    }

    public static void main(String[] args) {
        func(7);
    }
}
