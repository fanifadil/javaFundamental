package Day8;

public class Fish implements Animal{
    @Override
    public void isFly() {
        System.out.println("Fish is not fly");
    }

    @Override
    public int countLegs() {
        return 0;
    }
}
