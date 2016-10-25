import java.util.Scanner;
public class testSystem 
{
	public static void main(String[] args) {
		// Programmers: Kishan Patel, Talib Bacchus
	
		/**
		 * Orignal Database with 5 books as examples
		 */
		
		Book b1=new Book("The Chronicles of Narnina", "CS Lewis", 10);
		Book b2=new Book("Sherlock Holmes", "Arthur Conan Doyle", 2);
		Book b3=new Book("Ghost Rider", "Mike Ploug", 1);
		Book b4=new Book("How to kill a MockingBird", "Harper Lee", 4);
		Book b5=new Book("The Giver", "Lois Lowry", 3);
			
		BookDatabase d1=new BookDatabase();
		d1.addBook(b1);
		d1.addBook(b2);
		d1.addBook(b3);
		d1.addBook(b4);
		d1.addBook(b5);
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
			Scanner kb=new Scanner(System.in);
			
			System.out.println("Please enter your name");
			String name=kb.nextLine();
			System.out.println("Please enter your barCode");
			int barCode=kb.nextInt();
			System.out.println("Please enter your pin");
			int pin=kb.nextInt();
			 
			LibraryMember member= new LibraryMember(name, barCode, pin);
			member.addAcceptableCodes();
		
			
		int quit=0;
		do
		{ 
			
			System.out.println("Press 1 for checkout");
			System.out.println("Press 2 for return");
			System.out.println("Press 3 to show all books in the library");
			System.out.println("Press 4 to show all books you checked out");
			System.out.println("Press 5 to exit system");
			int choice=kb.nextInt();
			switch(choice)
			{
				case 1: //checkout 
				{
					if(member.checkBarCode(barCode)==false)
					{
						System.out.println("Sorry, you cant contine. Fix your card");
						break;
					}
					
					System.out.println("Enter a title of the book you would you like to borrow?");
					
					String title=kb.next();	
				
							
					if(d1.searchBook(title)==true)
						{
							System.out.println("We found a match for your book. Type yes to checkout or no to continue");
							String ans=kb.next();
							
							if(ans.equalsIgnoreCase("yes"))
							{
								System.out.println("How many?");
								int quantity=kb.nextInt();
								
								d1.removeMultipleBookQuantity(title, quantity);
								member.AddcheckedOutItemtoMemberList(title, quantity);
								
								System.out.println("Would you like another book?");
								ans=kb.next();
								
								
								if(ans.equalsIgnoreCase("no"))
								{
									System.out.println("Thank you and have a great day!");
									break;
								}
								
							}
							else if(ans.equalsIgnoreCase("no"))
							{
								System.out.println("Would you like another book?");
								ans=kb.next();
								if(ans.equalsIgnoreCase("yes"))
								{
									quit=0;
								}
								
								
								if(ans.equalsIgnoreCase("no"))
								{
									System.out.println("Thank you and have a great day!");
									break;
								}
							}
						}
					else
					{
						System.out.println("Book doesnt exist. Press 1 to quit or 2 to continue");
						quit=kb.nextInt();
					}
					break;
				}//ends case statement
				
				
				case 2: // returning book
				{
						if(member.checkBarCode(barCode)==false)
						{
							System.out.println("Sorry, you cant contine. Fix your card");
							break;
						}
						
						System.out.println("Enter a title of the book you would you like to return?");
						String title=kb.next();	
						System.out.println("Enter a author of the book you would you like to return?");
						String author=kb.next();
						
						if(d1.searchBook(title)==true)
						{
							System.out.println("We found a match for your book. Type yes to return or no to continue");
							String ans=kb.next();
							if(ans.equalsIgnoreCase("yes"))
							{
								System.out.println("How many?");
								int quantity=kb.nextInt();
								
								d1.addMultipleBookQuantity(title, quantity);
						
								System.out.println("Would you like another book?");
								ans=kb.next();
								if(ans.equalsIgnoreCase("no"))
								{
									System.out.println("Thank you and have a great day!");
									break;
								}
								
							}
							
							
							else if(ans.equalsIgnoreCase("no"))
							{
								System.out.println("Would you like another book?");
								ans=kb.next();
								if(ans.equalsIgnoreCase("yes"))
								{
									quit=0;
								}
								
								
								
								if(ans.equalsIgnoreCase("no"))
								{
									System.out.println("Thank you and have a great day!");
									break;
								}
							}
						}
					else
					{
						System.out.println("Book doesnt exist. Press 1 to quit or 2 to continue");
						quit=kb.nextInt();
					}
					break;
				}
				case 3: // show all books in the library
				{
					System.out.println();
					d1.displayALLBooksInLibrary();
					System.out.println();
					break;
				}
				case 4: //show all of member's books checked out
				{
					member.showAllInfo();
					break;
				}
				case 5:
				{
					quit=1;
					break;
				}
					
			}// ends switch
		}
		
		while(quit!=1);
	}
}
