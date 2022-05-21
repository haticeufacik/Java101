import java.util.Scanner;

public class Fibonacci {

    static int fibo(int a) {

        if (a == 1 || a == 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);


    }

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz.. ");
        sayi = inp.nextInt();

        System.out.println(sayi + " numarali Fibonacci sayisi  : " + fibo(sayi));

        System.out.print(sayi + " elemanli Fibonacci dizisi  : ");

        for (int i = 1; i <= sayi; i++) {
            System.out.print(fibo(i) + " " );
        }
    }

}
