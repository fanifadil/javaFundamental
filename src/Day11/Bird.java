package Day11;

public interface Bird extends Animal{
    default public int legs(){
        return 2;
    }
    public void fly();

}
