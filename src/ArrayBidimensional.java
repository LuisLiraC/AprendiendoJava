
public class ArrayBidimensional {

	public static void main(String[] args) {
		
		int [][] array = new int[4][5];
		
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;
		array[0][4] = 5;
		
		array[1][0] = 6;
		array[1][1] = 7;
		array[1][2] = 8;
		array[1][3] = 9;
		array[1][4] = 10;
		
		array[2][0] = 11;
		array[2][1] = 12;
		array[2][2] = 13;
		array[2][3] = 14;
		array[2][4] = 15;
		
		array[3][0] = 16;
		array[3][1] = 17;
		array[3][2] = 18;
		array[3][3] = 19;
		array[3][4] = 20;
		
		
		for (int i = 0; i<4; i++ ) {
			System.out.println("");
			
			for (int x = 0; x < 5; x++) {
				System.out.print(array[i][x] + " ");
			}
		}
	}
}
