//Hala Jebreel
//1210606
//lab section 5
public class Teacher {
	private  String name;
	private int id;
	private double basicSalary;
	private double extraPaymentRate;
	private  Course [] coursesTaught;
	public Teacher(){//defult constructer
	
		
	}
	public Teacher(String name, int id, double basicSalary, double extraPaymentRate, Course[] coursesTaught) {
		//non defult constructer
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.extraPaymentRate = extraPaymentRate;
		this.coursesTaught = coursesTaught;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getExtraPaymentRate() {
		return extraPaymentRate;
	}
	public void setExtraPaymentRate(double extraPaymentRate) {
		this.extraPaymentRate = extraPaymentRate;
	}
	
	public Course[] getCoursesTaught() {
		return coursesTaught;
	}
	public void setCoursesTaught(Course[] coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
	public void printInfo() {//print information method to print teacher information
		System.out.println(" The name of the teacher : " + name + " the id is : "+ id +" the basicSalary is : " + basicSalary + " the extraPaymentRate is : " + extraPaymentRate);
		for (int i=0;i<coursesTaught.length;i++) {
			coursesTaught[i].printInfo();
		}
	}
	

	public  int countCourseLevel(int x){
		int countLevel=0;
		for(int i=0;i<coursesTaught.length;i++) {
			int idNum =coursesTaught[i].getId();
			while (idNum>=10) {//to find the first digit of the course id that teacher taught
				idNum=idNum/10;
			}
			if(idNum==x) {//if the first digit of the course = the number enterd by user then countlevel++
				countLevel++;
			}
		}
		 return countLevel;//return number of course  

		
	}
	public double calculateExtraPayment() {
		double y = 0;//intialize a double y to save ExtraPayment  
		for(int i=1;i<=4;i++) {
			y = y + countCourseLevel(i) * i * extraPaymentRate ;
			// calaculate ExtraPayment and save it in y 
		}
		return y;//return ExtraPayment
	}

	
}
