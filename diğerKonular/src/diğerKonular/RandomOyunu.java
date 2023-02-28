package diğerKonular;

import java.util.Scanner;
import java.util.Random;

public class RandomOyunu {
	
    public static void main(String[] args) {
    	
        Random random = new Random(); 
        int randSayi = random.nextInt(101); 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("0-100 arasında bir sayı tahmin edin.");

        int tahmin = -1;
        int tahminSayisi = 0;

        while (tahmin != randSayi && tahminSayisi < 10) { 
            tahmin = scanner.nextInt(); 
            tahminSayisi++;

            if (tahmin < randSayi) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (tahmin > randSayi) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! " + tahminSayisi + " tahminde doğru sayıyı buldunuz.");
            }
        }
        
        if (tahminSayisi == 10 && tahmin != randSayi) {
        	System.out.println("Tahmin hakkınız doldu. Kaybettiniz");
        }
    }
}


