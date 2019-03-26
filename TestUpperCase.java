/*
 * Problem 1.1
 * This program is to convert the lower case letters to upper case while also checking characters.
 */

//introduced TestUpperCase class
public class TestUpperCase {
public static void main(String []args){
	//printing the statement
	System.out.println("\nTesting \"upperCase\"\n" ) ; 			
String test= "all lower	case" ;		
	//command for print
	System.out.println("The String \"" + test+ "\"  becomes  \"" +StringUtils.upperCase(test)+"\"");
test="This Is An Mixed";		
	//print statement
	System.out.println( "The String \"" + test+ "\" becomes \"" +StringUtils.upperCase(test)+"\""); 
test ="ALL UPPER CASE";	
	//print statement
	System.out.println("Thestring \""+test+ "\"  becomes  \"" +	StringUtils.upperCase(test)	+	"\"" ) ;
test="With: Some  ./ ,#2 @4	characters ";	
	//print statement
	System.out.println("The	string  \"" +test+ "\"  becomes  \"" +StringUtils.upperCase(test )	+"\"" ) ;
}	
}

