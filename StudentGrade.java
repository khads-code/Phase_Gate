import java.util.Scanner;

public class StudentGrade{

	public static void main(String [] args){
	
	Scanner inputCollected = new Scanner(System.in);
	
	System.out.println("How many Students do you have? ");
        int totalUsers = inputCollected.nextInt();
        
        System.out.println("How many Subjects do they offer? ");
        int inputsPerUser = inputCollected.nextInt();
        
        inputCollected.nextLine(); 
        
        String[][] userData = new String[totalUsers][inputsPerUser];
        

		for (int numberOfStudents = 0; numberOfStudents < totalUsers; numberOfStudents++) {
		    System.out.println("Entering score for Student " + (numberOfStudents + 1));
		    
		    for (int subjectOffered = 0; subjectOffered < inputsPerUser; subjectOffered++) {
		        System.out.print("Enter score for Subject " + (subjectOffered + 1) + ": ");
		        
		        userData[numberOfStudents][subjectOffered] = inputCollected.nextLine();
	
	
		

			}
		}

	}

}
