/**The 'a' key on the keyboard is not working correctly. Instead of typing 'a' or 'A', it toggles the CapsLock.
 Return the value of a string that is typed into a keyboard on such a faulty keyboard.
 Note: If shift is pressed when CapsLock is on characters will be printed in lower case

 e.g.
 Input: "Help, my keyboard is not working"
 Output: "Help, my keyboRD IS NOT WORKING"

 Input: "Hi my name is Adam Levine"
 Output: "Hi my nME IS dM lEVINE"
*/


 public class lowerCaseQuestion {
     public void main(args String){


     }

     public String solution(String str){
         if(str.length() == 0 || str == null){
             return "";
         }

         int pos = str.indexOf(a);

         str = str.replaceAll("\\s", "");

         String s = new String(str.length());
         str = str.substring(0, pos) + str.substring(pos,str.length()-1).toLowercase();

         return str;

     }
}
