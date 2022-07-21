import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[] args){

        double a ,b;
        int se;
        Scanner sc =new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        a=sc.nextDouble();
        System.out.println("2. sayıyı giriniz:");
        b=sc.nextDouble();
        System.out.println("İşlem Seçiniz /n Toplama için - 1 /n çıkarma için  - 2 /n çarpma için - 3 /n bölme için - 4");
        se=sc.nextInt();

            
        switch (se){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Lütfen Belirtilen değerlerden birini girin");
                break;
        }
    }
}
