
import java.io.FileReader;
import java.io.IOException;


public class exception2 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
		//	File file1 = new File("D:\\example.txt");
		//	fr = new FileReader(file1);
			fr = new FileReader("D:\\example.txt"); 
			char a[] = new char[50];
			fr.read(a);
			for (char c : a) 
				System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
	}

}
