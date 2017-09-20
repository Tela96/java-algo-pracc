
import java.lang.Math;
import java.lang.StringBuilder;

public class LargestNumberFinder
{
  public int[] findLargestInAllArrays(int[][] numArrays)
  {
    int[] largestNumbers = new int[numArrays.length];
    int largestInCurrent;
    for(int i=0; i < numArrays.length; i++)
    {
      int[] numArr = numArrays[i];
      largestInCurrent = numArr[0];
      
      for(int num: numArr)
      {
        if(largestInCurrent < num)
        {
          largestInCurrent = num;
        }
        
      }
      largestNumbers[i] = largestInCurrent;
      
    }
    return largestNumbers;
  }
}


