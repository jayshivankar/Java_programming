import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = in.nextInt();
        int rem,sum=0;
        int num;
        num = n;
        while(num!=0){
            rem = num%10;
            sum = sum + rem*rem*rem;
            num/=10;

        }
        if(sum == n)
            System.out.println("This is an armstrong number");
        else
            System.out.println("not an armstrong number");

    }
}
