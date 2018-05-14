package Java24.Hour08;

public class EnumExample {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println("Level: " + i + " is " + Level.values()[i]); //As a Enm usually has a few values, the cost of using an array is low
        }
    }
}


