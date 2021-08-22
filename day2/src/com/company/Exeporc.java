package com.company;

public class Exeporc {
    public void  doSomething()
    {
        try {
            int a=10;
            if(a<11)
            {
                throw new Myexeption();
            }
            //double sum=15/0;
            System.out.println("try mej");
            //System.out.println(sum);
        }catch (ArithmeticException e)
        {
            System.out.println("catchi mej");
        }
        catch (Myexeption e)
        {
            System.out.println("my ex");
        }
int a=10;
        System.out.println("a=" + a);

    }
}
