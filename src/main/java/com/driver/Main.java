package com.driver;

public class Main {

    public static  void main(String[] args) {
         A obj = new B();
      String s=  obj.meth();
        System.out.println(s);

        B obj1 = new B();
       String s1 = obj1.meth();
        System.out.println(s1);
    }

    public static class A
    {
       public static   String meth(){
            return ( "Invoking method from class A");
        }
    }
     public static  class B extends A{
         public static  String meth(){
             return ("Method is overridden in Extendend class B");
          }
        }

}