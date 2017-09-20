
import java.lang.Math;
import java.lang.StringBuilder;

public class PalindromeChecker
{
  
  private StringReverser rev = new StringReverser();
  
  public boolean check(String possiblePalindrome)
  {
   	String paliNoSpaces = removeWhiteSpaces(possiblePalindrome);
    String paliReversed = rev.reverse(paliNoSpaces);
    return paliNoSpaces.equalsIgnoreCase(paliReversed);
  }
  
  private String removeWhiteSpaces(String text)
  {
    String textNoSpaces = "";
    for (int i = 0; i<text.length(); i++)
    {
      if (text.charAt(i) != ' ')
      {
        textNoSpaces += text.charAt(i);
      }
    }
    System.out.println(textNoSpaces);
    return textNoSpaces;
  }
  
}

