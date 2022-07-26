package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanDay4 {
    public int n;
    public int pilihMenu;
    public Scanner input = new Scanner(System.in);

    public void initApp() {
        System.out.print("Masukan Angka = ");
        this.n = input.nextInt();
        System.out.println("Pilih Menu :");
        System.out.println("1. Cetak bintang persegi");
        System.out.println("2. Cetak bintang silang(Harus Bilangan Ganjil)");
        System.out.println("3. Cetak deret angka");
        System.out.println("4. Cetak deret angka dan nomor");
        System.out.println("5. Cetak Ular Bintang");
        System.out.println("6. Cetak Ular Angka Ganjil Genap");
        System.out.println("7. Cetak Ular Angka Berurutan");
        System.out.print("Masukan Nomor Menu = ");
        this.pilihMenu = input.nextInt();
    }

    public void pilihMenuFungsi() {
        switch (this.pilihMenu) {
            case 1:
                bintangPersegi();
                break;
            case 2:
                bintangSilang();
                break;
            case 3:
                deretAngka();
                break;
            case 4:
                deretAngkaAlphabet();
                break;
            case 5:
                printUlarBintang();
                break;
            case 6:
                printUlarGanjilGenap();
                break;
            case 7:
                printUlarUrut();
                break;
            default:
                System.out.println("Menu Tidak Tersedia");
                break;
        }
    }

    public void bintangPersegi() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void bintangSilang() {
        char cetak[][] = new char[this.n][this.n];
        if (this.n % 2 == 1) {
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.n; j++) {
                    if (i == j || i + j == this.n - 1) {
                        cetak[i][j] = '*';
                    } else {
                        cetak[i][j] = ' ';
                    }
                    System.out.print(cetak[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Harap Masukan Bilangan Genap Untuk Menu 2");
        }
    }

    public void deretAngka() {
        int array[] = new int[this.n];
        int inc = 2;
        int inc2 = 3;
        int total = 0;
        int total2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = (total = total + inc);
            } else {
                array[i] = (total2 = total2 + inc2);
            }
            System.out.printf("%3d", array[i]);
        }


    }

    public void deretAngkaAlphabet() {
        String array[] = new String[this.n];
        char[] JavaCharArray = {'A', 'B', 'C', 'D', 'E'};
        int angka = 1;
        int alphabet = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = Integer.toString(angka++);
            } else {
                array[i] = String.valueOf(JavaCharArray[alphabet++]);
            }
        }
        System.out.println(Arrays.toString(array));
//        int angka = 0;
//        char huruf = 'A';
//        for(int i = 0; i<this.n; i++){
//            if(this.n%2 == 0){
//                angka = angka + 1;
//                System.out.print(angka);
//            } else {
//                System.out.print(huruf);
//                huruf = ++huruf;
//
//            }
//        }

    }

    public void printUlarBintang() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%3s", "*");
                } else if (i % 4 == 1 && j == this.n-1) {
                    System.out.printf("%3s", "9");
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3s", "7");
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println("");
        }
    }

    public void printUlarGanjilGenap() {
        int genap = 0;
        int ganjil = 0;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (i % 4 == 0) {
                    System.out.printf("%3s", j*2+2);
                } else if (i % 4 == 2) {
                    System.out.printf("%3s", j*2+1);
                } else if (i % 4 == 1 && j == this.n-1) {
                    System.out.printf("%3s", "*");
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3s", "*");
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println("");
        }

    }

    public void printUlarUrut() {
        int counter = 0;
        for (int i = 0; i < this.n; i++) {
            if (i % 4 == 2) {
                counter = counter+this.n;
            }
            for (int j = 0; j < this.n; j++) {
                if (i % 4 == 0) {
                    System.out.printf("%3d", ++counter);
                } else if (i % 4 == 2) {
                    System.out.printf("%3d", --counter);
                } else if (i % 4 == 1 && j == this.n-1) {
                    System.out.printf("%3d", ++counter);
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3d", ++counter);
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            if (i % 4 == 2) {
                counter = counter+this.n;
            }
            System.out.println("");
        }
    }





    public void runApp() {
        initApp();
        pilihMenuFungsi();
    }
}
