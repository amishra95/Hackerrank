import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    boolean hasLower = false;
    boolean hasUpper = false;
    boolean hasNumber = false;
    boolean isSpecial = false;
    
    String special = "!@#$%^&*()-+";

    
    for(int i = 0; i < password.length(); i++){
        char c = password.charAt(i);
        if(Character.isLowerCase(c)){
            hasLower = true;
        }
       else if(Character.isUpperCase(c)){
            hasUpper = true;
        }
      else if(Character.isDigit(c)){
            hasNumber = true;
        }
        else if (special.indexOf(c) != -1) {
                isSpecial = true;
        }

    }
        int missing = 0;
        
        if(!hasLower) missing++;
        if(!hasUpper)missing++;
        if(!hasNumber) missing++;
        if(!isSpecial)missing++;
    
    
        return Math.max(missing, 6-n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
