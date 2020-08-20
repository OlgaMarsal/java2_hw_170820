public class Robot implements SuperJumpable, Jumpable, Runnable {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot "+ name +" run...");

    }

    @Override
    public void jump(int h) {
        System.out.println("Robot " + name + " jump " + h + " meters");
    }

    @Override
    public void superJump() {
        System.out.println("Robot " + name + " SUPER jump!!! " );
    }
}
