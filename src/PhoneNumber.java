public class PhoneNumber {
    /**
     * MAIN METHOD to be run
     * Creates a formatted phone numebrs tring from a properly formed integer array
     * @param A integer array (size 10, single digit only)
     * @return phone number string
     */
    public static String createPhoneNumber(int[] A) {
        if (A.length != 10) {
            throw new IllegalArgumentException("Wrong size array"); 
        }

        int idx = 0; 
        String returnStr = "("; 

        for (;idx<3; idx++) {
            returnStr+=A[idx]; 
        }

        returnStr += ") "; 

        for (;idx<6; idx++) {
            returnStr+=A[idx]; 
        }

        returnStr += "-"; 

        for (;idx<10; idx++) {
            returnStr+=A[idx]; 
        }

        return returnStr; 
    }
}
