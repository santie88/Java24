package Java24.Hour08;

public class NamingLoopBreak {
    public static void main(String[] args) {
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
                if (points > 50) {
                    break targetLoop;
                }
                points = points + i;
            }
        }
    }
}
