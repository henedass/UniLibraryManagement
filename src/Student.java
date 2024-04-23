/**
 * A class for the member of the library
 */
import java.util.Scanner;

public class Student {
	/**
	 * @param student number= a fixed number that is given to each member.
	 * @param name= member's name.
	 * @param age = member's age
	 * @param gender= member's gender
	 * @param phone number= member's phone number
	 * @param borrowedBook= A list of books that is borrowed by member.
	 */
	private long  studentNumber;
	private String name;
	private  short age;
	private char gender;
	private String phoneNumber;
    private  static Book[] borrowedBook=new Book[5];
	/////////////////////////////////////////////////////////////
   /**
    * The only constructor of the class 
    * @param s = student number
    * @param n=member;s name
    * @param a=member's age
    * @param g= member's gender
    * @param p= mmeber's phone number
    */
	public Student(long s,String n, short a,char g, String p) {
		setStudentNumber(s);
		setName(n);
		setAge(a);
		setGender(g);
		setPhoneNumber(p);
	}
	
	////////////////////////////////////////
	/**
	 * A setter method for student number; param
	 * @param s=student number
	 */
	public void setStudentNumber(long s) {
		this.studentNumber=s;
	}
	/**
	 * A getter method for student number' param
	 * @return= return the student number's param
	 */
	public long getStudentNumber() {
		return this.studentNumber;
	}
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(short a) {
		
		this.age=a;
		
	}
	public  short getAge() {
		return this.age;
	}
	public void  setGender(char g) {
		if(g=='F' || g=='f' || g=='m' || g=='M') {
			this.gender=g;
		}
		else {
			this.gender='f';
		}
	}
	public char getGender() {
		return this.gender;
	}
	public void setPhoneNumber(String p) {
		this.phoneNumber=p;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
///////////////////////////////////////////////////////////////////////	
	/**
	 * A method for showing student number, name,age,gender, phone number
	 */
	public void showInformation() {
		System.out.println("Student Number:" + getStudentNumber());
		System.out.println("Name:" + getName());
		System.out.println("Age:" + getAge());
		System.out.println("Gender:" + getGender());
		System.out.println("Phone Number:" + getPhoneNumber());
	}
	/**
	 * A method for updating member's info(name,age,gender,phone number)
	 */
	public void  update() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter new name:");
		try {
		String name1=input.nextLine();
		setName(name1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid name.");
		}
		System.out.println("Enter new age:");
		try {
		short age1=input.nextShort();
		setAge(age1);
		}
		catch(Exception e){
			System.out.println("Enter a valid number for age.");
		}
		input.nextLine();
		System.out.println("Enter new gender:");
		try {
		char gender1=input.nextLine().charAt(0);
		setGender(gender1);
		}
		catch(Exception e) {
			System.out.println("Enter words 'female' or 'male' for gender.");
		}
		System.out.println("Enter new phone number:");
		try {
		String phoneNumber1=input.nextLine();
		setPhoneNumber(phoneNumber1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid number for phonenumber");
		}
	}
///////////////////////////////////////////////////////////
	/**
	 * A method for adding a book in the borrowedBook array and show a massage.
	 * @param b =an object of book class
	 * @return true= if a book's added to borrowedBook array.
	 */
	public  boolean addBook(Book b) {
		//if(b.equals(borrowedBook.length))
		int i;
		for(i=0;i<=2;i++) {
		 if(borrowedBook[i]==null) {
		 borrowedBook[i]=b;
		 i++;
		 return true;
		 }
		}
		return false;
	}
////////////////////////////////////////////////////////////
	/**
	 * A method for removing a book from borrowedBook array
	 * @param b=an object of book class
	 * @return like addBook method
	 */
	public boolean deleteReturnedBook(Book b) {
		int i;
		for(i=0;i<2;i++) {
		 if(b==borrowedBook[i]) {
			b=null;
			i++;
		 }
		}
		int a=i+1;
		while(borrowedBook[a]!=null) {
			borrowedBook[a-1]=borrowedBook[a];
			a++;
		}
		return true;
	}
////////////////////////////////////////////////////////////
	
		
		
		
		
	
	

		
	
		
}
	
	 
	
	


