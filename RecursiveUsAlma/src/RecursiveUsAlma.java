import java.util.Scanner;

public class RecursiveUsAlma {
    static int Us(int a,int b){

        if(b==0){
            return 1;
        }
        else if (a==1){
            return 1;
        }
        else {
            return a*Us(a,(b-1));
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Taban sayısını giriniz : ");
        int a= input.nextInt();

        System.out.print("Üs sayısını giriniz :");
        int b= input.nextInt();

        System.out.println("Sonuç : "+ Us(a,b));
    }
}