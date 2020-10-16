
public class ArrayDemo5 {
	public static void main(String[] args) {
		String [] names = {"±èÁö¹Î", "¹ÚÁö¹Î", "ÇÑÁö¹Î"};
		int [][] array = {
								{56, 78, 90, 0},
								{100, 99, 98, 0},
								{77, 88, 99, 0}
								};
		for(int i = 0; i < array.length; i++) {
			//array[i][3] = array[i][0] + array[i][1] + array[i][2];
			for(int j = 0 ; j < array[i].length -1 ; j++) {
				array[i][3] += array[i][j];
			}
		}
		//////////////////Ãâ·Â//////////////
		for(int i = 0; i < array.length; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < array[i].length ; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println(array[i][3] / 3.);
		}
		
	}
}