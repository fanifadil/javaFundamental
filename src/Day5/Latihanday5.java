package Day5;

import java.util.Scanner;

public class Latihanday5 {
    public int n = initApp();
    public int initApp() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int input = s.nextInt();
        return input;
    }

    public void printLatihan1() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if  (i % 2 == 0 && j <= i) {
                    System.out.printf("*");
                } else if (i % 2 == 1 && j + i >= this.n - 1) {
                    System.out.printf("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printLatihan2(){
        int counter = this.n * (this.n-1) + 1;
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < counter; j++){
                if (i%(this.n-1) == 0) {
                    System.out.printf("%3s", "*");
                } else {
                    if(j%(this.n-1) == 0){
                        System.out.printf("%3s", "*");
                    } else {
                        System.out.printf("%3s", " ");
                    }
                }
            }
            System.out.println("");
        }

//        for (int i = 0; i < this.n; i++){
//            for (int j = 0; j < (this.n-1)*this.n+1; j++) {
//                if(j*i % (this.n-1) == 0){
//                    System.out.printf("%3s", "*");
//                } else {
//                    System.out.printf("%3s", " ");
//                }
//            }
//            System.out.println("");
//        }
    }

    public static void main(String[] args) {
        Latihanday5 obj = new Latihanday5();
        obj.printLatihan1();
        System.out.println("=======================================");
        obj.printLatihan2();
    }
}
