
public class Book {
	private String title;
	private String author;
	private int numofCopies;
	
		
	
	public Book(String title, String author, int numofCopies)
	{
		this.title=title;
		this.author=author;
		this.numofCopies=numofCopies;
	}
	
/*	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
		
	}*/
	

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", numofCopies="
				+ numofCopies + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumofCopies() {
		return numofCopies;
	}

	public void setNumofCopies(int numofCopies) {
		this.numofCopies = numofCopies;
	}
}