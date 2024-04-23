/**  This class represents a console of the library.
 * @author Sadeneh Sadeghi
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
/** A method for creating members of library
 * @param long s= student number which is a fixed number.
 * @param name = member's name.
 * @param age = member's age(between 0 to 100)
 * @param gender= female or male.
 * @param phonenumber= consists 11 digits.
 * @return student= an object that is created by those params.
 * */	
	public static Student create(long s) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=input.nextLine();	
		System.out.println("Enter your age:");
		short age=input.nextShort();
		input.nextLine();
		System.out.println("Enter your gender:");
		char gender=input.nextLine().charAt(0);
		System.out.println("Enter your phone number:");
		String phoneNumber=input.nextLine();
		Student student =new Student(s,name,age,gender,phoneNumber);
		
		return student;
		
	}
/////////////////////////////////////////////////////////////////////////////
/**  A method for creating a book 
 *@param bookNum= book number (fixed number, consists 4 digits) 
 *@param title= title of book
 *@param author= author's full name(format: FirstName LastName)
 *@param translator= translator full name(format: FirstName LastName) .It could be null param.
 *@param publisher= publisher' name.
 *@param year= year print of book.(consists 4 digits)
 *@param genre= genre of book,which is exquisite or child ,etc.
 *@return exquisite= return a book from exquisite genre.
 *@return child= return a book from child genre.
 *@return book=return a book from other genres.
  */	
	public static Book createBook(int bookNum) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the title:");
		String title=input.nextLine();
		System.out.println("Enter the author :");
		String author=input.nextLine();
		System.out.println("Enter the translator:");
		String translator=input.nextLine();
		System.out.println("Enter the publisher:");
		String publisher=input.nextLine();
		System.out.println("Enter the print year:");
		int year=input.nextInt();
		input.nextLine();
		System.out.println("Enter intended genre");
		String genre=input.nextLine();
		if(genre.equals("exquisite")) {
			System.out.println("Enter the type of book: \n Choose:handwritten-aromatic-leather" );
			String type=input.nextLine();
			Exquisite exquisite=new Exquisite( bookNum,title, author, translator,publisher, year, genre,type);
			return exquisite;
		}
		
		else if (genre.equals("child")) {
			System.out.println("Age: 0-5---> Enter letter a");
			System.out.println("Age: 6-7---> Enter letter b");
			System.out.println("Age: 8-9---> Enter letter c");
			System.out.println("Age: 10-11---> Enter letter d");
			System.out.println("Age: 12-15---> Enter letter e");
			System.out.println("Enter the age group:");
			char group=input.next().charAt(0);
		Child child=new Child( bookNum,title, author, translator,publisher, year, genre,group);
		return child;
		
		}
		else {
		Book book=new Book(bookNum,title,author, translator,publisher, year,genre);
		return book;
		}
	}
/////////////////////////////////////////////////////////////////////////////////	
/** A method for searching member's index in array by student number.
 * @param long s = student number.
 * @param student= array of all the members.
 * @return i= index of the member in array.
 * @return -1= there is no member with that student number.
 */	
	public static int search(long s,Student [] student) {
		int i;
		for(i=0;i<student.length;i++) 
			if(s==student[i].getStudentNumber()) {
				
				return  i;
				
			}
		
		return -1;
		
		}
	
//////////////////////////////////////////////////////////////////////////////////	
/** search index of book in array by call number
 * @param callMum= call number , format:book number(4 digits)/ first letter of author' name(capital letter/year print(last two digits)
 * @param book= array of all the books in the library
 * @return i =index of the book in array.
 * @return -1=there is no book with that call number.
 */
public static int searchBook(String callNum, Book[] book) {
	int i=0;
	for(i=0;i<book.length;i++)
		if (book[i]==null) {
		}
		else {
		 if (callNum.equals(book[i].getCallNumber())) {
			 return i;
			
		 }
		}
	return -1;
}
	
//////////////////////////////////////////////////////////////////////////////////	
/** search student number by entering member's name
 * @param name= member's name
 * @param student= array of all the members in the library
  */
public static void searchStudentnumber(Student[] student,String name) {
	Student[] stud=new Student[2];
	int n=0;
	for(int i=0;i<stud.length;i++) {
		if(student[i]==null) {			
		}
		else {
		if (student[i].getName().contains(name)) {
			student[i].showInformation() ;
			stud[n] = student[i];
			n++ ;
		}
		}
	}
	
	
}

/////////////////////////////////////////////////////////////////////////////////
/**
 * searching call number by entering title 
 * @param book= array of all the books in the library
 * @param name= book's title
 */
public static void searchCallNum(Book[] book,String name) {
	Scanner scan=new Scanner(System.in);
	Book [] b=new Book[2];
	int n=0;
	for(int i=0;i<b.length;i++) {	
		if(book[i]==null) {
		}
		else {
		 if(book[i].getTitle().contains(name)){
			book[i].partOfInf();
			b[n]=book[i];
			n++;
		 }
		}	
	}
}
/////////////////////////////////////////////////////////////////////////////////
/** deleting a member by entering their student number 
 * @param b = index  of members
 * @param stud=array of members
 * @param n= student number
 * @return 
 */
	public  static  Student[] delete(int b,Student[] stud,long n) {
		int index=search(n,stud);
		stud[index]=null;
		int i=index;
		if(b>=0) {
		while(stud[index+1]!=null) {
			stud[index]=stud[index+1];
			i++;
		}
		
		stud[i-1]=null;
		}
		return stud;
	}
////////////////////////////////////////////////////////////////////////////////////
/**
 * A method for deleting book by entering index of book and its call number.
 * @param b index of book
 * @param book=array of books
 * @param callNum=book's call number
 * @return
 */
	public static Book[] deleteBook(int b,Book[] book,String callNum) {

		int index=searchBook(callNum,book);
		book[index]=null;
		int i=index;
		if(b>=0) {
		while(book[index+1]!=null) {
			book[index]=book[index+1];
			i++;
		}
		book[i-1]=null;
		}
		return book;
	}
////////////////////////////////////////////////////////////////////////////////////
	/**
	 * A method for borrowing a book by entering index of book and member
	 * @param indexB=index of book which is being borrowed by member
	 * @param indexS=index of member who wants to borrow the book
	 * @param book=array of book
	 * @param student=array of member
	 */
   public static void borrow(int indexB,int indexS,Book[]book,Student [] student) {
	  
		Book b=book[indexB];
		if (book[indexB].getAvail()==true) {		
			
		 student[indexS].addBook(b);
			
		}
		if (student[indexS].addBook(b)==true) {
			book[indexB].setAvail(false);
		}
		System.out.println("Done successfully");
	}
  ////////////////////////////////////////////////////
   /**
    * A special method for borrowing child genre 
    * @param indexS=index of member
    * @param student=array of members
    */
   public static void borrowChild(int indexS,Student[]student) {
	  Child [] child=new Child[2];
	   if(student[indexS].getAge()>=0 && student[indexS].getAge()<=5) {
		   for(int i=0;i<child.length;i++) {
			   
			   //System.out.println(child[i].getGroup()=='a');
			   if (child[i]!=null) {
			   if(child[i].getGroup()=='a') {
				   System.out.println(Arrays.deepToString(child));
			   }
			   }
		   }
	   }
	   else if (student[indexS].getAge()>=6 && student[indexS].getAge()<=7){
		   for(int i=0;i<child.length;i++) {
			   if (child[i]!=null) {
			   if(child[i].getGroup()=='b') {
				   System.out.println(Arrays.deepToString(child));
			   }
			   }
			  
		   }
	   }
	   else if (student[indexS].getAge()>=8 && student[indexS].getAge()<=9){
		   for(int i=0;i<child.length;i++) {
			   if (child[i]!=null) {
			   if(child[i].getGroup()=='c') {
				   System.out.println(Arrays.deepToString(child));
			   }
			   }
		   }
	   }
	   else if (student[indexS].getAge()>=10 && student[indexS].getAge()<=11){
		   for(int i=0;i<child.length;i++) {
			   if (child[i]!=null) {
			   if(child[i].getGroup()=='d') {
				   System.out.println(Arrays.deepToString(child));
			   }
			   }
		   }
	   }
	   else if (student[indexS].getAge()>=12 && student[indexS].getAge()<=15){
		   for(int i=0;i<child.length;i++) {
			   if (child[i]!=null) {
			   if(child[i].getGroup()=='e') {
				   System.out.println(Arrays.deepToString(child));
			   }
			   }
		   }
	   }
   }
   //////////////////////////////////////////////////
   /**
    * A method for returning back a book .
    * @param indexB=index of book
    * @param indexS=index of member.
    * @param book=array of books.
    * @param student=array of members.
    */
   public static  void returnedBook(int indexB,int indexS,Book[]book,Student[] student) {
	   
		Book b=book[indexB];
		student[indexS].deleteReturnedBook(b);
		if(student[indexS].deleteReturnedBook(b)==true) {
			book[indexB].setAvail(true);
		}
		System.out.println("Done successfully" );
	}
   //////////////////////////////////////////////////
   /**ib=book index
    * 
    * */
   public static void readerList(int bi) {
	   
   }
///////////////////////////////////////////////////////////////////////////////////
  
		public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student[] student = new Student[2];
		int counter =0;
		long studentNumber=1000000;
				
//////////////////////////////////////////////////
	
		Book[] book=new Book[10];
		Exquisite[] exquisite=new Exquisite[2];
		Child[] child=new Child[2];
		int countB=0;
		int bookNum=1000;	
		int x=0;
		while(x!=-1) {
			System.out.println("Please enter the number of your order");
			System.out.println("1:Creat a student");
			System.out.println("2:Show student's information");
			System.out.println("3:Delete student");
			System.out.println("4:Update student's information");
			System.out.println("5:Creat a book");
			System.out.println("6:Show book's information");
			System.out.println("7:Delete book");
			System.out.println("8:Update book's information");
			System.out.println("9:Search student number:");
			System.out.println("10:Search call number");
			System.out.println("11:Borrow");
			System.out.println("12:Borrow Child Books");
			System.out.println("13:Return book:");
			System.out.println("14:Reader List");
			System.out.println("-1:Exit");			
			x=input.nextInt();
			input.nextLine();
			switch(x) {
			case 1:
				
		        if(counter <2) {	
		        	Student s=create(studentNumber);
		        	System.out.println(studentNumber);
		        	student [counter]=s;
		        	studentNumber++;
		        	counter++;
		        }			
		        break;		
			case 2:
				System.out.println("Enter your student number:");
				long number=input.nextLong();
				int index=search(number,student);
				if(index>=0) {
				student[index].showInformation();
				}
				if(index==-1){
					System.out.println("ERROR!");
				}
				break;
			case 3:
				System.out.println("Enter your student number:");
			    long number1=input.nextLong();
			    int c=search(number1,student);
			    if(c>=0) {
				student=delete(c,student,number1);
				counter--;
			    }
			    if(c==-1) {
			    	System.out.println("ERROR!");
			    }
				break;
			case 4:
				System.out.println("Enter your student number:");
				long number2=input.nextLong();
				int index1=search(number2,student);
				if(index1>=0) {
				student[index1].update();
				}
				if(index1==-1) {
			    	System.out.println("ERROR!");
			    }
				break;
			case 5:
				
				Book b=createBook(bookNum);
				book[countB]=b;
				System.out.println("Book Number:"+ bookNum +"Call Number:"+book[countB].getCallNumber());
				bookNum++;
				if(countB<2) {
					countB++;
				}
			 break;
			case 6:
				System.out.println("Enter Call Number:");
				String call=input.nextLine();
				int i=searchBook(call,book);
				if(i>=0) {
				 if(book[i].getGenre().equals("child")) {
					child[i].showInfBook();
				 }
				 else if(book[i].getGenre().equals("exquisite")) {
					exquisite[i].showInfBook();
				 }
				 else {
				  book[i].showInfBook();
				  }
				}
			   if(i==-1) {
			    	System.out.println("ERROR!");
			    }
				break;
			case 7:
				System.out.println("Enter Call Number:");
				String call1=input.nextLine();
				int c1=searchBook(call1,book);
				if(c1>=0) {
				book=deleteBook(c1,book,call1);
				}
				if(c1==-1) {
			    	System.out.println("ERROR!");
			    }
				countB--;
				break;
			case 8:
				System.out.println("Enter call Number:");
				String call2=input.nextLine();
				int i1=searchBook(call2,book);
				if(i1>=0) {
					if(book[i1].getGenre().equals("child")) {
						
						child[i1].updateBook();
					}
					else if(book[i1].getGenre().equals("exquisite")) {
						
						exquisite[i1].updateBook();
					}
					else {
						book[i1].updateBook();
					}
				}
				if(i1==-1) {
			    	System.out.println("ERROR!");
			    }
				break;
			case 9:
				System.out.println("Enter studnet name");
				String studName=input.nextLine();
				searchStudentnumber(student,studName);
				break;
			case 10:
				System.out.println("Enter the title:");
				String title=input.nextLine();
				searchCallNum(book,title);
				break;	
			case 11:
				System.out.println("Enter your Call Number:");
				String callNum=input.nextLine();
				System.out.println("Enter your Student Number:");
				long studNum=input.nextLong();
				input.nextLine();
				int a1=search(studNum,student);
				int a2=searchBook(callNum,book);
				if(book[a2].equals(exquisite[a2])) {
					System.out.println("Sorry.You can not borrow this genre");
				}
				else {
				borrow(a2,a1, book,student);
				}
				break;
			
				/////////////////////////////////////////////////
				//borrow child
			case 12:
				System.out.println("Enter your Student Number:");
				long stdNm=input.nextLong();
				input.nextLine();
				int s=search(stdNm, student);
				if(student[s].getAge()<=15) {
					borrowChild( s, student);
				}
				System.out.println("Enter the intended title:");
				String titleB=input.nextLine();
				searchCallNum(book, titleB);
				System.out.println("Enter Call Number:");
				String cn=input.nextLine();
				int srch=searchBook(cn, book);
				borrow(srch, s, book, student);
				
				
				break;	
				/////////////////////////////////////////////////
			case 13:
				System.out.println("Enter  Call Number:");
				String callNum1=input.nextLine();
				System.out.println("Enter your Student Number:");
				long studNum1=input.nextLong();
				input.nextLine();
				int x1=search(studNum1,student);
				int x2=searchBook(callNum1,book);
				returnedBook(x2,x1, book,student);
				break;
				/////////////////////////////////////////////////
				
			case 14:System.out.println("Enter Call Number: ");
		    	String callNum2=input.nextLine();
			    int x3=searchBook(callNum2,book);
			    readerList(x3);
			    break;
			
			case -1:
				return;			
			}	
	 }
		input.close();
	}
	}
