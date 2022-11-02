package patikadev;
import java.util.Scanner;
public class usluSayı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,total = 1;

        System.out.print("sayıyı giriniz:");
        a = inp.nextInt();
        System.out.print("üssünü giriniz:");
        b = inp.nextInt();

        for(int i=1;i<=b;i++){
        total *= a;
        }
        System.out.print("sonuç:"+total);
    }
}
