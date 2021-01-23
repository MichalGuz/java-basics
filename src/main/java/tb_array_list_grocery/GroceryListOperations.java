package tb_array_list_grocery;

import tb_add_array_list_grocery.GroceryListTemp;

import java.util.Scanner;

public class GroceryListOperations {
    private static GroceryList groceryList = new GroceryList();
    public static Scanner scanner = new Scanner(System.in);

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item to modify:\n");
        String modifiedItem = scanner.nextLine();
        System.out.print("Enter a new item:\n");
        String enteredItem = scanner.nextLine();
        groceryList.modifyGroceryItem(modifiedItem, enteredItem);
    }

    public static void removeItem() {
        System.out.print("Enter item to remove:\n");
        String removedItem = scanner.nextLine();
        groceryList.removeGroceryItem(removedItem);
    }

    public static void searchItem(){
        System.out.print("Enter item to search for:\n");
        String searchedItem = scanner.nextLine();
        int index = groceryList.findItem(searchedItem);
        if ( index >= 0) {
            System.out.println("Found " + groceryList.printItem(index) + " in our grocery list");
        } else {
            System.out.println(searchedItem + " is not on the shopping list");
        }
    }

    public static void operate() {}

}
