package Java24.Hour11;

public class GremlinLab {
    public static void main(String[] args) {
        int numGremlins = 100;
        if (numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++) {
                gremlins[i] = new Gremlin();
            }
            System.out.println("There are " + Gremlin.getGremlinCount()
                    + " gremlins.");
        }
    }
}
