
//Java Program to replace the spaces of a string with a specific character

public class ReplaceSpace  
{  
    public static void main(String[] args) {  
        String string = "Java Program to replace the spaces of a string with a specific character";  
        char ch = '@';  
          
        string = string.replace(' ', ch); 
          
        System.out.println("String after replacing spaces with @ character: ");  
        System.out.println(string);  
    }  
} 