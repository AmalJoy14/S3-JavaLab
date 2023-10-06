/**************************************************************
* File        :   MatrixMultiplication.java
* Description :   Java Program to perform matrix multiplication
* Author      :   Amal Joy
* Date        :   06-10-2023
***************************************************************/
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int row1,col1,row2,col2;
		System.out.println("Enter the order of matrix1:");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter the order of matrix2:");
		row2=sc.nextInt();
		col2=sc.nextInt();
		int [][] matrix1=new int[row1][col1];
		int [][] matrix2=new int[row2][col2];
		int [][] matrix3=new int[row1][col2];
		if (col1==row2) 
		{
        System.out.println("Enter the elements in matrix1:");
        for (int i=0;i<row1;i++)
        {
        	for (int j=0;j<col1;j++)
        	{
        		matrix1[i][j]=sc.nextInt();        
        	}
        }
        System.out.println("Enter the elements in matrix2:");
        for (int i=0;i<row2;i++)
        {
        	for (int j=0;j<col2;j++)
        	{
        		matrix2[i][j]=sc.nextInt();        
        	}
        }
        //Matrix Multiplication
        System.out.println("Product Of Matrix Is:");
        for (int i=0;i<row1;i++)
        {
        	for (int j=0;j<col2;j++)
        	{
        	    matrix3[i][j]=0;
        		for (int k=0;k<col1;k++)
        		{
        			matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
        		}
        	    System.out.print(matrix3[i][j]+" ");	
        	}
            System.out.println();
        }
		}
		else 
		{
			System.out.println("Matrix Multiplication not possible");
		}
	}

}
