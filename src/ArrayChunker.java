
import java.lang.Math;
import java.lang.StringBuilder;

public class ArrayChunker
{
  public String[][] chunk(String[] inputArr, int chunkSize)
  {
    int numOfArrays = inputArr.length / chunkSize;
    if((inputArr.length % chunkSize) != 0) numOfArrays++;
    String[][] result = new String[numOfArrays][chunkSize];
    int initialArrayIndexCounter = 0;
   	int itemCounter = 0;
    int arrayCounter = 0;
    while((arrayCounter <= numOfArrays) && (initialArrayIndexCounter <= inputArr.length -1))
    {
     result[arrayCounter][itemCounter] = inputArr[initialArrayIndexCounter];
      itemCounter++;
      initialArrayIndexCounter++;
      if(itemCounter >= chunkSize)
      {
        itemCounter = 0;
        arrayCounter++;
      }
    }
    return result;
  }
  
  public void printResult(String[] inputArr, int size)
  {
    String[][] result = chunk(inputArr, size);
    
    for(String[] arr : result)
    {
      System.out.print("[");
      for(String word : arr)
      {
        if(word != null)
        {
         	System.out.print(word); 
        }
      }
      System.out.print("]");
    }
  }
}


