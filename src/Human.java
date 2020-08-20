public class Human implements SuperJumpable, Runnable, Jumpable{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Human "+ name +" run...");

    }

    @Override
    public void jump(int h) {
        System.out.println("Human " + name + " jump " + h + " meters");
    }

    @Override
    public void superJump() {
        System.out.println("Human " + name + " SUPER jump!!! " );
    }
}
