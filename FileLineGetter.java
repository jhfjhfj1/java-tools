import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileLineGetter {
	private Scanner scanner;
	FileLineGetter()
	{}
	FileLineGetter(String path)
	{
		try {
			scanner = new Scanner(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String nextLine()
	{
		return scanner.nextLine();
	}
	
	public boolean hasNext()
	{
		return scanner.hasNext();
	}
	
	public void close()
	{
		scanner.close();
	}
}
