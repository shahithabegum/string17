import java.util.*;
import java.lang.*;
class se17
{
  public static void main(String arg[])
   {
     try
         {
            StringBuilder sb=new StringBuilder("The book contain ");
             char[] arr={'1','2','3','4','5','6'};
	sb.append(arr,1,3);
	System.out.println(sb+" pages");
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}