/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 1 percabangan genap :
Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 2 buah bilangan
integer, jika kedua masukan adalah bilangan genap maka tampilkan hasil penjumlahan
keduanya, jika keduanya bilangan ganjil maka tampilkan perkalian keduanya.
*/

package PercabanganGenap;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = Integer.parseInt(scanner.next());

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = Integer.parseInt(scanner.next());

        boolean genap1 = bilangan1 % 2 == 0;
        boolean genap2 = bilangan2 % 2 == 0;

        if (genap1 && genap2) {
            int hasil = bilangan1 + bilangan2;
            System.out.println("Maka Hasil Penjumlahan: " + hasil);
        } else if (!genap1 && !genap2) {
            int hasil = bilangan1 * bilangan2;
            System.out.println("Maka Hasil Perkalian: " + hasil);
        } else {
            System.out.println("Kedua bilangan tidak sesuai");
        }
        scanner.close();
    }
}