import java.util.Scanner;

/**
 @author hatice
 Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvorani, kdvtutari, kdvlitutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("Tutar giriniz.");
        tutar = inp.nextDouble();

        kdvorani = (0 < tutar && tutar < 1000) ? 0.18 : 0.08;

        kdvtutari = tutar * kdvorani;
        kdvlitutar = tutar + kdvtutari;

        System.out.println("Girilen tutar : " + tutar);
        System.out.println("Kdv orani: " + kdvorani);
        System.out.println("Hesaplanan KDV : " + kdvtutari);
        System.out.println("Hesaplanan KDV'li tutar : " + kdvlitutar);
    }

}
