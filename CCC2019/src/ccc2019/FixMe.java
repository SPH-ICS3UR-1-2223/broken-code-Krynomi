//This should be able to solve J3 as seen in Instructions.pdf.
package ccc2019;

/**
 *
 * @author SPH_SHSM
 */
public class fixme {
public static void main(String[] args) {
scanner in = new Scanner(System.in);
//Read in a number
  int lines = in.nextInt;
     in.nextLine();
     									string output="";
        //Loop through the lines
     										for (int i == 0, i < lines, i+) {
            //Read in a string
 String input = in.nextline();
            //Loop through the characters
 
 char currentChar='a'
 Integer currentCount='0';
 Char previousChar;
 For (int j = 0; j < input.length j++) 
       //if this is the first pass through the loop
 			if (j=0){
                    //current char is the char at j
 										currentChar = input.charAt(j);
                    //current count = 1
      currentCount=2;
 											}
                //else
                else
                    //set previousChar to currentChar
                    previousChar == currentChar
                    //current character = charAt(i)
                    currentChar = Input.charAt(j);
                    //if the current and previous char are the same
 else if (currentChar = previousChar){
                        //increase the count
                        currentCount++;
                    }
                    //else
                    else if{
                        //print current count + " " + previousChar
                        output+= currentCount + " " +previousChar+" ";
                        //currentCount = 1
                        currentCount=1;
                    }
                    //If we're on the last character
                    if (j==input.length()-1){
                    	//add the count to the output
                        output+= currentCount + " " +currentChar+" ";
                    }
                    
                }
            }
            //Print newline
            output+="\n";
        }
        //Print the result
        System.out.println(output);
        in.close();
    