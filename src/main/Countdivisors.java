package main;
import java.sql.SQLOutput;
import java.util.*;
import java.io.InputStreamReader;

    class Countdivisors {
        public static void main(String args[]) throws Exception {
            Scanner s = new Scanner(System.in);
            int l = s.nextInt();
            int r = s.nextInt();
            int k = s.nextInt();
            int counter=0;
            if (1<=l && l<=r && r<=1000)
            {
                if(1<=k && k<=1000)
                {
                    for(int i=l;i<=r;i++)
                    {
                        if(i%k==0)
                            counter++;
                       // System.out.println(counter);
                    }
                }

            }
           System.out.println(counter);


        }
    }
