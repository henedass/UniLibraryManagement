/**
 * subclass of Book class.
 */
import java.util.Scanner;
public class Exquisite extends Book{
	/**
	 * @param e= genre of the book
	 * type= type of the book,like :handwritten.aromatic.leather
	 */
	String e="Exquisite";
	private String type;//handwritten.aromatic.leather
	
	/////////////////////////////////////////////////////
	/**
	 * Constructor of the class. overriding super class constructor.
	 * @param bookNum likes Child class's constructor
	 * @param title ...
	 * @param translator ...
	 * @param publisher ...
	 * @param year ...
	 * @param genre ...
	 * @param type ...
	 */
	public   Exquisite (int bookNum,String title,String author,String translator,String publisher,int year,String genre,String type) {
		super(bookNum, title, author, translator,publisher, year, genre);
		setType(type);
	    super.setGenere(e);
	}
	////////////////////////////////////////////////////////////
	/**
	 *  like setter and getter in Student class
	 * @param type= type of the book
	 */
	public void setType(String type) {
		if(type.equals("handwritten") || type.equals("aromatic") || type.equals("leather")) {
		this.type = type;
		}
	}
	public String getType() {
		return this.type;
	}
	///////////////////////////////////////////////////////////
	/**
	 * like show info method in Student class.overriding the methods in Book class(its superclass)
	 */
	@Override
	public void showInfBook() {
		System.out.println("Call Number:"+ getCallNumber());
		System.out.println("Book NUmber:" + getBookNum());
		System.out.println("Title:"+ getTitle());
		System.out.println("Author:"+ getAuthor());
		System.out.println("Translator:"+ getTranslator());
		System.out.println("Publisher:"+ getPublisher());
		System.out.println("Year:"+ getYear());
		System.out.println("Genre:"+ getGenre());
		System.out.println("Type:"+ getType());
	}
	/**
	 * like update method in Student class.overriding the methods in Book class(its superclass)
	 */
	@Override
	public void updateBook() {
		super.getBookNum();
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
		System.out.println("Enter the new genre:");
		String genre1=input.nextLine();
		setGenere(genre1);
		if (genre1.equals("exquisite")) {
	    	System.out.println("Enter the type of book: \\n Choose:handwritten-aromatic-leather");
		    String type1=input.nextLine();
		    setType(type1);
		}
		call(getBookNum(),author1,year1);
		setCallNumber(getBookNum(), author1, year1);
		System.out.println(getCallNumber());
		
		

	}
		


}
