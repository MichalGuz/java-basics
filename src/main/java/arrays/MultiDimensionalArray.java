package arrays;

public class MultiDimensionalArray {

    public void multiDimensionalArray(){

        // 1D array
        int[] values = {10, 20, 30, 40, 50};

        // only need 1 index to access values
        System.out.println("First item in array: " + values[0]);
        System.out.println("Last item in array: " + values[4]);

        // 2D array
        int[][] grid = {
                {10, 11, 12, 13},
                {20, 21, 22, 23, 24},
                {30, 31, 32},
                {40, 41, 42, 43, 44, 45},
        };

        // need 2 indices to access values
        System.out.println("First item in array: " + grid[0][0]);
        System.out.println("Last item in array: " + grid[3][5]);

        // can also create without initializing
        String[][] texts = new String[3][4];

        texts[0][0] = "row 1 and column 1: ";
        texts[2][3] = "row 3 and column 5: ";

        System.out.println("First item in the 2D array is: ");
        System.out.println("Last item in the 2D array is:");

        // how to iterate through 2D array ?
        // first iterate through rows, then for each row
        // go through the columns
        System.out.println("\n[2D array]");
        for(int row=0; row < grid.length; row++){
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
        }
    }
}
