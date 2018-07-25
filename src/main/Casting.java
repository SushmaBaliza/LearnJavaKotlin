package main;


public class Casting {
    public static void main(String[] args) {
        int x=10;
        long l=x;
        double d=l;
//        System.out.println(d);
//        System.out.println(l);
//       System.out.println(x);
        String s=String.valueOf(x);
        System.out.println(x);
        System.out.println(x+100);
        System.out.println(s+20);
       int result = Integer.parseInt(s+100);
      System.out.println(result);
    }
}
