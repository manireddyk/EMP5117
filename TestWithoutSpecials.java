/*
 * Problem 1.2
 * This program is to reprint the statement by removing all the special characters.
 */

//introduced TestWithoutSpecials class
public class TestWithoutSpecials {
public  static	void main (String [ ]args ) {
System.out.println("\nTesting \"withoutSpecials\"\n") ;
String test="This is a normal sentence .";
System.out.println("The string	\"" + test+ "\"  becomes  \"" +StringUtils.withoutSpecials(test)+"\"");
test ="justOneString";
System.out.println( "The string	\"" + test+ "\" becomes \""+StringUtils.withoutSpecials(test)	+"\"" ) ;
test="With:Some ./ ,\"#2 @4	characters ";
System.out.println("The	string\"" + test+ "\"  becomes  \"" +StringUtils.withoutSpecials(test)+	"\"" ) ;
}
}
