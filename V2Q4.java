/**
 *
 * @sya
 */
import java.util.Arrays;
public class V2Q4 {

   /**
    * @param args
    */
    public static void main(String[] args) {
        String[] isbnList = {"123456789X", "1234567890", "0471958697"};
        System.out.println(Arrays.toString(validateISBNList(isbnList)));
        //converts array to string 

        
    }
    
    public static boolean isValidISBN (String initialISBN){
        int sum = 0;
        int length = initialISBN.length(); //length used as variable for forloop
        int lastChar = 0; 
        
        for(int i=0; i<length; i++){
            char currentChar = initialISBN.charAt(i); //declare char in string initialISN
            int valueChar; //used as temp value holder
            
            if(currentChar=='X'&& i==length-1){ //case of X
                lastChar = 10;
                
            }else if(Character.isDigit(currentChar)){ //case of (0-9)
                valueChar = Character.getNumericValue(currentChar); //obtain value from char
                sum += valueChar*(i+1); //add to formula
                
            }else {
                System.out.println("Invalid character in ISBN"); 
                return false;
                //exit program
            }

            
        }
    return lastChar == sum%11; 
    //determine true or false by comparing remainder to lastChar 
    }
    
    public static boolean[] validateISBNList(String[] list){
        boolean[] validatedISBN = new boolean[list.length];
        
        for(int i=0; i<list.length; i++){
            validatedISBN[i] = isValidISBN(list[i]);
            //enter result(true/false) into a boolean array 
            
        }
    return validatedISBN; 
            
    }
}
