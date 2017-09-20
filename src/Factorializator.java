
import java.lang.Math;
import java.lang.StringBuilder;

public class Factorializator
{
  public int factorialize(int number)
  {
    int result = 1;
    for (int i = number; i>0; i--)
    {
      result = result*i;
    }
    return result;
  }
}

