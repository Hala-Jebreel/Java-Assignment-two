//Hala Jebreel
//1210606
//lab section 5
public class Course {
	private String name;
	private int id;
	public Course(){//defult constructer
		
	}
	public Course(String name,int id){//non defult constructer
		setName(name);
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()==4) {//if the name of the course == 4 put it in name 
			this.name = name;
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  void  printInfo(){//print information for the course
		System.out.println(" the name of the course : "+ name);
		System.out.println(" the id  of the course thaught is : "+ id);
	}
}
