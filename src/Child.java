/**
 * subclass of Book class
 */
import java.util.Scanner;

public class Child extends Book {
	/**
	 * @param ch = a string showing the genre 
	 * @param group= a char for showing the age order of book
	 */
	    String ch="Child";
	    
		private char group;//age group
		
		/////////////////////////////////////////////////////
		/**
		 * The only constructor in the Child class .consists constructor of the superclass
		 * @param bookNum=book number
		 * @param title= title of the book
		 * @param author= book's author
		 * @param translator= book's translator
		 * @param publisher=book's publisher
		 * @param year=book's year print
		 * @param genre= book's genre
		 * @param group= book's group(age order)
		 */
		public   Child (int bookNum,String title,String author,String translator,String publisher,int year,String genre,char group) {
			super(bookNum, title, author, translator,publisher, year, genre);
			super.setGenere(ch);
			setGroup(group);
		}
		////////////////////////////////////////////////////////////
		/**
		 * like setter and getter in Student class
		 * @param group =age order 
		 */
		public void setGroup(char group) {
			// a=0-5    b=6-7     c=8-9    d=10-11      e=12-15
			
			if(group=='a' || group=='b' || group=='c' || group=='d'|| group=='e') {
			
			this.group=group;
			}
		}
		public char getGroup() {
			return this.group;
		}
		///////////////////////////////
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
			System.out.println("Age Group:"+ getGroup());
		}
		/**
		 * like update method in Student class. overriding the methods in Book class(its superclass)
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
				System.out.println("Enter a valid name for translator. ");
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
			if (genre1.equals("child")) {
				System.out.println("Age: 0-5---> Enter letter a");
				System.out.println("Age: 6-7---> Enter letter b");
				System.out.println("Age: 8-9---> Enter letter c");
				System.out.println("Age: 10-11---> Enter letter d");
				System.out.println("Age: 12-15---> Enter letter e");
				System.out.println("Enter the age group:");
			 char group1=input.nextLine().charAt(0);
			 setGroup(group1);
			}
			/*else if(genre1.equals("exquisite")) {
				Child child;
				Exquisite exquisite ;
				exquisite=(Exquisite)child;
			  // private  Exquisite exquisite = new   Exquisite();
			   String type1=input.nextLine();
			   exquisite.setType(type1);
			}*/
			call(getBookNum(),author1,year1);
			setCallNumber(getBookNum(), author1, year1);
			System.out.println(getCallNumber());
		}
}
