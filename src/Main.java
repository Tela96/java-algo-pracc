
import java.lang.Math;
import java.lang.StringBuilder;

public class Main
{
  
  public static void main(String[] args)
  {
    Factorializator fac = new Factorializator();
    System.out.println(fac.factorialize(5));
    
    StringReverser rev = new StringReverser();
    System.out.println(rev.reverse("Hey, Vsauce!"));
    
    PalindromeChecker palchk = new PalindromeChecker();
    System.out.println(palchk.check("H e y ,  V s a u c e    ! "));
    System.out.println(palchk.check("aha"));
    
    LongWordFinder lwf = new LongWordFinder();
    System.out.println(lwf.findLongestWord("AAAAAAAAAAAAAAAAAAA aaa bbbbb"));
    
    TitleCasificator tc = new TitleCasificator();
    System.out.println(tc.titlecasify("hey vsauce, michael here!"));
    
    LargestNumberFinder lnf = new LargestNumberFinder();

    for(int num: lnf.findLargestInAllArrays(new int[][]{{4, 9, 1, 3}, {13, 35, 18, 26}, {32, 35, 97, 39}, {1000000, 1001, 857, 1}}))
    {
      System.out.println(num);
    }
    
    StringRepeater sr = new StringRepeater();
    System.out.println(sr.repeat(3, "Hey Vsauce!"));
    
   StringTruncator st = new StringTruncator();
   System.out.println(st.truncate("hey vsauce, michael here!", 12));
  }
}


