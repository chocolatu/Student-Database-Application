# Student-Database-Application
#Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
Specifications are as follows:

1.	Ask the user how many new students will be added to the database
  
2.	The user should be prompted to enter the name and year for each student
   
3.	The student must have a 5-digit unique ID, with the first number being their grade level
   
4.	A student can enroll in the following courses depending on their grade levels: 
•	Level 1 (Freshman): History101, English102, Maths103, Chemistry104, Physics105, Literature106
•	Level 2 (Sophomore): History201, English202, Maths203, Chemistry204, Physics205, Literature206
•	Level 3 (Junior): History301, English302, Maths303, Chemistry304, Physics305, Literature306
•	Level 4 (Senior): History401, English402, Maths403, Chemistry404, Physics405, Literature406
5.	Each course costs $600 to enroll
   
6.	The student should be able to view their balance and pay their tuition
    
7.	To see the status of the student, we should see their name, ID, courses enrolled, and balance
#Outline:
In this project, I created 2 classes StudentDatabaseApp for main, and Student class for handling the methods. What’s interesting in this project is how to handle the number of students by using an array of Student objects. For example, the users can insert as many students as they want until the number of students handled hit 0, and here I use an array of Students objects, then I create a loop to iterate through each object to handle every single object. 
#Here is the structure of Student class: 
•	Constructor: prompt user to enter student's name and year
•	Generate an ID
•	Show Course Availability for each grade level year
•	Enroll in courses
•	View balance
•	Pay tuition
•	Show status
