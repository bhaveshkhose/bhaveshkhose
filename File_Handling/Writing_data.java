package File_Handling;
import java.io.*;

public class Writing_data {
	
	public static void  main(String  args[]) throws IOException {
		File f = new File("out.txt");		
		byte[] b= {64,46,76,2,32};
		// For Writing the data
		if(!f.exists()) {
			System.out.println("out.txt "+" is a new file");
		}
		else {
			System.out.println("out.txt "+" this file is allready exists ");
		}
		
		FileOutputStream fs = new FileOutputStream(f);
		System.out.println("File is opened write the content");
		fs.write(b);
		fs.flush();
		
		System.out.println("File is cloesd");
		fs.close();
		
		
		
		
		
		}

}
