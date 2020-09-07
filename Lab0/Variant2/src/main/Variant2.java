package main;

public class Variant2 {

    

    /**
     * @param number is kilograms
     * @return number of full tons
     */
    public static long integerNumberTask(long number) {

        return number/=1000;
    }

    /**
     *
     * @param number
     * @return check that number is odd
     */
    public static boolean booleanTask(long number) {

        return number%2!=0;
    }

    /**
     * @param number is integer if it positive add to it 1 otherwise substract 2
     * @return transform number
     */
    public static long ifTask(long number) {

        return number = number > 0L ? number + 1L :  number-2;
    }

    /**
     * @param number is byte describe the grade (1 - "bad", 2 - "unsatisfactory", 3 - "satisfactory", 4 - "good", 5 - "excellent")
     *          If number is not in the range 1–5, then output the string "error".
     * @return
     */
    public static String caseTask(byte number) {

        String result;
        switch(number) {
            case 1: result="bad";
                    break;
            case 2: result="unsatisfactory";
                    break;
            case 3: result="satisfactory";
                    break;
            case 4: result="good";
                    break;
            case 5: result="excellent";
                    break;
            default: result="error";
        }
        return result;
    }

    /**
     * @param firstNumber is integer
     * @param secondNumber is integer
     *                     firstNumber<secondNumber
     *                     print in increasing order all integers between firstNumber and secondNumber
     *                     and amount of printed numbers
     * @result array with numbers and on last place their amount
     */
    public static long[] forTask(long firstNumber, long secondNumber) {

        long amountOfNumbers=0L;
        long[] result = new long[12];
        int j=0;
        for (long i = firstNumber; i <= secondNumber; i++) {
            result[j]=i;
            j++;
            amountOfNumbers++;

        }
        result[j]=amountOfNumbers;
        return result;
    }

    /**
     *
     * @param firstNumber is integer
     * @param secondNumber is integer
     *                     firstNumber>secondNumber
     *                     find amount of segments length secondNumber in segment length firstNumber
     * @return amount of segments length secondNumber in segment length firstNumber
     */
    public static long whileTask(long firstNumber, long secondNumber) {

        long amountOfSegments=0L;
        while (firstNumber>=secondNumber) {
            firstNumber-=secondNumber;
            amountOfSegments++;
        }
        return amountOfSegments;
    }

    /**
     *
     * @param amountOfPairs is integer amount of pairs which describe length pf sides in rectangles
     * @return min area among all rectangles
     */
    public static long minMaxTask(long amountOfPairs, long[] arrayOfPoinsASide,long[] arrayOfPoinsBSide) {

        long area;
        long aSide=arrayOfPoinsASide[0];
        long bSide=arrayOfPoinsBSide[0];
        area = aSide*bSide;
        for (int i = 1; i < amountOfPairs; i++) {
            aSide = arrayOfPoinsASide[i];
            bSide = arrayOfPoinsBSide[i];
            if(aSide*bSide<area) {
                area = aSide*bSide;
            }
        }
        return area;
    }

    /**
     *
     * @param number is integer
     *               form and output an integer array size of number containing powers of two from 1 to N
     * @result array of number containing powers of two
     */
    public static int[] arrayTask(int number) {

        int[] powersOfTwo = new int[number];
        for (int i = 0; i < number; i++) {
            powersOfTwo[i]= (int) Math.pow(2,i+1);
        }
        return powersOfTwo;
    }

    /**
     *
     * @param M is integer
     * @param N is integer
     *          form an integer matrix M x N in which all elements in J-th column have the value 5*J (J from 1 to N)
     */
    public static int[][] matrixTask(int M, int N,int[][] matrix) {

        for (int i = 0; i <M ; i++) {
            for (int j = 0; j <N ; j++) {
                matrix[i][j]=5*(j+1);
            }
        }
        /*for (int i = 0; i <M ; i++) {
            for (int j = 0; j <N ; j++) {
                System.out.println(matrix[i][j]+" ");
            }
        }
        */

        return matrix;
    }

    public static void main(String[] args) {

        matrixTask(3,3,new int[][]{{1,1,1},{1,1,1},{1,1,1}});
        //Scanner scanner = new Scanner(System.in);
        /*
        * long num = scanner.nextLong();
        * System.out.println(integerNumberTask(num));
         */
        //System.out.println(booleanTask(num));
        //System.out.println(ifTask(num));
        //System.out.println(caseTask((byte) 3));
        //System.out.println(forTask(10L,20L));
        //System.out.println(whileTask(21,3));
        //System.out.println(minMaxTask(5));
        //arrayTask(10);
        //matrixTask(3,3);

    }
}

