package Basic;
import java.util.Scanner;
public class UsluSayiBulma {
    public static void main(String[] args) {
        int taban,us,total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini girin: ");
        taban = input.nextInt();

        System.out.println("Üs değerini girin: ");
        us = input.nextInt();

        for(int i = 1 ; i <= us ; i++){
            total *= taban;
        }
        System.out.println("Sonuç: " + total);
    }
}
