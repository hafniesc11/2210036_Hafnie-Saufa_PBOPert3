/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B1

Soal 3 percabangan genap :
Sebuah acara wisata akam menggunakan mobil berkapasitas 7 penumpang per mobil.
Apabila terjadi kelebihan penumpang (meskipun hanya 1 orang), maka mobil yang
digunakan ditambah 1. Buat program untuk menghitung jumlah mobil yang diperlukan
berdasarkan jumlah peserta yang akan ikut.
*/

package PercabanganGenap;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        // Menghitung jumlah mobil yang diperlukan
        int jumlahMobil = (int) Math.ceil((double) jumlahPeserta / 7);

        // Menampilkan jumlah mobil yang diperlukan
        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);

        scanner.close();
    }
}

