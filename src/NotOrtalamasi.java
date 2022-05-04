import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        double ort;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz.");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz.");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz.");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz.");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz.");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz.");
        muzik = inp.nextInt();

        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("ortalamaniz : " + ort);
        String sonuc = (ort >= 50) ? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println("Sinifi gecme durumu : " + sonuc);
    }
}