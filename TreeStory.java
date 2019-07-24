import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Give me and adjective: ");

        console.printf("%s is a very %s", name, adjective);
    }
}