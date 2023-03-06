/* 
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

ÖDEV
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class sinif {
    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu giriniz: ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        double ort = (mat + fizik + turkce + kimya + muzik) / 5;
        
        if (ort <= 54.99){

            System.out.print("Maalesef dersten kaldınız..");
            System.out.print("Ortalamnız" + ort);
        }

        else if (ort <= 0 || ort >= 100){

            System.out.print("Ortalamanız standartlardan farklıdır, lütfen girilen notlarınızı kontrol ediniz.");

        }

        else {

            System.out.print("Sınıfı geçtiniz, ders ortalamanız: " + ort);

        }

    }
    
}
