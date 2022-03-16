package com.harman.batch4;

public class Check {

    public static void main(String[] args) {
        try{

            String name = "Hello";
            System.out.println(name.length());
            //int x=10, y = 0,z ;
            //z=x/y;
            //System.out.println(z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divisiblity by ZERO not possible");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null value is not acceptable");
        }

    }
}
