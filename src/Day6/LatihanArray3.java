package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray3 {
    public int n = initApp();
    int number = 1;
    char alpha = 'A';
    int[] arrInt = new int[this.n];
    String[] arrString = new String[this.n];

    public static void main(String[] args) {
        LatihanArray3 obj = new LatihanArray3();
        obj.polaAngka1();
        obj.polaAngka2();
        obj.polaAlphabet();
        obj.polaAngkaAlphabet();
    }

    public int initApp() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int input = s.nextInt();
        return input;
    }

    public void polaAngka1() {
        if (this.n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                arrInt[i] = number++;
            }
            for (int j = n / 2; j < arrInt.length; j++) {
                arrInt[j] = --number;
            }

        } else {
            for (int i = 0; i <= n / 2 + 1; i++) {
                arrInt[i] = number++;
            }
            for (int j = n / 2 + 1; j < arrInt.length; j++) {
                if (j == n / 2 + 1) {
                    number = number - 2;
                }
                arrInt[j] = --number;
            }

        }
        System.out.println("Pola Pertama = " + Arrays.toString(arrInt));
    }

    public void polaAngka2() {
        if (this.n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                if (i == 0 || i == 1) {
                    arrInt[i] = 1;
                } else {
                    arrInt[i] = arrInt[(i - 2)] + arrInt[(i - 1)];
                }
            }
            int num = 1;
            for (int j = n / 2; j < arrInt.length; j++) {
                arrInt[j] = arrInt[(j - num)];
                num = num + 2;
            }

        } else {
            for (int i = 0; i <= n / 2; i++) {
                if (i == 0 || i == 1) {
                    arrInt[i] = 1;
                } else {
                    arrInt[i] = arrInt[(i - 2)] + arrInt[(i - 1)];
                }
            }
            int num = 2;
            for (int j = n / 2 + 1; j < arrInt.length; j++) {
                arrInt[j] = arrInt[(j - num)];
                num = num + 2;
            }
        }
        System.out.println("Pola Kedua Fibo = " + Arrays.toString(arrInt));
    }

    public void polaAlphabet() {
        if (this.n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                arrString[i] = String.valueOf(alpha);
                ++alpha;
                if (i == n / 2 - 1) {
                    --alpha;
                }
            }
            for (int j = n / 2; j < arrString.length; j++) {
                arrString[j] = String.valueOf(alpha);
                --alpha;
            }

        } else {
            for (int i = 0; i <= n / 2 + 1; i++) {
                arrString[i] = String.valueOf(alpha);
                ++alpha;
                if (i == n / 2 + 1) {
                    --alpha;
                }
            }
            for (int j = n / 2 + 1; j < arrString.length; j++) {
                if (j == n / 2 + 1) {
                    --alpha;
                }
                --alpha;
                arrString[j] = String.valueOf(alpha);
            }

        }
        System.out.println("Deret Huruf = " + Arrays.toString(arrString));
    }

    public void polaAngkaAlphabet() {
        char alphabet = 'A';
        if (this.n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) {
                    arrString[i] = String.valueOf(alphabet);
                    ++alphabet;
                } else {
                    arrString[i] = Integer.toString(number++);
                }

            }
            int num = 1;
            for (int j = n / 2; j < arrString.length; j++) {
                arrString[j] = arrString[(j - num)];
                num = num + 2;
            }
        } else {
            for (int i = 0; i <= n / 2; i++) {
                if (i % 2 == 0) {
                    arrString[i] = String.valueOf(alphabet);
                    ++alphabet;
                } else {
                    arrString[i] = Integer.toString(number++);
                }

            }
            int num = 2;
            for (int j = n / 2 + 1; j < arrString.length; j++) {
                arrString[j] = arrString[(j - num)];
                num = num + 2;
            }
        }
        System.out.println("Pola Deret Huruf Angka = " + Arrays.toString(arrString));
    }
}
