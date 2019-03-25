//EMP5117
//Winter 2019
//Assignment-2

//importing utilities
import java.util.Arrays; 			
public class StringUtils { 	
	
	//For problem 1.1
	public static String upperCase(String string){
		//using the return method to print the words in upper case
		return string.toUpperCase();     
}
	//For problem 1.2
	public static String withoutSpecials ( String string ){
     String newstr = string.replaceAll("[^A-Za-z]+", "");
     return newstr;
     }
	
	//For problem 1.3
	public static String reverse ( String string ){
      if ((null == string) || (string.length() <= 1)) {
    	  return string;
      }
      byte [] strAsByteArray = string.getBytes();
      byte [] result = new byte [strAsByteArray.length];

      for(int i = 0; i<strAsByteArray.length; i++){
    	  result[i] = strAsByteArray[strAsByteArray.length-i-1];
      }
      return new String(result);

  }
	
	//For problem 1.4
	public static int numberOfWords( String string ){
            int count=0;

            char ch[]= new char[string.length()];
            for(int i=0;i<string.length();i++)
            {
                ch[i]= string.charAt(i);
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                    count++;
            }
            return count;
  }
	
	//For problem 1.5
	public static String [] splitSentences ( String string ){
    String[] split = string.split("\\.");
    System.out.println(Arrays.toString(split));
    return split;
   }

    }
