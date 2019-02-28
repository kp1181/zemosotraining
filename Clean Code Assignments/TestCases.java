import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void TestCase1(){
        int[][] inputMatrix = {{1,0},{1,1},{1,1}};
        int[][] actualOutput = MatrixZeroHandler.handleZeros(inputMatrix);
        int[][] expectedOutput = {{0,0},{1,0},{1,0}};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase2(){
        int[][] inputMatrix = {{3,2,0}};
        int[][] actualOutput = MatrixZeroHandler.handleZeros(inputMatrix);
        int[][] expectedOutput = {{0,0,0}};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase3(){
        int[][] inputMatrix = {{2},{0},{1}};
        int[][] actualOutput = MatrixZeroHandler.handleZeros(inputMatrix);
        int[][] expectedOutput = {{0},{0},{0}};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase4(){
        int[][] inputMatrix = {{5,3,0},{1,2,4},{0,3,1}};
        int[][] actualOutput = MatrixZeroHandler.handleZeros(inputMatrix);
        int[][] expectedOutput = {{0,0,0},{0,2,0},{0,0,0}};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestCase5(){
        int[][] inputMatrix = {{3,2,1},{2,0,1},{0,2,3},{3,3,5}};
        int[][] actualOutput = MatrixZeroHandler.handleZeros(inputMatrix);
        int[][] expectedOutput = {{0,0,1},{0,0,0},{0,0,0},{0,0,5}};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }


}
