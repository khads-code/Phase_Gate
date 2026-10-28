public class Array{

	public static void main(String [] args){
		int [][] numbers = {
		
		{1,2,3},
		{4,5,6},
		{7,8,9},
		
		};
		for(int row = 0; row < numbers.length; row++){
			for(int column = numbers[row].length - 1;column >= 0; column--){
			
			System.out.print(numbers[row][column] + " ");
		
			}
			
		System.out.println(" ");
			
		}
	
	}
}
