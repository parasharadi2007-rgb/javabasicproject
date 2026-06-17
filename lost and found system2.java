import java.util.Scanner;

public class LostAndFoundSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] itemNames = new String[50];
        String[] locations = new String[50];
        String[] statuses = new String[50];

        int count = 0;

        while (true) {

            System.out.println("\n===== Lost and Found System =====");
            System.out.println("1. Add Lost Item");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item");
            System.out.println("4. Mark Item as Found");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item Name: ");
                    itemNames[count] = sc.nextLine();

                    System.out.print("Enter Lost Location: ");
                    locations[count] = sc.nextLine();

                    statuses[count] = "Lost";
                    count++;

                    System.out.println("Item Added Successfully");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Available");
                    } else {
                        System.out.println("\nItems List");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Item: " + itemNames[i]);
                            System.out.println("Location: " + locations[i]);
                            System.out.println("Status: " + statuses[i]);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemNames[i].equalsIgnoreCase(search)) {
                            System.out.println("Item: " + itemNames[i]);
                            System.out.println("Location: " + locations[i]);
                            System.out.println("Status: " + statuses[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Item Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Item Name: ");
                    String item = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (itemNames[i].equalsIgnoreCase(item)) {
                            statuses[i] = "Found";
                            updated = true;
                            System.out.println("Status Updated");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Item Not Found");
                    }
                    break;

                case 5:
                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}