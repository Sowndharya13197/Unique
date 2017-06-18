import java.io.*;
import java.util.*;
public class Unique {
    public static void main(String args[])
    {
        int n,i,j,count=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
          { if(i!=j)
          { if(a[i]!=a[j])
        {
            count=1;
        
        }
        else
        {count=0;
      break;
        }
       }}
        if(count==1)
         {
            System.out.println(a[i]);
        }
        }}}
