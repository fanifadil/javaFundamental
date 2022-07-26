package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray2 {
    public int n = initApp();
    public int[] storage = new int[this.n];
    public int number;

    public static void main(String[] args) {
        LatihanArray2 obj = new LatihanArray2();
        obj.initApp();
        obj.ganjil();
        obj.genap();
        obj.fibonacci();
        obj.tribonacci();
        obj.incAlpha();
    }

    public int initApp() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan N =");
        int input = s.nextInt();
        System.out.println("Test");
        return input;
    }

    public void ganjil() {
        this.number = 1;
        for (int i = 0; i < storage.length; i++) {
            storage[i] = number;
            number = number + 2;
        }
        System.out.println("Bilangan Ganjil = " + Arrays.toString(storage));
    }

    public void genap() {
        this.number = 2;
        for (int i = 0; i < storage.length; i++) {
            storage[i] = number;
            number = number + 2;
        }
        System.out.println("Bilangan Genap = " + Arrays.toString(storage));
    }

    public void fibonacci() {
        number = 1;
        for (int i = 0; i < storage.length; i++) {
            if (i == 0 || i==1){
                storage[i] = number;
            } else {
                storage[i] = storage[(i-2)] + storage[(i-1)];
            }
        }

        System.out.println("Bilangan Fibonacci = " + Arrays.toString(storage));
    }

    public void tribonacci(){
        number = 1;
        for (int i = 0; i < storage.length; i++) {
            if (i == 0 || i==1 || i==2){
                storage[i] = number;
            } else {
                storage[i] = storage[(i-3)] + storage[(i-2)] + storage[(i-1)];
            }
        }

        System.out.println("Bilangan Tribonacci = " + Arrays.toString(storage));
    }

    public void incAlpha(){
        String[] arrHuruf = new String[this.n];
        char alpha = 'A';
        for(int i = 0; i < storage.length; i++){
            arrHuruf[i] = String.valueOf(alpha);
            ++alpha;
        }
        System.out.println("Deret Huruf = " + Arrays.toString(arrHuruf));
    }
}
