//If an element in an M/N matrix is zero, make its row and column values zero

class ZeroMatrix{
	public static void main(String[] args){
		int[][] matrix = {
							{1, 2, 3, 4, 5},
							{1, 0, 3, 0, 5},
							{1, 2, 3, 4, 5},
							{1, 2, 0, 4, 5},
							{1, 2, 3, 4, 5},
						};
		System.out.println("Initial matrix:");
		printMatrix(matrix);
		System.out.println("Zero matrix:");
		printMatrix(getZeroMatrix(matrix));
		
	}
	
	static void printMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	static int[][] getZeroMatrix(int[][] matrix){
		boolean[] skipColumns = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			boolean makeRowZero = false;
			for(int j=0;j<matrix[i].length;j++){
				if(!skipColumns[j] && matrix[i][j] == 0){
					setColumnValuesZero(matrix, j);
					skipColumns[j] = true;
					makeRowZero = true;					
				}
			}
			if(makeRowZero){
				setRowValuesZero(matrix, i);
			}
		}
		
		return matrix;
	}
	
	static void setRowValuesZero(int[][] matrix, int row){
		//set row values to zero
		for(int i=0;i<matrix[row].length;i++){
			matrix[row][i] = 0;
		}				
	}
	
	static void setColumnValuesZero(int[][] matrix, int column){		
		//set column values to zero
		for(int i=0;i<matrix.length;i++){
			matrix[i][column] = 0;
		}
	}
}