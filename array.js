let numbers = [
	    [1,2,3],
	    [4,5,6],
	    [7,8,9],
	    
	    ]
	    
	   for(let row = 0; row < numbers.length; row++){
	   	for(let column = numbers[row].length-1; column >= 0;column--){
	   		console.log(numbers[row][column] + " ");
	   	}
	   console.log(" ");
	   }
