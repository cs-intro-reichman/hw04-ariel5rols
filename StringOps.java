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
                if (currentChar >= 'a' && currentChar <= 'z') {
                    result += (char)(currentChar + 32); 
                }
                else {result += (char)(currentChar);}
            } else {
                if (currentChar >= 'a' && currentChar <= 'z') {
                    result += currentChar;
                } else {result += currentChar - 32;}
            }
    }   
        return result;
    }

    // String r = capVowelsLowRest("input");
    // System.out.println(r);
    public static String camelCase (String string) {
        String result = "";
        boolean firstLetter = true;
        boolean firstEverLetter = true;

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar != ' ') {
                if (firstEverLetter) {
                    firstEverLetter = false;
                    firstLetter = false;
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += currentChar;
                    } else {
                        result += (char) (currentChar + 32);
                    }
                } else if (firstLetter) {
                    firstLetter = false;
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += (char) (currentChar - 32);
                    } else {
                        result += currentChar;
                    }
                } else {
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += currentChar;
                    } else {
                        result += (char) (currentChar - 32);
                    }
                }
            } else {
                firstLetter = true;
            }
        }

        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        int arr_index = 0;
        int[] arr = new int[counter];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[arr_index] = i;
                arr_index++;
            }
        }
        return arr;
    }
}
