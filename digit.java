import java.io.*;
import java.util.*;
class digit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int count=0;
        while(t>0)
        {
          t=t/10;
          count=count+1;
         }
        System.out.println(count);
     }
}
