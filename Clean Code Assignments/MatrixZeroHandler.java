import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/*
*
* Good practices used in the code:
*   -functions should be small
*   -functions should do one thing and they should do that only
*   -every function to be followed by those at the next level of abstraction descending
*    one level of abstraction at a time
*   -A long descriptive name is better than a long descriptive comment.
*   -Functions arguments should not be more than two
*   -Functions should not do unexpected changes to variables of the class
*
*
* Space complexity of the program(apart from storing the input matrix):
*   -O(m + n)
*       where m is number of row and n is number of columns
*
*   O(m + n)  space complexity is due to creation of two array each of size m and n
*   to store the rows and columns which have zeros
*
 * */

public class MatrixZeroHandler {

    private static Logger logger = Logger.getLogger(MatrixCleaner.class.getName());

    public static void main(String args[]){

        try{
            int[][] inputMatrix = readMatrixData();
            int[][] zeroHandledMatrix = handleZeros(inputMatrix);
            printMatrix(zeroHandledMatrix);
        }
        catch (NegativeArraySizeException e){
            logger.warning("Number of rows or columns should not be negative");
        }
        catch(InputMismatchException e)
        {
            logger.warning("Please enter values properly!");
        }

    }


    /*
    * This method will read input from the user through console and returns the matrix given by user
     */
    private static int[][] readMatrixData(){
        Scanner sc = new Scanner(System.in);
        logger.info("Enter number of rows and columns (seperated with space):");
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();
        int[][] inputMatrix = new int[numberOfRows][numberOfColumns];
        logger.info("Enter the matrix");
        for(int currentRow=0;currentRow<numberOfRows;currentRow++){
            for(int currentColumn=0;currentColumn<numberOfColumns;currentColumn++){
                inputMatrix[currentRow][currentColumn] = sc.nextInt();
            }
        }
        sc.close();
        return inputMatrix;
    }


    /*
    * This method provides the core functionality of the program.
    *
    * It will take a matrix as input and returns a matrix such that if an element in the
    * input matrix is zero, then that entire row and column are set to zero.
    *
    * @param inputMatrix
    *        matrix given by user
     */
    public static int[][] handleZeros(int[][] inputMatrix) {

        int[] zeroRows = findZeroRows(inputMatrix);
        int[] zeroColumns = findZeroColumns(inputMatrix);


        int[][] zeroRowsHandledMatrix  = handleZeroRows(inputMatrix,zeroRows);
        int[][] zeroHandledMatrix  = handleZeroColumns(zeroRowsHandledMatrix,zeroColumns);

        return zeroHandledMatrix;


    }


    /*
    * This method will find the rows which have zeros in them .
    *
    * It will return an array with which has value of 1 at an index if that row has atleast one zero in it.
    *
    * @param inputMatrix
    *        matrix given by user
    * */
    private static int[] findZeroRows(int[][] inputMatrix) {
        int[] zeroRows = new int[inputMatrix.length];

        for(int currentRow=0;currentRow<inputMatrix.length;currentRow++){
            for(int currentColumn=0;currentColumn<inputMatrix[currentRow].length;currentColumn++){
                if(inputMatrix[currentRow][currentColumn]==0){
                    zeroRows[currentRow] = 1;
                }
            }
        }

        return zeroRows;
    }


    /*
     * This method will find the columns which have zeros in them .
     *
     * It will return an array with which has value of 1 at an index if that column has atleast one zero in it.
     *
     * @param inputMatrix
     *        matrix given by user
     * */
    private static int[] findZeroColumns(int[][] inputMatrix) {
        int[] zeroColumns = new int[inputMatrix[0].length];

        for(int currentRow=0;currentRow<inputMatrix.length;currentRow++){
            for(int currentColumn=0;currentColumn<inputMatrix[currentRow].length;currentColumn++){
                if(inputMatrix[currentRow][currentColumn]==0){
                    zeroColumns[currentColumn] = 1;
                }
            }
        }

        return zeroColumns;
    }


    /*
    * This method will make a row as zeros if atleast one element in that row is zero
    *
    * It will return matrix in which all the rows with atleast one zero will be marked as zero
    *
    * @param inputMatrix
    *        matrix given by user
    *
    * @param zeroRows
    *        An array containing rows which have atleastone zero
    * */
    private static int[][] handleZeroRows(int[][] inputMatrix, int[] zeroRows) {

        for(int currentRow=0;currentRow<inputMatrix.length;currentRow++){
            for(int currentColumn=0;currentColumn<inputMatrix[currentRow].length;currentColumn++){
                if(zeroRows[currentRow]==1){
                    inputMatrix[currentRow][currentColumn] = 0;
                }
            }

        }
        return inputMatrix;
    }


    /*
     * This method will make a column as zeros if atleast one element in that column is zero
     *
     * It will return matrix in which all the columns with atleast one zero will be marked as zero
     *
     * @param inputMatrix
     *        matrix given by user
     *
     * @param zeroColumns
     *        An array containing columns which have atleastone zero
     * */
    private static int[][] handleZeroColumns(int[][] inputMatrix, int[] zeroColumns) {
        for(int currentColumn=0;currentColumn<inputMatrix[0].length;currentColumn++){
            for(int currentRow=0;currentRow<inputMatrix.length;currentRow++){
                if(zeroColumns[currentColumn]==1){
                    inputMatrix[currentRow][currentColumn] = 0;
                }
            }
        }
        return inputMatrix;
    }


    /*
    * This method will print a matrix using logger
    *
    * @param matrix
    *        The matrix which has to be printed
    * */
    private static void printMatrix(int[][] matrix) {
        String loggableMatrix="\n";
        for(int currentRow=0;currentRow<matrix.length;currentRow++){
            for(int currentColumn=0;currentColumn<matrix[0].length;currentColumn++){
                loggableMatrix = loggableMatrix + matrix[currentRow][currentColumn] + " ";
            }
            loggableMatrix += "\n";
        }
        logger.info(loggableMatrix);
    }


}
