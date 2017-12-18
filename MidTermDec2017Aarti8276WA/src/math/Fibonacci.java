package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
          1 1 2 3 5 8 13 21....
         */
        int i=1;
        int j=0;
        System.out.print("40 Fibonacci numbers: ");
        for(int k=1; k<=40; k++){
            int sum=i+j;
            i=j;
            j=sum;
            System.out.print(sum+" ");
        }
    }
}
