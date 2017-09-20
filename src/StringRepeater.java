
import java.lang.Math;
import java.lang.StringBuilder;

public class StringRepeater
{
  public String repeat(int times, String text)
  {
    StringBuilder sb = new StringBuilder();
    if(times <= 0) return "";
    
    for(int i = 1; i <= times; i++)
    {
      sb.append(text);
    }
    return sb.toString();
  }
}


