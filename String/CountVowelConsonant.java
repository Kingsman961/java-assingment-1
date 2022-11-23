
//Java Program to count the total numbers of vowels and consonants in a string

public class CountVowelConsonant {  
    public static void main(String[] args) {  
         
        int vowelCount = 0, conCount = 0;  
  
        String str = "Count the Vowels And Consonants";  
          
        str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') { 
                vowelCount++;  
            }   
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                conCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vowelCount);  
        System.out.println("Number of consonants: " + conCount);  
    }  
}  