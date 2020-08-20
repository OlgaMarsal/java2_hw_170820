@FunctionalInterface
public interface Runnable {
    void run();
    default void slowRun() {
        System.out.println(" slowRun");
    }

}
