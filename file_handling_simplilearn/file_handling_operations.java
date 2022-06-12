package file_handling_simplilearn;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file_handling_operations {

	

	public static void main(String[] args) throws IOException {
		
		// creating of a file
		// String pathname;
//		File file_1 = new File(pathname : "file_11.txt");
//
//		try
//		{
//			file_1.createNewFile();
//		}
//		catch(IOException e)
//		{
//			
//			e.printStackTrace();
//		}
		
		// code to write a file
		// we use filewriter to write on the existing file
		
//		FileWriter filewriter = new FileWriter(filename : " file_11.txt");
//		filewriter.write("this is our first file in java");
//		filewriter.close();
//		
//		// reading a file
//		File file_2 = new File(pathname:"file_12.txt");
//		try
//		{
//			Scanner sc = new Scanner(System.in);
//			while(sc.hasNextLine())
//			{
//				String line = sc.nextLine();
//				System.out.println(line);
//				
//				
//			}
//			sc.close();
//			catch(IOException e)
//			{
//				e.printStackTrace();
//			}
		File myfile = new File("goyal.txt");
		// myfile.delete() is used to check the file is deleted or not
		if(myfile.delete())
		{
			System.out.println(" file have deleted :"+ myfile.getName());
//			System.out.println(line);

			
			
		}
		else
		{
			System.out.println("some error have beeen occured while deleting the file");

		}
		
		
		
		

	}

}
