/**
 * A class for the books in the library.
 */
import java.util.Scanner;

public class Book {
	/**
	 * @param callNumber= a code which consists book number+ the first letter of author's full name with capital letter+ year print
	 * @param bookNum=A fixed named for each book
	 * @param title= title of the book
	 * @param author= book's author
	 * @param translator = book's translator
	 * @param year= book's year print(4 digits)
	 * @param avail= showing if a book is available in the library
	 * @param genre= genre of the book
	 * @param studentList= the list of student's who borrowed the book
	 */
	private String callNumber;
	private int bookNum;
	private String title;
	private String author;
	private String translator;
	private String publisher;
	private int year;
	private boolean avail=true;//availability
	private String genre;
	private Student[] studentList;//  the list of student's who borrowed the book
	public Book(int bookNum,String title,String author,String translator,String publisher,int year,String genre) {
		
		setBookNum(bookNum);
		setTitle(title);
		setAuthor(author);
		setTranslator(translator);
		setPublisher(publisher);
		setYear(year);
	    String callNum=call(bookNum,author,year);
	    this.callNumber=callNum;
	    setGenere(genre);
	}
	public Book() {};
///////////////////////////////////////////////////////////////////////////////////////	
	/**
	 * A method for creating call number with the specific structure.(book number+ the first letter of author's full name with capital letter+ year print)
	 * @param bookNum 
	 * @param author
	 * @param year
	 * @return return the created call number
	 */
	public String call(int bookNum,String author,int year) {
    String bm=Integer.toString(bookNum);//convert int bookNum to String bookNum
	String y=Integer.toString(year);//for year ...
	String y1=y.substring(2);// return the last two digits
	String[] name=author.split("\\s");
	String firstName=name[0];
   	String  lastName=name[1];
	char fn=firstName.charAt(0);
	char ln=lastName.charAt(0);
    char fn1=Character.toUpperCase(fn);//upper case first letter of firstName
    char ln1=Character.toUpperCase(ln);// for lastName ...
   String callNum= bm + "/" + fn1 + ln1 + "/" +y1;
	
	return callNum;
	}
///////////////////////////////////////////////////////////////////////////////	
	/**
	 * setter method for call number by using Call method
	 * @param bookNum
	 * @param author
	 * @param year
	 */
	public void setCallNumber(int bookNum,String author,int year) {
		this.callNumber=call(bookNum,author,year);
		
	}	
	/**
	 * getter method for student number
	 * @return
	 */
	public String getCallNumber() {
		return this.callNumber;
	}	
	public void setBookNum(int bookNum) {
		this.bookNum=bookNum;
	}
	public int getBookNum() {
		return this.bookNum;
	}

	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setTranslator(String translator) {
		this.translator=translator;
	}
	public String getTranslator() {
		return this.translator;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public String getPublisher() {
		return this.publisher;
	}	
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return this.year;
	}
	public void setAvail(boolean flag) {
		this.avail=flag;
	}
	public boolean getAvail() {
		return this.avail;
	}
	public void setGenere(String genre) {
		this.genre=genre;

	}
	public String getGenre() {
		return this.genre;
	}
	public void setStudentList(Student[] studList) {
		 this.studentList=studList;
	}
	public Student[] getStudentList() {
		return this.studentList;
	}
/////////////////////////////////////	
	/**
	 *  like show info method in Student class
	 */
	public void showInfBook() {
		System.out.println("Call Number:"+ getCallNumber());
		System.out.println("Book NUmber:" + getBookNum());
		System.out.println("Title:"+ getTitle());
		System.out.println("Author:"+ getAuthor());
		System.out.println("Translator:"+ getTranslator());
		System.out.println("Publisher:"+ getPublisher());
		System.out.println(" Year:"+ getYear());
		System.out.println("Genre:" +getGenre());
	}	
///////////////////////////////////////
	
	
	public void partOfInf() {
		System.out.println("Book NUmber:" + getBookNum());
		System.out.println("Title:"+ getTitle());
		System.out.println("Author:"+ getAuthor());
		System.out.println("Translator:"+ getTranslator());
		System.out.println("Publisher:"+ getPublisher());
		System.out.println(" Year:"+ getYear());
		System.out.println("Genre:" +getGenre());
	}
///////////////////////////////////////
	/**
	 *  like update method in Student class
	 */
	public void updateBook() {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter new title:");
		try {
		String title1=input.nextLine();
		setTitle(title1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid title");
		}
		System.out.println("Enter new author:");
		String author1=input.nextLine();
		setAuthor(author1);		
		System.out.println("Enter new translator:");
		try {
		String translator1=input.nextLine();
		setTranslator(translator1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid name for translator.");
		}
		System.out.println("Enter new publisher:");
		try {
		String publisher1=input.nextLine();
		setPublisher(publisher1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid name for publisher.");
		}
		System.out.println("Enter new print year:");
		int year1=input.nextInt();
		setYear(year1);	
		input.nextLine();
		System.out.println("Enter new Genere:");
		try {
		String genre1=input.nextLine();
		setGenere(genre1);
		}
		catch(Exception e) {
			System.out.println("Enter a valid name for genre.");
		}
		call(bookNum,author1,year1);
		setCallNumber(bookNum, author1, year1);
		System.out.println(getCallNumber());
		
	}
	


}