
import java.util.ArrayList;

public class LibraryMember {

	private String name;
	private int barCode;
	private int pin;
	private ArrayList<String> itemsCheckedOut=new ArrayList<String>(); 		
	private ArrayList<Integer> itemsCheckedOutNumber=new ArrayList<Integer>(); 	
	
	private ArrayList<Integer> barCodes =new ArrayList<Integer>(); 	
	
	public LibraryMember(String name, int barCode, int pin)
	{
		this.name=name;
		this.barCode=barCode;
		this.pin=pin;
	}
	
		public void setName(String name)
		{
			this.name=name;
		}
		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		public String getName()
		{
			return name;
			
		}
		public void setbarCode(int barCode)
		{
			this.barCode=barCode;
		}
		public int getbarCode()
		{
			return barCode;
			
		}
		
		public boolean checkBarCode(int barCode)
		{
			for(int i=0;i<barCodes.size(); i++)
			{
				if(barCodes.contains(barCode))
					return true;
			}
			return false;
			
		}
		
		public void AddcheckedOutItemtoMemberList(String title, int quantity)
		{
			itemsCheckedOut.add(title);
			itemsCheckedOutNumber.add(quantity);
			
		}
		
		public void returnBook(Book abook)
		{
			itemsCheckedOut.remove(abook);	
		}

		public void addAcceptableCodes()
		{
			barCodes.add(1);
			barCodes.add(2);
			barCodes.add(3);
			barCodes.add(4);
			barCodes.add(5);
			barCodes.add(6);
			barCodes.add(7);
		}
		
		
		public void showAllInfo()
		{
			
			for(int i=0;i<itemsCheckedOut.size();i++)
			{
				System.out.println(itemsCheckedOut.get(i) + " " +itemsCheckedOutNumber.get(i));
				
			}
		}


		
		
}