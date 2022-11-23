public class StringToChar
{  
 public static void main(String args[])
 {  
    String s1="hello";    
    char[] ch=s1.toCharArray();    
     for(int i=0;i<ch.length;i++)
     {    
            System.out.println("char at "+i+" index is: "+ch[i]);   
     }  
 }
}  