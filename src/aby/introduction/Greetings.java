package aby.introduction;

import static aby.introduction.Abby.printaby;
import static aby.packages.BasicPack.message;

public class Greetings {
    public static void main(String[] args) {
        printaby();
        System.out.println("Hello world");
        message();
        for (int i = 0; i < 6; i++) {
            System.out.println("Grretingz package");
        }
    }
}
