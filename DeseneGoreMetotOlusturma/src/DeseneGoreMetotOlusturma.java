import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

    /*
    Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */

    static void Desen(int Num){
        int a = Num -5;
        if(a>=-4) {

            System.out.print(a + " ");
            Desen(a);

            int b = a + 5;
            if(b<=Num){
                System.out.print(b + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int Num1 = scan.nextInt();

        System.out.print(Num1+ " ");
        Desen(Num1);
    }
}