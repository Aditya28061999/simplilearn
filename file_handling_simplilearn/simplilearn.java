package file_handling_simplilearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class simplilearn {
	
	public static void create_file() throws IOException
	{
		File f1 = new File("c:/users/ayush/desktop/sample.pdf");
		File f2 = new File("c:/users/ayush/desktop/sample-copy.pdf");
				
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try
		{
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(f2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			System.out.println(fis.available());
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		create_file();

	}

}
