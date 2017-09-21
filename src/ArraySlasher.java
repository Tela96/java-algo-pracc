import java.lang.Math;
import java.lang.StringBuilder;

public class ArraySlasher
{
  public String[] slash(String[] inArr, int slashAmount)
  {
    if(slashAmount >= inArr.length)
    {
      return new String[0];
    }
    
    int outLength = inArr.length - slashAmount;
    String[] outArr = new String[outLength];
    int outIndex = 0;
    
    for(int i = slashAmount; i <= inArr.length -1; i++)
    {
      outArr[outIndex] = inArr[i];
      outIndex++;
    }
    return outArr;
  }
  
  public void printResult(String[] inArr, int slashAmount)
  {
  	String[] result = slash(inArr, slashAmount);
    System.out.println("");
    System.out.print("[");
    for(int i = 0; i<= result.length-1;i++)
    {
      System.out.print(result[i]);
    }
    System.out.print("]");
    
  }
}