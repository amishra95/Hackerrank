import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static long repeatedString(String s, long n) {
    int i = 0;
    long lCountA = 0, rCountA = 0;
    long sTimes = n / s.length();
    long remainChars = n % s.length();

    if(remainChars > 0){
        for(; i < remainChars; i++){
            if(s.charAt(i) == 'a') lCountA++;
        }
    }
    if(sTimes > 0){
        for(; i < s.length(); i++){
            if(s.charAt(i) == 'a') rCountA++;
        }
    }
    return sTimes * (rCountA + lCountA) + lCountA;
}

}
