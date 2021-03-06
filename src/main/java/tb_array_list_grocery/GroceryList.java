package tb_array_list_grocery;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocery = new ArrayList<>();

    public ArrayList<String> getGrocery() {
        return grocery;
    }

    public void addGroceryItem(String item){
        grocery.add(item);
    }

    public void printGroceryList(){
        if(grocery.size() > 0) {
            for (int i = 0; i < grocery.size(); i++) {
                System.out.println("Item " + (i + 1) + " = " + grocery.get(i));
            }
        } else {
            System.out.println("You have 0 item in grocery list");
        }
    }

    public String printItem(int indexOfItem){
        return grocery.get(indexOfItem);
    }

    private void modifyGroceryItem(int position, String item) {
        grocery.set(position, item);
        System.out.println("The item " + position + " has been modified.");
    }

    public void modifyGroceryItem(String chosenItem, String enteredItem) {
        int position = findItem(chosenItem);
        if(position >= 0){
            modifyGroceryItem(position, enteredItem);
        } else {
            System.out.println("The item " + chosenItem + " is not on the list.");
        }
    }
    public int findItem(String item){

        return grocery.indexOf(item);
    }

    private void removeGroceryItem(int position) {
        grocery.remove(position);
    }

    public void removeGroceryItem(String removedItem) {
        int position = findItem(removedItem);
        if(position >= 0) {
            grocery.remove(position);
        } else {
            System.out.println("The item " + removedItem + " is not on the list.");
        }
    }


}
