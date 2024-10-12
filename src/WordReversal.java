// 10.100.100.5
public class WordReversal {

    /**
     * MAIN FUNCTION TO BE CALLED
     * Reverses each word in a string given each word has a length greater or equal to 5. 
     * Includes spaces if multiple words. 
     * @param s the string to be parsed
     * @return the reversed string
     */
    public static String wordReversal(String s) {
        String[] words = s.split(" "); 
        String finalWord = ""; 

        for (String word: words) {
            if (word.length()>=5) {
                finalWord += reverseWordHelper(word); 
            }
            else {
                finalWord+=word; 
            }
            finalWord+=" "; 
        }

        return finalWord.substring(0, finalWord.length()-1); 
    }
    
    /**
     * Helper method dfor main fucntion (DO NOT CALL)
     * @param s String of one word to be called
     * @return reversed string
     */
    private static String reverseWordHelper(String s) {
        char[] letters = new char[s.length()]; 
        for (int i=0; i<s.length(); i++) {
            letters[i] = s.charAt(i); 
        }

        int front = 0; 
        int back = letters.length-1; 

        while (front<=back) {
            char temp = letters[front]; 
            letters[front] = letters[back]; 
            letters[back] = temp; 
            front++; 
            back--; 
        }

        String returnStr = ""; 

        for (char c: letters) {
            returnStr+=c; 
        }
        
        return returnStr; 
    }
}
