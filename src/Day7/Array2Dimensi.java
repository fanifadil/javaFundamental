package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Dimensi {
    public int n = getN();
    String[][] arr = new String[n][n];

    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan N");
        int n = s.nextInt();
        return n;
    }

    public void cetakBintang() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "*";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public void cetakUlarBintang() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0 && j < n) {
                    arr[i][j] = "*";
                } else if (i % 4 == 1 && j == n - 1) {
                    arr[i][j] = "*";
                } else if (i % 4 == 3 && j == 0) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
                System.out.printf("%3s",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("==================================");
    }

    public void cetakUlarGanjilGenap(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i % 4 == 0 && j < n) {
                    arr[i][j] = Integer.toString(j*2);
                } else if (i % 4 == 2 && j < n) {
                    arr[i][j] = Integer.toString(j*2+1);
                } else if (i % 4 == 1 && j == n - 1) {
                    arr[i][j] = "*";
                } else if (i % 4 == 3 && j == 0) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("==================================");
    }

    public void cetakUlarAngka(){
        int counter = 0;
        for (int i = 0; i < this.n; i++) {
            if (i % 4 == 2) {
                counter = counter+this.n;
            }
            for (int j = 0; j < this.n; j++) {
                if (i % 4 == 0) {
                    arr[i][j] = Integer.toString(++counter);
                } else if (i % 4 == 2) {
                    arr[i][j] = Integer.toString(counter--);
                } else if (i % 4 == 1 && j == this.n-1) {
                    arr[i][j] = Integer.toString(++counter);
                } else if (i % 4 == 3 && j == 0) {
                    arr[i][j] = Integer.toString(++counter);
                } else {
                    arr[i][j] = " ";
                }
                System.out.printf("%3s", arr[i][j]);
            }
            if (i % 4 == 2) {
                counter = counter+this.n;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Array2Dimensi obj = new Array2Dimensi();
//        obj.cetakBintang();
        obj.cetakUlarBintang();
        obj.cetakUlarGanjilGenap();
        obj.cetakUlarAngka();
    }
}
