
import java.lang.Math;
import java.lang.StringBuilder;

public class LongWordFinder
{
  public int findLongestWord(String text)
  {
    String[] splitted = text.split(" ");
    String longest = splitted[0];
    for(String word : splitted)
    {
      if(word.length() > longest.length())
      {
        longest = word;
      }
    }
    return longest.length();
  }
  
}

