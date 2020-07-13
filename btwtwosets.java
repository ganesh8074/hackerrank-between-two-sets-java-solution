import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int maxA=0;
        int minB=101;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            int tmp=in.nextInt();
            maxA=tmp > maxA ? tmp:maxA;
            a[i]=tmp;
        }
        int[] b=new int[m];
        for(int  i=0;i<m;i++)
        {
            int tmp=in.nextInt();
            minB=tmp < minB ? tmp:minB;
            b[i]=tmp;
        }
        int count=0;
        intCheck:
        for(int i=maxA;i<=minB;i+=maxA)
        {
            for(int num:a)
            {
                if(i%num!=0)
                continue intCheck;
            }
            for(int num:b)
            {
                if(num%i!=0)
                {
                    continue intCheck;
                }
            }
            count++;
        }
        System.out.println(count);

    }
}
