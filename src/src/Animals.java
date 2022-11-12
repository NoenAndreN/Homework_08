import java.util.ArrayList;
import java.util.Scanner;



class Animal<Name, Childs> {
    Name name;
    Childs childs;

    public Animal(Name name, Childs childs) {
        this.name = name;
        this.childs = childs;
    }
}

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
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Show animals list");
            System.out.println("2. Add new animal to list");
            System.out.println("3. Exit");
            System.out.println("Select menu: ");


            menuItem = in.nextInt();

            switch (menuItem) {

                case 1:
                    System.out.println("List of animals:");

                    for (int i=0; i<arr.size(); i++)
                        System.out.println(arr.get(i));
                    break;

                case 2:
                    System.out.println("Enter animal name:");
                    String name = in.nextLine();
                    name = in.nextLine();

                    arr.add(name);

                    System.out.println("Congrats! Animal " + name + " added to list!");
                    break;

                case 3:
                    quit = true;
                    break;

                default:
                    System.out.println("Wrong menu item");
            }

        } while (!quit);

        System.out.println("Bye-bye");

    }
}