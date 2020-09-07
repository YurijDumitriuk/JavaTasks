package test;

import main.Variant2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Tests {

    @Test
    public void massTest() {
        assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test(dataProvider = "integerTaskProvider")
    public void integerTaskTest(long number, long expected) {
        Variant2 item = new Variant2();
        long actual = item.integerNumberTask(number);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] integerTaskProvider() {
        return new Object[][]{{5050, 5}, {0, 0},{900,0}};
    }


    @Test(dataProvider = "booleanTaskProvider")
    public void booleanTaskTest(long number, boolean expected) {
        Variant2 item = new Variant2();
        boolean actual = item.booleanTask(number);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] booleanTaskProvider() {
        return new Object[][]{{3L, true}, {2L, false},{0L,false}};
    }


    @Test(dataProvider = "ifTaskProvider")
    public void ifTaskTest(long number, long expected) {
        Variant2 item = new Variant2();
        long actual = item.ifTask(number);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] ifTaskProvider() {
        return new Object[][]{{3L, 4L}, {-2L, -4L},{0L,-2L}};
    }

    @Test(dataProvider = "caseTaskProvider")
    public void caseTaskTest(byte number, String expected) {
        Variant2 item = new Variant2();
        String actual = item.caseTask(number);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] caseTaskProvider() {
        return new Object[][]{{(byte)1, "bad"}, {(byte)-3, "error"},{(byte)3,"satisfactory"}};
    }


    @Test(dataProvider = "forTaskProvider")
    public void forTaskTest(long number1,long number2, long[] expected) {
        Variant2 item = new Variant2();
        long[] actual = item.forTask(number1,number2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] forTaskProvider() {
        return new Object[][]{{10, 20,new long[]{ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 11 }}};
    }


    @Test(dataProvider = "whileTaskProvider")
    public void whileTaskTest(long number1,long number2, long expected) {
        Variant2 item = new Variant2();
        long actual = item.whileTask(number1,number2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] whileTaskProvider() {
        return new Object[][]{{2, 3,0},{20,3,6}};
    }

    @Test(dataProvider = "minMaxTaskProvider")
    public void minMaxTaskTest(long number1,long[] array1,long[] array2, long expected) {
        Variant2 item = new Variant2();
        long actual = item.minMaxTask(number1,array1,array2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] minMaxTaskProvider() {
        return new Object[][]{{5, new long[]{2, 3, 4, 6, 2}, new long[]{1, 3, 5, 6, 9}, 2}};
    }

    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(int number1,int[] expected) {
        Variant2 item = new Variant2();
        int[] actual = item.arrayTask(number1);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] arrayTaskProvider() {
        int in = 6;
        int[] out = {2,4,8,16,32,64};
        return new Object[][]{{in,out}};
    }

    @Test(dataProvider = "matrixTaskProvider")
    public void matrixTaskTest(int number1,int number2,int[][]matrix,int[][] expected) {
        Variant2 item = new Variant2();
        int[][] actual = item.matrixTask(number1,number2,matrix);
        for (int i = 0; i < number1; i++) {
            assertEquals(actual[i],expected[i]);
        }
    }

    @DataProvider
    public Object[][] matrixTaskProvider() {
        int[][] input = {{1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}};
        int[][] output= {{5, 10, 15},
                          {5, 10, 15},
                          {5, 10, 15}};
        return new Object[][]{{3,3, input,output}};
    }


}
    



