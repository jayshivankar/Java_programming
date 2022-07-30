public class Main {
    public static void main(String[] args) {

        //System.out.println("");
        int n =12355;
         int count = 0;
         int rem;
         while (n>0){
             rem = n%10;

             if(rem == 5){
                 count++;
             }
             n = n/10;
         }
    System.out.println("the count is "+count);

    }
}
