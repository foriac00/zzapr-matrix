/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.practice;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author oriac
 */
public class MatrixPractice {

    static Scanner enter = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //comment from bazantm
        
        int rowA, colA, rowB, colB;
        Random r = new Random(); 
        
        System.out.println("Establish the number of rows of the matrix A: ");
        rowA = enter.nextInt();
        
        System.out.println("Establish the number of columns of the matrix A: ");
        colA = enter.nextInt();
        
        System.out.println("Establish the number of rows of the matrix B: ");
        rowB = enter.nextInt();
        
        System.out.println("Establish the number of columns of the matrix B: ");
        colB = enter.nextInt();
        
        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];
        
        //INICIALITATION MATRIX A
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                matrixA[i][j] = (int)(r.nextInt(21)-10);
            }
        }
        //INICIALITATION MATRIX B
        for(int i=0; i<matrixB.length; i++){
            for(int j=0; j<matrixB[i].length; j++){
                matrixB[i][j] = (int)(r.nextInt(21)-10);
            }
        }
        
        PrintMatrix(matrixA, matrixB);
        if(rowA == rowB && colA == colB){
            System.out.println("The matrix dimensions are the same, so we can swap diagonals");
            SwapDiagonals(matrixA, matrixB);
        }
        else{
            System.out.println("We can not swap diagonals because the matrix have not the same dimensions");
        }
    }
    //METHOD FOR PRINT THE MATRIX
    public static void PrintMatrix(int matrixA[][], int matrixB[][]){
        //Matrix A
        System.out.println("Matrix A");
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " ");            
            }
            System.out.println();
        }
        //Matrix B
        System.out.println("Matrix B");
        for(int i=0; i<matrixB.length; i++){
            for(int j=0; j<matrixB[i].length; j++){
                System.out.print(matrixB[i][j] + " ");            
            }
            System.out.println();
        }
    }
    //METHOD FOR SWAP DIAGONALS OF THE TWO MATRIX
    public static void SwapDiagonals(int matrixA[][], int matrixB[][]){
        int[] diagoA = new int[matrixA.length];
        int[] diagoB = new int[matrixB.length];
        
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                if(i==j){
                    diagoA[i] = matrixA[i][j];
                }
            }
        }
        for(int i=0; i<matrixB.length; i++){
            for(int j=0; j<matrixB[i].length; j++){
                if(i+j== matrixB.length - 1){
                    diagoB[i] = matrixB[i][j];
                }
            }
        }
        //SWAP DIAGONAL B TO A
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                if(i+j == matrixA.length - 1){
                    for(int k=0; k<diagoA.length; k++){
                        matrixA[i][j] = diagoB[k];
                    }
                }
            }
        }
        //SWAP DIAGONAL A TO B
        for(int i=0; i<matrixB.length; i++){
            for(int j=0; j<matrixB[i].length; j++){
                if(i==j){
                    for(int k=0; k<diagoB.length; k++){
                        matrixB[i][j] = diagoA[k];
                    }
                }
            }
        }
        //PRINT THE NEW MATRIX
        System.out.println("The new matrix A is: ");
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " ");            
            }
            System.out.println();
        }
        System.out.println("The new matrix B is: ");
        for(int i=0; i<matrixB.length; i++){
            for(int j=0; j<matrixB[i].length; j++){
                System.out.print(matrixB[i][j] + " ");            
            }
            System.out.println();
        }
    }
}
