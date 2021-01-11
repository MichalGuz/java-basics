package tb_loops_square_star;

public class PrintSquareStar {
    public static void printSquareStar(int number) {
        int rowCount = 0;
        int colCount = 0;

        if(number < 5) {
            System.out.println("Invalid value");
        } else {
            for (int i=0; i<number; i++) {
                if(rowCount == 0 || rowCount == number - 1) {
                    while(colCount < number) {
                        System.out.print("*");
                        colCount++;
                    }
                    colCount = 0;
                }
                if (rowCount > 0 && rowCount < number - 1) {

                }
            }
        }
    }

}
