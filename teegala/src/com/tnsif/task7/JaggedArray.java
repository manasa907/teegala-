package com.tnsif.task7;

public class JaggedArray {

	    public static void main(String[] args) {
	        // Declare a 2D jagged array
	        int[][] jagged = new int[3][]; // 3 rows

	        // Creating different column sizes for each row
	        jagged[0] = new int[3]; // row 0 with 3 elements
	        jagged[1] = new int[2]; // row 1 with 2 elements
	        jagged[2] = new int[4]; // row 2 with 4 elements

	        // -------- Static Insertion --------
	        jagged[0][0] = 10;
	        jagged[0][1] = 20;
	        jagged[0][2] = 30;

	        jagged[1][0] = 40;
	        jagged[1][1] = 50;

	        jagged[2][0] = 60;
	        jagged[2][1] = 70;
	        jagged[2][2] = 80;
	        jagged[2][3] = 90;

	        // -------- Display Jagged Array --------
	        System.out.println("Jagged Array Elements:");
	        for (int i = 0; i < jagged.length; i++) {
	            for (int j = 0; j < jagged[i].length; j++) {
	                System.out.print(jagged[i][j] + " ");
	            }
	            System.out.println(); // new line after each row
	        }
	    }
	}
