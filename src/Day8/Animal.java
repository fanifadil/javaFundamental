package Day8;

public interface Animal {
    void isFly();
    default int countLegs() { return 2;};
}
