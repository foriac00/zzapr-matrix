package matrix.oop;

import java.util.Random;

public class Matrix {

    private String name;
    private int[][] elements; // field for matrix elements

    Matrix(String name, int numberOfRows, int numberOfColumns) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException();
        }
        if (0 < numberOfRows && 0 < numberOfColumns) {
            elements = new int[numberOfRows][numberOfColumns];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void generateRandomElements(int a, int b) {
        Random r = new Random(0);
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] = (int) (r.nextInt(b - a + 1) - b);
            }
        }
    }

    public int getMinofRowsColumns() {
        return Math.min(elements.length, elements[0].length);
    }

    public int[] getPrincipalDiagonal() {
        int minRowsCol = getMinofRowsColumns();
        int diagonal[] = new int[minRowsCol];

        for (int i = 0; i < minRowsCol; i++) {
            diagonal[i] = elements[i][i];
        }

        return diagonal;
//        for(int i=0; i<elements.length; i++){
//            for(int j=0; j<elements[i].length; j++){
//                if(i==j){
//                    for(int k=0; k<diagonal.length; k++)
//                    elements[i][j] = diagonal[k];
//                }
//            }
//        }
    }

    public int[] getSecondaryDiagonal() {
        int diagonal[] = new int[elements.length];
        int minRowsCol = getMinofRowsColumns();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (i + j == elements.length - 1) {
                    diagonal[i] = elements[i][j];
                }
            }
        }

        return diagonal;
    }

    public void swapDiagonals(Matrix m) {
        int[] secondaryDiagAnotherMatrix = m.getSecondaryDiagonal();

        int columnMatA = 0;
        int columnMatB = elements[0].length;

        for (int i = 0; i < secondaryDiagAnotherMatrix.length; i++) {
            int tmp = elements[i][columnMatA];
            elements[i][columnMatA] = m.elements[i][columnMatB];
            m.elements[i][columnMatB] = tmp;

            columnMatA++;
            columnMatB--;
        }
    }

    private boolean haveTheSameNumberOfRows(int numberOfRows) {
        return elements.length == numberOfRows;
    }

    private boolean haveTheSameNumberOfColumns(int numberOfColumns) {
        return elements[0].length == numberOfColumns;
    }

    private boolean haveTheSameDimensions(Matrix m) {
        if (haveTheSameNumberOfRows(m.elements.length)
                && haveTheSameNumberOfColumns(m.elements[0].length)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String text = "";

        text += this.name + "\n";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                text += String.format("%6d", elements[i][j]);
            }
            text += "\n";
        }
        return text;
    }

}
