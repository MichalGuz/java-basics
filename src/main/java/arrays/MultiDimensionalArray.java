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
    }
}

