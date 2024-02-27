/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 2 percabangan genap :
Menentukan nilai indeks akhir mahasiswa A,B,C,D atau E berdasarkan Nilai Akhir (NA) 
dari perihitungan komponen nilai UTS,UAS dan Tugas, dengan bobot nilai berturut-turut 
adalah 35%,45% dan 20%. Dengan ketentuan sebagai berikut:
A Jika 80<=NA<=100
B Jika 70<=NA<80
C Jika 50<=NA<70
*/

package PercabanganGenap;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = scanner.nextDouble();

        double na = (uts * 0.35) + (uas * 0.45) + (tugas * 0.20);

        char indeks;
        if (na >= 80 && na <= 100) {
            indeks = 'A';
        } else if (na >= 70 && na < 80) {
            indeks = 'B';
        } else if (na >= 50 && na < 70) {
            indeks = 'C';
        } else {
            indeks = 'E'; 
        }

        System.out.println("Nilai Akhir (NA): " + na);
        System.out.println("Nilai Indeks: " + indeks);

        scanner.close();
    }
}
