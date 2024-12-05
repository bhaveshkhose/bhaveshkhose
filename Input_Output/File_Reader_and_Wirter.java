package Input_Output;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_and_Wirter {

	public static void main(String[] args) {
		File f = new File(args[0]);
		
		System.out.println(f.canRead());
		//BufferedReader fo = new BufferedReader(f);
		
		
	}

}
