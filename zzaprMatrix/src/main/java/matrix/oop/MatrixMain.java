/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.oop;

import java.util.Random;
import java.util.Scanner;
import static matrix.practice.MatrixPractice.SwapDiagonals;

/**
 *
 * @author micha
 */
public class MatrixMain {
    public static void main(String[] args) {
        //comment from bazantm
        Scanner enter = new Scanner(System.in);
        
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
        
        Matrix matrixA = new Matrix("Matrix A", rowA, colA);
        matrixA.generateRandomElements(5, 20);
        System.out.println(matrixA);
        
//        int[][] matrixB = new int[rowB][colB];
//        
//        //INICIALITATION MATRIX A
//        for(int i=0; i<matrixA.length; i++){
//            for(int j=0; j<matrixA[i].length; j++){
//                matrixA[i][j] = (int)(r.nextInt(21)-10);
//            }
//        }
//        //INICIALITATION MATRIX B
//        for(int i=0; i<matrixB.length; i++){
//            for(int j=0; j<matrixB[i].length; j++){
//                matrixB[i][j] = (int)(r.nextInt(21)-10);
//            }
//        }
//        
//        PrintMatrix(matrixA, matrixB);
//        if(rowA == rowB && colA == colB){
//            System.out.println("The matrix dimensions are the same, so we can swap diagonals");
//            SwapDiagonals(matrixA, matrixB);
//        }
//        else{
//            System.out.println("We can not swap diagonals because the matrix have not the same dimensions");
//        }
//    }
//    //METHOD FOR PRINT THE MATRIX
//    public static void PrintMatrix(int matrixA[][], int matrixB[][]){
//        //Matrix A
//        System.out.println("Matrix A");
//        for(int i=0; i<matrixA.length; i++){
//            for(int j=0; j<matrixA[i].length; j++){
//                System.out.print(matrixA[i][j] + " ");            
//            }
//            System.out.println();
//        }
//        //Matrix B
//        System.out.println("Matrix B");
//        for(int i=0; i<matrixB.length; i++){
//            for(int j=0; j<matrixB[i].length; j++){
//                System.out.print(matrixB[i][j] + " ");            
//            }
//            System.out.println();
//        }
    }
}
