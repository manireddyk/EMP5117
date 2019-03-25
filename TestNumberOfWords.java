/*
 * Problem 1.4
 * This program gives the standard output by counting words in given statement.
 */

//introduced TestNumberOfWords class
public class TestNumberOfWords {
public  static  void main (String [ ] args){
System.out.println("\nTesting\"numberOfWords\"\n");
String test ="This is some sentence.";
System.out.println("The string \"" +test+ "\" has " +StringUtils.numberOfWords(test)+"words" ) ;
test=" With leading and  trailing spaces " ;
System.out.println("The string  \"" +test + "\"  has  " +StringUtils.numberOfWords(test )+	"words" ) ;
test="With  odd spacing ";
System.out.println( "The string  \"" +test+ "\"  has  " +StringUtils.numberOfWords(test)+"words" ) ;
test="" ;
System.out.println("The	string  \"" +test+"\"has " +StringUtils.numberOfWords(test)+"words" ) ;
}
}
