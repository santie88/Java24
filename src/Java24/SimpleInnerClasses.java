package Java24;

public class SimpleInnerClasses {

    class InnerSimple {
        InnerSimple() {
            System.out.println("I am an inner class!");
        }
    }
    public SimpleInnerClasses() {
        // empty constructor
    }

    public static void main(String[] args) {
        SimpleInnerClasses program = new SimpleInnerClasses();
        SimpleInnerClasses.InnerSimple innerSimple = program.new InnerSimple();
    }
}
