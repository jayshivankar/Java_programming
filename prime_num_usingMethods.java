public class Main
{
	public static void main(String[] args) {
		printPrimeBetween(10,30);
		
}
public static boolean isPrime(int n){
    for(int i=2;i<=n/2;i++)
    if(n%i==0)
    return false;
    else
    return true;
}
public static void printPrimeBetween(int start,int end){
    if(isPrime(i))
    System.out.println(i+"");
}
}
