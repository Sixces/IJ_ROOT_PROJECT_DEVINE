import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class A2 {
    public static void main(String args[]) throws FileNotFoundException,IOException {
      
      String name,level;
      double gpa;
      boolean ishonors;
      boolean passed;
      File myObj = new File("a2input.txt");
      Scanner input = new Scanner (myObj);
      FileWriter myWriter = new FileWriter("a2output.txt");
	  
      
	  while (input.hasNext())
	  {

          name = input.next();
          gpa = input.nextDouble();
          level = input.next();


          if (gpa >= 2.75) {

              if (level.equals("Freshman"))
                  level = "Sophormore";
              else if (level.equals("Sophomore"))
                  level = "Junior";
              else if (level.equals("Junior"))
                  level = "Senior";
              else if (level.equals("Senior"))
                  level = "Graduate";

              passed = true;
          }
          else
              passed = false;


          if (gpa >= 3.5)
              ishonors = true;
          else
              ishonors = false;


          myWriter.write("\nStudent Name: " + name);
          myWriter.write("\nStudent Level " + level);
          myWriter.write("\nHonors Student: " + ishonors);
          if (passed)
              myWriter.write("\nStudent Passed\n");
          else
              myWriter.write("\nStudent did not pass\n");

	  }//while
	  
	  myWriter.close();
	  
    }//main
}//class