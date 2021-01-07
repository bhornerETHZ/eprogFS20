//Exercise 2
package eprogFS20;

public class Matrix {

	public static void main(String[] args) {
		int[][] in1 = { {1, 5, 9}, {8, 3, 4}, {6, 7, 2}};
		int [][] in2 = { {4, 9, 2}, {3, 5, 7}, {8, 1, 6} };
		int [][] in3 = {{11, 18, 25, 2, 9}, {10, 12, 19, 21, 3}, {4, 6, 13, 20, 22}, {23, 5, 7, 14, 16}, {17, 24, 1, 8, 15}
		};
        	int[][] in4 = { {1, 5, 9}, {3, 8, 4}, {6, 7, 2} };
        	int[][] in5 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        	checkMatrix(in1);  //true
        	checkMatrix(in2);  //true
        	checkMatrix(in3);  //true
        	checkMatrix(in4);  //false
        	checkMatrix(in5);  //false
		// TODO Auto-generated method stub

	}

	public static boolean checkMatrix(int[][] m) {
		//TODO
		return false;
	}
}
