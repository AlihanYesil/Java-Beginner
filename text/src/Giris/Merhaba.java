package Giris;
import java.util.Scanner;

public class Merhaba {
    public static void main(String[] args){
        double mat,kimya,fizik,türkce,tarih,muzik,GenelNot;

        Scanner al = new Scanner(System.in);
        System.out.println("Matematik Not Giriniz");
        mat=al.nextDouble();
        System.out.println("kimya Not Giriniz");
        kimya=al.nextDouble();
        System.out.println("fizik Not Giriniz");
        fizik=al.nextDouble();
        System.out.println("türkçe Not Giriniz");
        türkce=al.nextDouble();
        System.out.println("tarih Not Giriniz");
        tarih=al.nextDouble();
        System.out.println("muzik Not Giriniz");
        muzik=al.nextDouble();

        GenelNot=(mat+fizik+kimya+türkce+tarih+muzik)/6;
        System.out.println("Not Ortalamanız :"+GenelNot );
        String  cikti= (GenelNot>=60)?"Geçtiniz" : "KALDINIZ";
        System.out.println(cikti);

    }
}
