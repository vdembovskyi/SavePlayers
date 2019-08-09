import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Name1", "10", "weapon1");
        System.out.println(player.toString());
        player.setPower("50");
        player.setWeapon("123");
        save(player);
        load(player);
        System.out.println(player);


    }

    public static void save(ISaveable val) {
        for (int a = 0; a < val.write().size(); a++) {
            val.write().get(a);
        }
    }

    public static void load(ISaveable val) {
        ArrayList<String> list = readValues();
        val.setValues(list);
    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
