numberofstudents = int(input("How many Students do you have? "))

subjectsoffered = int(input("How many Subjects do they offer? "))



for students in range(1,numberofstudents + 1):
	print(f"Entering score for Student {students}")
	
	totalscore = 0
	averagescore = 0
	
	for subjects in range(1,subjectsoffered + 1):
		scoreofsubject = int(input(f"Enter score for Subject {subjects}: "))
		
		while scoreofsubject > 100:
			print("Enter scores between 0 and 100")
			scoreofsubject = int(input(f"Enter score for Subject {subjects}: "))
		totalscore = scoreofsubject + totalscore
	averagescore = totalscore / subjectsoffered
			
	print(f"\n Total for student {students}: {totalscore}")
	print(f"Average Score for student {students}: {averagescore}")
	


			
			
			
			
		
		
		
		



