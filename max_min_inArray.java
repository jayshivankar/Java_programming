
public class Main{

     public static void main(String []args){
        int[] numbers = {22,-3,7,81,5,33};
        int min = numbers[0];
        int max = numbers[0];
        
        for(int i=1;i< numbers.length; i++){
            max = (numbers[i] > max) ? numbers[i]:max;
            min = (numbers[i] < min)?numbers[i]:min;
        }
        System.out.println("max = "+ max+"  min = "+min);
     }
     
}
