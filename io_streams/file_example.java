package io_streams;

import java.io.*;

public class file_example {

	public static void main(String[] args) throws IOException {
		try
		{
			FileOutputStream fos = new FileOutputStream("c:/users/ayush/desktop/file.txt");
			String str = "learn java programming";
			System.out.println("");
			
			fos.write(str.getBytes());
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("program Build Successfully");
		


	}

}
