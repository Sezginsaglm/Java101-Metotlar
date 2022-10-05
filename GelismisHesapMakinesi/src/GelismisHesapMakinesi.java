import java.util.Scanner;
public class GelismisHesapMakinesi {
    static int toplama(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a = inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
         int b=inp.nextInt();
        return a +b;
    }
    static int cikarma(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        int b=inp.nextInt();
        return a-b;
    }
    static int carpam(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        int b=inp.nextInt();
        return a*b;
    }
    static double bolme() {
        Scanner inp = new Scanner(System.in);
        int right = 4;
        double result = 0;
        while (right > 0) {
            System.out.print("Birinci sayiyi  girin :");
            double a = inp.nextDouble();
            System.out.print("Ikinci sayiyi  girin :");
            double b = inp.nextDouble();
            result = a / b;


            if (b == 0) {
                right--;
                System.out.println("Bölen sıfır olamaz!");
                if (right == 0) {
                    System.out.println("Hiç Hakkınız Kalmadı ! ");
                    break;
                } else {
                    System.out.println( right + " Hakkınız Kaldı ");
                }
            }

            System.out.println("Sonuç : " + result);


        }
        return result;
    }static int uslu() {
    Scanner input = new Scanner(System.in);
    int right = 4;
    int result = 1;
         while (right > 0) {
        System.out.print("Taban değerini giriniz :");
        int base = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int exponent = input.nextInt();


        if (base == 0 && exponent == 0) {
            right--;
            System.out.println("Taban ve üst değeri aynı anda sıfır olamaz !");
            if (right == 0) {
                System.out.println("Hiç Hakkınız Kalmadı!");
                break;
            }
            System.out.println(right + " Hakkınız kaldı");
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
                System.out.println("Sonuç : " + result);
            }
        }
    }
         return result;
}


    static int faktor() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi  girin :");
        int a = inp.nextInt();
        int toplam =1;
        for (int i=1;i<=a;i++){
            toplam*=i;
        }
        return toplam;
    }
    static int mod(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        int b=inp.nextInt();
        return a%b;
    }


    static void dikdort() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenar :");
        int a= inp.nextInt();
        System.out.print("Kisa kenar :");
        int b=inp.nextInt();
        int cevre=(2*a)+(2*b);
        int alan =a*b;
        System.out.println("Alan :"+alan+"\n"+"Cevre :"+cevre);

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String menu = """
                1-Toplama\s
                2-Cikartma
                3-Carpma
                4-Bolme
                5-Uslu Sayi Hesaplama
                6-Faktoriyel Hesaplama
                7-Mod Alma
                8-Dikdortgen cevre ,alan Hesaplama
                0-Çıkış
                """;
        int select;
        do {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select= inp.nextInt();
            switch (select) {
                case 1 -> {
                    System.out.println("Sonuc :" + toplama());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("Sonuc :" + cikarma());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 3 -> {
                    System.out.println("Sonuc :" + carpam());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("Sonuc :" + bolme());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 5 -> {
                    System.out.println("Sonuc :" + uslu());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 6 -> {
                    System.out.println("Sonuc :" + faktor());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 7 -> {
                    System.out.println("Sonuc :" + mod());
                    System.out.println("-------------------------------------------------------------------------");
                }
                case 8 -> {
                    dikdort();
                    System.out.println("-------------------------------------------------------------------------");

                }
                default -> System.out.println("\nHatali islem !!!Tekrar deneyin \n");

            }
        }while (select!=0);
    }

}