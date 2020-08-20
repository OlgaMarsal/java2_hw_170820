import java.io.Serializable;

public class Cat implements lesson1.SuperJumpable, lesson1.Runnable, Serializable {
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat "+ name +" run...");
    }

    @Override
    public void jump(int h) {
        System.out.println("Cat " + name + " jump " + h + " meters");
    }

    @Override
    public void superJump() {
        System.out.println("Cat " + name + " SUPER jump!!! " );
    }

    @Override
    public void slowRun() {
        System.out.println("Cat "+ name +" slow run");

    }
}
