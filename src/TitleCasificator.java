
import java.lang.Math;
import java.lang.StringBuilder;

public class TitleCasificator
{
  public String titlecasify(String text)
  {
    StringBuilder sb = new StringBuilder();
    char[] digestedWord;
    char firstChar;
    String[] words = text.split(" ");
    for(String word: words)
    {
    	digestedWord = word.toCharArray();
      	digestedWord[0] = Character.toUpperCase(digestedWord[0]);
      	word = new String(digestedWord);
      	sb.append(word + " ");
    }
    return sb.toString().trim();
  }
}

