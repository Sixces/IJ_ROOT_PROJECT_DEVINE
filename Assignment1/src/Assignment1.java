import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class Assignment1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
        // double voltage, watthour,capacity,ohms,current,run,mins
        // int hours
        System.out.println("What is the voltage of your battery?");
        // pull in the value from the scanner
        System.out.println("What is the capacity of your battery in amp hours?");
        // pull in the value from the scanner
        //calc watthour by multiplying voltage by capacity
        //output watthour to the user with a formatted string and the variable value
        System.out.println("What is the resistance of your load in ohms?");
        // pull in the value from the scanner
        //calc current(amps per hour drawn) with the "Ohm's Law" formula voltage divided by resistance in ohms
        //calc run time on that battery

        //to determine 'run' you need to: First divide capacity by current. Second multiply that by 60. This will give you the runtime in mins. Example: (11amps cap/2 amps current) is (11/2 = 5.5) * 60 mins per hour or 330 mins 'run')
        //calc hours: you may need to do a typecast to int (int) to ensure no decimal is sent into hours to avoid a type mismatch or lossy conversion.
        // if we use the example above 'run' is 330 mins, to get the hours we only want the whole number hours as we will calc mins later. If you divide 330 by 60 youll get back 5.5, thats no good. a typecast will force a truncation to 5. output = (int) (math expression producing non int here) as the value passes through the (int) it will act like a converter to properly truncate the decimal off to make the value into an int before it goes across the = for assignment. 'hours' would be your output in this case with the run/60 as the expression

        //Now lets go after the mins
        //use your modulus operator to mod run by 60, it will grab the remainder of the /60 operation. 330 mod 60 is 30.


        // Finally, lets output our runtime showing hours and mins as well as the current as amps per hour. You must use a combination of prebuilt strings and your hours,mins,current variables.


        // before handin: 1: check your program for accuracy against the example shown on canvas using the input data below. 2: Remove ALL comment lines from the program. 3. Take a screenshot of your programs output for the data below. 4. Now, if everything above is ok handin the screenshot, java source file(NOT .class file) to the Canvas handin page

    }
}

//Test your program with the following input
/*
Battery voltage: 12
Capacity(Amp Hours): 100
Resistance(Ohms): 1
Your output should indicate a runtime of 8 hours and 20 mins at a rate of 12 amps per hour

You can verify using Ohms law any other inputs to check accuracy
amps per hour is Voltage/resistance (12/1) = 12amps per hour
watts is voltage * capacity (12*100) = 1200 watts
runtime is (capacity/amp per hour consumed) (100/12) = 8.33 hours. This however wont give us hours and minutes.
Standardize this runtime to minutes, multiply it by 60.
To derive the hours and mins we will divide it by 60 to get the hours and modulus it by 60 for the minutes.
This can be done as a single line
runtime = (capacity/current) * 60
*/
