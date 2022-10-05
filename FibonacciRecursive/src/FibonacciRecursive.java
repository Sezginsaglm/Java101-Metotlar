import java.util.Scanner;

public class FibonacciRecursive {

    static int fib(int n) {

        if (n == 2 || n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q=3,n;
      while(q>0){
          System.out.print("n değerini giriniz : ");
          n = input.nextInt();

          if (n > 0) {
              System.out.println(fib(n));
              break;
          } else {
              System.out.println("Hatalı değer girdiniz.");
              q--;
          }
      }


    }
}