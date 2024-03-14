package org.example;

import java.util.Scanner;

// Baştan ve sondan yazımları / okunuşları aynı olan kelimelere "Palindromik (palindrom) kelime"ler denir. Buna göre
// klavyeden küçük harflerle girilen kelimenin palindromik olup olmadığını söyleyen program.
// örn. kek,mum,küçük,kök
public class Main {
    public static void main(String[] args) {

        String k;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime : ");
        k = scanner.nextLine();
       // String kt = new StringBuffer(k).reverse().toString();
        String kt = new  StringBuilder(k).reverse().toString();
        if (k.equals(kt))
            System.out.println("Palindromik Kelimedir.");
        else System.out.println("Palindromik Kelime Değildir");
    }
}
