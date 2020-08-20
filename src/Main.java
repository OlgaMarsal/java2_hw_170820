public class Main {
    public static void main(String[] args) {
//        Object o = "java";
//        ((String) o).length();
//        System.out.println(o instanceof String);

//        SuperJumpable cat = new Cat("Barsik");
//        cat.superJump();
//
//        SuperJumpable human = new Human("Man");
//        human.superJump();

        SuperJumpable[] superJumpables = {
                new Cat("Barsik"),
                new Human("Man"),
                new Robot("R2D2"),
        };

        for (SuperJumpable sJ : superJumpables) {
            sJ.superJump();
        }


    }
}