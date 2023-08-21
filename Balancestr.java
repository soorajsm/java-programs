import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Balancestr 
{
    public static void main(String[] args) 
    {
        int begindx=0,endindx=0;
        int rcount=0,lcount=0;
        String str="RLLLLRRRLR";
        char strarray[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            char c=strarray[i];
            if(c=='R')
                rcount++;
            if(c=='L')
                lcount++;

            if(rcount==lcount)
            {
                
                endindx=i;
               
                String st=str.substring( begindx,endindx+1);
                System.out.print("("+st+")");
                rcount=0;
                lcount=0;
                begindx=endindx+1;
            }
            
        }

    }
}
