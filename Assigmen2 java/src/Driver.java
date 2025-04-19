//Hala Jebreel 
//1210606
//lab section 5
import java.util.*;
public class Driver {
	static Scanner hi = new Scanner(System.in);//intialize a static scanner called hi
	public static void main(String[] args) {
		String courseName;
		int idCourse;
		System.out.println(" Enter number of teacher ");
		int x = hi.nextInt();//take the number of teacher from user 
		Teacher[] teacher = new Teacher[x];//creat a array of teacher which have the size x 
		for (int i = 0; i < teacher.length; i++) {
			System.out.println(" Please enter teacher’s name , id, basic salary and extra payment rate");
			String name = hi.next();//take the name  of the teacher from user
			int id = hi.nextInt();//take id of  the teacher from user
			double basicSalary = hi.nextDouble();
			//take basic salary  of the teacher from user
			double extraPaymentRate = hi.nextDouble();
			//take extra payament rate  of  the teacher from user
			System.out.println(" Enter number of courses taught");
			// enter number of course that teacher taught
			int numOfCourse = hi.nextInt();
			Course[] c1 = new Course[numOfCourse];//craet array of course 
			for (int j = 0; j < c1.length; j++) {
				System.out.println(" Enter Course names and ids");
				courseName = hi.next();//take course name from user
				idCourse = hi.nextInt();//take course id from user
				c1[j] = new Course(courseName, idCourse);//creat array of object coures
			}
			teacher[i] = new Teacher(name, id, basicSalary, extraPaymentRate, c1);
			//creat array of object teacher
		}
		while (true) {
			System.out.println("_______________________________________________");
			System.out.println("  Please Enter your choice of tasks ( 1-5 ): ");
			System.out.println(" 1- Print teacher Info ");
			System.out.println(" 2- Display all teachers names and total Salaries ");
			System.out.println(" 3- Change basic salary for a teacher");
			System.out.println(" 4- Display sum of total salaries for all teachers ");
			System.out.println(" 5- Exit ");
			System.out.println("_______________________________________________");
			//ask user to enter the choice from 1-5
			int choice = hi.nextInt();//take the choice from user
			switch (choice) {
			case 1://if choose 1 ask user to enter the teacher id to print his/her information
				System.out.println(" Please enter id number for the teacher ");
				int k;
				k = hi.nextInt();
				for (int i = 0; i < teacher.length; i++) {//a loop to print teachers information
					if (teacher[i].getId() == k) {
						teacher[i].printInfo();
					}
				}
				break;
			case 2:
				for (int i = 0; i < teacher.length; i++) {
					System.out.println(" please enter the level of the course from 1-4 for the teacher"+(i+1));
					int o = hi.nextInt();//take the level number
					 System.out.println(" the number of the course from the level you enterd for the "+(i+1)+" teacher is "+teacher[i].countCourseLevel(o));
					//print the number of course from the level number enterd by user
					System.out.println(" Teacher" + ( i+1 ) + " has  the total salary : ");
					System.out.println(teacher[i].getBasicSalary() + teacher[i].calculateExtraPayment());
					//print and calculate the teachers total salary 
					System.out.println(" The name for the "+ (i+1) +" teacher is :  ");
					System.out.println(teacher[i].getName());//print the teacher name
				}
				break;
			case 3:
				System.out.println(" Please enter id for the teacher to change the basic salary ");
				int u = hi.nextInt();//take the id number of the teacher 
				for (int i = 0; i < teacher.length; i++) {
					if (teacher[i].getId() == u) {
					//if the user enter a true id number then ask him/her to enter a new basic salary
						System.out.println(" please enter new basic salary to modify ");
						double newSalary = hi.nextDouble();//take and save new basic salary in newSalary
						teacher[i].setBasicSalary(newSalary);
					}
					
				}
				break;
			case 4:
				double bs = 0;
				for (int i = 0; i < teacher.length; i++) {
					System.out.println(" the sum of total salaries for "+ (i+1) + " teachers ");
					 System.out.println(bs = bs + teacher[i].getBasicSalary() + teacher[i].calculateExtraPayment());
					 // print the salaries for the teacher 
				}
				break;
			case 5://if user choose number 5 then print good by message and exit the program
				System.out.println(" Good Bye! ");
				System.exit(0);
				break;
			default://if user dose not enter a number from 1-5 the print an error message
				System.out.println(" Error: input is invalid!! ");

			}
		}

	}
}