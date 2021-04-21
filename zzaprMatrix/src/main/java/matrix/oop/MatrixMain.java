/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.oop;

import java.util.Arrays;
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
        
        Matrix matrixA = new Matrix("Original Matrix A", rowA, colA);
        matrixA.generateRandomElements(-10, 10);
        matrixA.getPrincipalDiagonal();
        System.out.println(matrixA);
        System.out.println("Principal Diagonal: " + Arrays.toString(matrixA.getPrincipalDiagonal()));

        Matrix matrixB = new Matrix("Original Matrix B", rowB, colB);
        matrixB.generateRandomElements(-10, 10);
        matrixB.getSecondaryDiagonal();
        System.out.println(matrixB);
        System.out.println("Secondary Diagonal: " + Arrays.toString(matrixB.getSecondaryDiagonal()));
        
        if(rowA==rowB && colA==colB){
            matrixA.swapPrincipalDiagonalWithSecondary(matrixB);
            matrixB.swapSecondaryDiagonalWithPrincipal(matrixA);
        }
        else{
            System.out.println("The dimensions of the matrix are not the same so we can not change the diagonals");
        }
        //PRINT THE MATRIX CHANGED
        System.out.println(matrixA);
        System.out.println(matrixB);
    }
}
