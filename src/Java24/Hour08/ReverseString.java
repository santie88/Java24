package Java24.Hour08;

public class ReverseString {
    public static void main(String[] args) {
        String[] text = {"a","b","c","d","e","f","g"};
        int length = text.length;
        String[] reverseText = new String[length];
        int i, j;
        for (i = 0, j = length - 1; i < j; i++, j--){
            reverseText[i] = text[j];
            reverseText[j] = text[i];
        }
        if(i == j) reverseText[i] = text[i];

        System.out.println("Original Text: " + String.join(",", text));
        System.out.println("Reversed Text: " + String.join(",", reverseText));
    }
}
