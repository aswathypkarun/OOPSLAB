class StringFormatter
 {  
   public static String reverseWord(String str)
   {  
     String words[]=str.split("\\s");  
     String reverseWord="";  
     for(String w:words)
      {  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
       }  
    return reverseWord.trim();  
   }  
} 
class CO3_6 {  
public static void main(String args[])
 {  
    System.out.println(StringFormatter.reverseWord("Sree Narayana Gurukulam College Of Engineering"));  
    System.out.println(StringFormatter.reverseWord("MCA Student"));    
    }  
}  