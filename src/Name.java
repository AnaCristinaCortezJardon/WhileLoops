import java.util.Scanner;

	public class Name
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter any name: ");
	        String name = scanner.nextLine();
	                
	        System.out.println("The letters of this name are: ");
	       for (int i = 0; i < name.length(); i++){
	    	   char letter = name.charAt(i);
	    	   System.out.println(letter);
	       }
	        scanner.close();

	    }
	}