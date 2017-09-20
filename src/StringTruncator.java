
import java.lang.Math;
import java.lang.StringBuilder;

public class StringTruncator
{
  public String truncate(String text, int maxLength)
  {
    String dots = "...";
    int actualLength = maxLength - dots.length();
    char[] chars = text.toCharArray();
    int charCount = 0;
    StringBuilder sb = new StringBuilder();
    
    if(maxLength < 3) return dots;
    if(maxLength > text.length()) return text;
    
    while(charCount <= actualLength)
    {
      sb.append(chars[charCount]);
      charCount++;
    }
    sb.append(dots);
    return sb.toString();
    
    
  }
}


