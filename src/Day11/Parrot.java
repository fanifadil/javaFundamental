package Day11;

public class Parrot implements Bird{
    @Override
    public void eat() {
        System.out.println("Parrots can eat up to 100");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrotts can make sound");
    }


    @Override
    public void fly() {
        System.out.println("Parrots can fly");
    }

    public void jumlahKaki() {
        System.out.println(legs());
    }
    @Override
    public int legs(){
        return 4;
    }


}
