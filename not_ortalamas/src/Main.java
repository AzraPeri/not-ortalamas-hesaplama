import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           int matamatik,fizik,türkçe,ingilizce ;

        Scanner giris = new Scanner(System.in) ;

        System.out.println("Mat notunuzunu giriniz ;");
        matamatik  = giris.nextInt();

        System.out.println("Fizik notunuzu giriniz ;");
        fizik = giris.nextInt();

        System.out.println("Türkçe notunuzu giriniz;");
        türkçe = giris.nextInt();

        System.out.println("İngilizce notunuzu giriniz;");
        ingilizce = giris.nextInt();

        int toplam = (matamatik+fizik+türkçe+ingilizce) ;
        double sonuc = (toplam/4);
        System.out.println("DERS ORTALAMANIZ ;" + sonuc);


    }
}