public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String result = "";
        String vowels = "aeiouAEIOU";
    
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            
            if (vowels.indexOf(currentChar) != -1) {
                // Convert to uppercase with ASCII
                if (currentChar > 96 && currentChar < 123) {
                    result += (char)(currentChar + 32); 
                }
                else {result += (char)(currentChar);}
            } else {
                if (currentChar > 96 && currentChar < 123) {
                    result += currentChar;
                } else {result += currentChar - 32;}
            }
    }   
        return result;
    }
    String input = args[0];
    String r = capVowelsLowRest(input);
    System.out.println(r);
    public static String camelCase (String string) {
        String result = "";
        boolean first_letter = true;
        boolean first_ever_letter = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                char currentChar = string.charAt(i);
                if (first_ever_letter) {
                    first_ever_letter = false;
                    if (currentChar > 96 && currentChar < 123) {
                        result += currentChar;
                    }
                    else {result += currentChar - 32;}
                }
                else if (first_letter) {
                    first_letter = false;
                    // already lowercase
                    if (currentChar > 96 && currentChar < 123) {
                        result += currentChar + 32;
                    }
                    else {result += currentChar;}
                }
                else {
                    if (currentChar > 123) {
                        result += currentChar - 32;
                    }
                    else {result += currentChar;}
                }
            }
            else {first_letter = true;}
            
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
