package Answer4;

import java.util.Scanner;

public class Yuvarlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Klavyeden bilgi almak için nesne oluşturuldu
        // Kullanıcıya bilgi verildi
        System.out.println("Yukarı yuvarlama için 1'e, aşağı yuvarlamak için 2'ye basınız");

        // Kullanıcının seçimini bir sayıya atıyoruz.
        int selection = scanner.nextInt();

        //Kullanıcıdan sayıyı alıyoruz
        System.out.println("Yuvarlamak istediğiniz sayıyı giriniz : ");
        double sayi = scanner.nextDouble();//Aldığımız sayıyı bir değişkene atıyoruz.


        switch (selection) {
            case 1 :
                sayi++;
                int sayi2 = (int) sayi;
                System.out.println("Yuvarlanmış hali : "+sayi2);
                break;
            case 2 :
                int sayı3 = (int) sayi;
                System.out.println("Yuvarlanmış hali: " +sayı3);
                break;

            default:
                System.out.println("Lütfen geçerli bir sayı giriniz"  );

        }
    }

}
