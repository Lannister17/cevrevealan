import java.util.Scanner;
import java.lang.Math;
public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        float u;
        double alanınKaresi,alanı;
        System.out.print("Birinci kenarı giriniz :");
        a= input.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        b= input.nextInt();
        System.out.print("Ücüncü kenarı giriniz :");
        c= input.nextInt();

        u = (a+b+c)/2f;
        alanınKaresi = (u * (u-a) * (u-a) * (u-a));
        alanı = Math.sqrt(alanınKaresi);

        System.out.println("Cevresi : " + 2*u);
        System.out.println("Alanı : " + alanı);


    }
}
