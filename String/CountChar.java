
//Java Program to count the total number of characters in a string

public class CountChar    
{    
    public static void main(String[] args) {    
        String str = "Java Program for counting characters";    
        int count = 0;    
           
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
           
        System.out.println("Total number of characters in a string: " + count);    
    }    
} 
