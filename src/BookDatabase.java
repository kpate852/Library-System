import java.util.ArrayList;


public class BookDatabase{
	private ArrayList<Book> database=new ArrayList<Book>();

	public BookDatabase()
	{
		
	}
	
	// adds a whole new book to the database
	public void addBook(Book abook)
	{
		database.add(abook);
	}
	
	
	// adds more than one of the same book
	public void addMultipleBookQuantity(String title, int quantity)
	{
		for(int i=0;i<database.size(); i++)
		{
			if(database.get(i).getTitle().equalsIgnoreCase(title))
			{
				
				database.get(i).setNumofCopies(database.get(i).getNumofCopies()+quantity);
			}
		
		}
	}
	
	// adds only one
	public void addBookQuantity(String title)
	{
		for(int i=0;i<database.size(); i++)
		{
			if(database.get(i).getTitle().equalsIgnoreCase(title))
			{
				
				database.get(i).setNumofCopies(database.get(i).getNumofCopies()+1);
			}
		
		}
	}
	
	// removes only one quantity
	public void removeBookQuantity(String title)
	{
		
		for(int i=0;i<database.size(); i++)
		{
			if(database.get(i).getTitle().equalsIgnoreCase(title))
			{
				if(database.get(i).getNumofCopies()>0)
				{
				database.get(i).setNumofCopies(database.get(i).getNumofCopies()-1);
				}
				else
				{
					System.out.println("Cant remove, unavialable");
				}
			}
		
		}
		
		
	}
	
	
	// Removes more than one of the same title
	public void removeMultipleBookQuantity(String title, int quantity)
	{
		for(int i=0;i<database.size(); i++)
		{
			if(database.get(i).getTitle().equalsIgnoreCase(title))
			{
				if(database.get(i).getNumofCopies()>0 & database.get(i).getNumofCopies()>=quantity)
				{
				database.get(i).setNumofCopies(database.get(i).getNumofCopies()-quantity);
				}
				else
				{
					System.out.println("Cant remove, unavialable");
				}
			}
		
		}
	}
	
	
	
	
	// removes complete book object including quantity from the database entirely
	public void removeBook(Book abook)
	{
		database.remove(abook);
	}
	
	
	
	
	
	// Searches database
	public boolean searchBook(String title)
	{
		for(int i=0;i<database.size(); i++)
		{
			if(database.get(i).getTitle().equalsIgnoreCase(title))
			{
				System.out.println("There is a match");
				return true;
			}
		
		}
		return false;
	}
	
	
	
	public void displayALLBooksInLibrary()
	{
		for(int i=0;i<database.size();i++)
		{
			if(database.get(i).getNumofCopies()>0)
			{
				System.out.println("Title " +database.get(i).getTitle() +" \nAuthor: " +database.get(i).getAuthor() + " \nCopies: " +database.get(i).getNumofCopies());
				System.out.println();
			}
		}
	}
}
