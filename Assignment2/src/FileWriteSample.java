import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class FileWriteSample {
    public static void main(String args[]) throws FileNotFoundException,IOException {
			  FileWriter myWriter = new FileWriter("sampleoutput.txt");
              myWriter.write("This is sample output for a file \n");
			  
			  
			  
			  myWriter.close();// this must be here to save all writes to the file
		      System.out.println("Your file has been written");
    }//main


}