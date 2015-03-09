/**
 * Created by jc277099 on 9/03/15.
 */
public class App {


    public static void main(String[] args) {
        String text = "This is a simple test \n OneTwoThree\n Hello world!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}