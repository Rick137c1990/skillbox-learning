package practice.twoDimensionalArray;

public class TwoDimensionalArray {
    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] newArr = new char[size][size];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j || newArr[i].length - j == i + 1) {
                    newArr[i][j] = SYMBOL;
                } else {
                    newArr[i][j] = ' ';
                }
            }
        }
        return newArr;
    }
}

