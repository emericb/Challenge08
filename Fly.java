public interface Fly {
    void takeOff();
    int ascend(int altitude);
    int descend(int altitude);

    public default void glide() {
        System.out.println("It glides into the air.");
    }
    public void land();
}