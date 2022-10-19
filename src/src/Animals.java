import java.util.ArrayList;
import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Dog");
        arr.add("Cat");
        arr.add("Rabbit");

        boolean quit = false;

        int menuItem;

        do {
            System.out.println("");             // empty string
            System.out.println("Menu:");
            System.out.println("1. Show animals list");
            System.out.println("2. Add new animal to list");
            System.out.println("3. Exit");
            System.out.println("Select menu: ");


            menuItem = in.nextInt();

        } while (!quit);

        System.out.println("Bye-bye");

    }
}