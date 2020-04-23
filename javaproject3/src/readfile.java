import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {

	private static final String spaces = null;

	public static void main(String[] args) throws FileNotFoundException {
           String filename = "D:\\example.txt";
           File textfile = new File (filename);
           Scanner in = new Scanner (textfile);
       //    int a = in.nextInt();
      //     System.out.println(a);
           while (in.hasNextLine()) {
        	   String line = in.nextLine();
        	   if (line != null) {
        		   System.out.println(line);
        	   }
        	  
           } 
           in.close();
        		
	}

}
