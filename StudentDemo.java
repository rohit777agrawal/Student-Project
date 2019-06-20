/*
Program about Test Score.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Project 3.
Last Changed: November 5, 2018.
*/

import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		Student student = new Student();
		int option = 0;
		
		do {
			System.out.println("Press 1 to enter the name \n" 
					+ "Press 2 to enter the score of concept test 1 \n"
					+ "Press 3 to enter the score of programming test 1 \n"
					+ "Press 4 to enter the score of concept test 2 \n"
					+ "Press 5 to enter the score of programming test 2 \n"
					+ "Press 6 to enter the score of project 1 \n"
					+ "Press 7 to enter the score of project 2 \n"
					+ "Press 8 to enter the score of project 3 \n"
					+ "Press 9 to enter the score of project 4 \n"
					+ "Press 10 to enter the score of project 5 \n"
					+ "Press 11 to enter the score of project 6 \n"
					+ "Press 12 to enter the score of project 7 \n"
					+ "Press 13 to enter the score of project 8 \n"
					+ "Press 14 to enter the score of concept final \n"
					+ "Press 15 to enter the score of programming final \n"
					+ "Press 16 to see the professor name of the class \n"
					+ "Press 17 to change the professor name of the class \n"
					+ "Press 18 to see all the information about your score \n"
					+ "Press 19 to end the program" + "\n" +
					"==========================================================");
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1){
				System.out.println("What is the name of the person?");
				student.setName(keyboard.nextLine());
			}
			else if (option == 2){
				System.out.println("What is the score of concept test 1?");
				student.setConceptTest1(keyboard.nextDouble());
			}
			else if (option == 3){
				System.out.println("What is the score of programming test 1?");
				student.setProgrammingTest1(keyboard.nextDouble());
			}
			else if (option == 4){
				System.out.println("What is the score of concept test 2?");
				student.setConceptTest2(keyboard.nextDouble());
			}
			else if (option == 5){
				System.out.println("What is the score of programming test 2?");
				student.setProgrammingTest2(keyboard.nextDouble());
			}
			else if (option == 6){
				System.out.println("What is the score of project 1?");
				student.setProject1(keyboard.nextDouble());
			}
			else if (option == 7){
				System.out.println("What is the score of project 2?");
				student.setProject2(keyboard.nextDouble());
			}
			else if (option == 8){
				System.out.println("What is the score of project 3?");
				student.setProject3(keyboard.nextDouble());
			}
			else if (option == 9){
				System.out.println("What is the score of project 4?");
				student.setProject4(keyboard.nextDouble());
			}
			else if (option == 10){
				System.out.println("What is the score of project 5?");
				student.setProject5(keyboard.nextDouble());
			}
			else if (option == 11){
				System.out.println("What is the score of project 6?");
				student.setProject6(keyboard.nextDouble());
			}
			else if (option == 12){
				System.out.println("What is the score of project 7?");
				student.setProject7(keyboard.nextDouble());
			}
			else if (option == 13){
				System.out.println("What is the score of project 8?");
				student.setProject8(keyboard.nextDouble());
			}
			else if (option == 14){
				System.out.println("What is the score of Concept Final?");
				student.setConceptFinal(keyboard.nextDouble());
			}
			else if (option == 15){
				System.out.println("What is the score of Programming Final?");
				student.setProgrammingFinal(keyboard.nextDouble());
			}
			else if (option == 16){
				System.out.println("The Professor name is: " + Student.getProfessor());
			}
			else if (option == 17){
				System.out.println("What is the new professor name?");
				Student.setProfessor(keyboard.nextLine());
			}
			else if (option == 18){
				System.out.println("The name of the person is: " + student.getname() + "\n" + 
						"The name of the professor is: " + Student.getProfessor() + "\n" +
						"The concept test 1 score is: " + student.getConceptTest1() + "\n" +
						"The programming test 1 score is: " + student.getProgrammingTest1() + "\n" +
						"The concept test 2 score is: " + student.getConceptTest2() + "\n" + 
						"The programming test 2 score is: " + student.getProgrammingTest2() + "\n" +
						"The Project 1 score is: " + student.getProject1() + "\n" +
						"The Project 2 score is: " + student.getProject2() + "\n" +
						"The Project 3 score is: " + student.getProject3() + "\n" +
						"The Project 4 score is: " + student.getProject4() + "\n" +
						"The Project 5 score is: " + student.getProject5() + "\n" +
						"The Project 6 score is: " + student.getProject6() + "\n" +
						"The Project 7 score is: " + student.getProject7() + "\n" +
						"The Project 8 score is: " + student.getProject8() + "\n" +
						"The concept final score is: " + student.getConceptFinal() + "\n" +
						"The programming final score is: " + student.getProgrammingFinal() + "\n" +
						"=====================================================");
			}
			else if (option == 19){
				System.out.println("Goodbye.");
			}
			else{
				System.out.println("Error! Try again");
			}
			
			
		}while (option != 19);
		

		keyboard.close();
	}

}
