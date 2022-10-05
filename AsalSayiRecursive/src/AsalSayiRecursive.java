import java.util.Scanner;

public class AsalSayiRecursive {


    static boolean isPrime(int num,int a){

        if (num<1){
            System.out.println(num + " Asal sayı değildir.");
            return false;
        }
        if (num==a) {
            System.out.println(num + " Asal sayıdır");
            return true;
        }
        if (num%a==0) {
            System.out.println(num + " Asal sayı değildir.");
            return false;
        }

        return isPrime(num,(a+1));
    }

    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sorgulanacak sayıyı giriniz :");
        num= scan.nextInt();


        isPrime(num,2);

    }
}
