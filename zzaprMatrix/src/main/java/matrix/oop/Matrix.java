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
    public void swapDiagonalPrincipal(){
        int diagonal[] = new int [elements.length];
        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements[i].length; j++){
                if(i==j){
                    for(int k=0; k<diagonal.length; k++)
                    elements[i][j] = diagonal[k];
                }
            }
        }
    }
    public void swapDiagonalSecondary(){
        int diagonal[] = new int [elements.length];
        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements[i].length; j++){
                if(i+j == elements.length-1){
                    for(int k=0; k<diagonal.length; k++)
                    elements[i][j] = diagonal[k];
                }
            }
        }
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
