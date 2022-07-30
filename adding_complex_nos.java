import java.util.Scanner;


public class practise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the real part and imaginary part of first complex number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("enter the real part and imaginary part of second complex number : ");
        int c = in.nextInt();
        int d = in.nextInt();
        int r = a+c;
        int i =b+d;
        System.out.println("the sum of complex numbers is "+r+"+"+i+"i");


    }
}
