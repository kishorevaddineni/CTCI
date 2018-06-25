//Rotates the matrix clockwise by 90 degrees, expects one argument (image size) to generate the matrix
class RotateImage{
	public static void main(String[] args){
		//Generate test image matrix
		int size = Integer.parseInt(args[0]);
		int[][] image = new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				image[i][j] = (j+1) + (i*size);
			}
		}
		System.out.println("Original Image:");
		printImage(image);
		System.out.println("Rotated Image (90degrees clockwise) is: ");
		printImage(rotateImage(image));
		
	}
	static void printImage(int[][] image){
		for(int i=0;i<image.length;i++){
			for(int j=0;j<image[i].length;j++){
				System.out.print(image[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	static int[][] rotateImage(int[][] image){
		int N = image.length;
		for(int layer=0;layer<N/2;layer++){
			int lastIndex = (N-1)-layer;
			for(int i=layer;i<lastIndex;i++){
				
				//replace first row - last column with first row - first column
				int temp = image[layer+i][lastIndex];
				image[layer+i][lastIndex] = image[layer][layer+i];
				image[layer][layer+i] = temp;
				
				//replace last row - last column
				temp = image[lastIndex][lastIndex-i];
				image[lastIndex][lastIndex-i] = image[layer][layer+i];
				image[layer][layer+i] = temp;
				
				//swap last row - first column and first row- first column
				temp = image[lastIndex-i][layer];
				image[lastIndex-i][layer] = image[layer][layer+i];
				image[layer][layer+i] = temp;
				
			}
		}
		
		return image;
	}
}