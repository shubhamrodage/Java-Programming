/*
    iRow = 4
    iCal = 4

    @ @ @ $
    @ @ $ @
    @ $ @ @
    $ @ @ @

*/


import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)                        // Diagonal
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }

}

class program209
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2= 0;
        
        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Colums : ");
        iValue2 = sobj.nextInt();      

        Pattern pobj = new Pattern();      // object  

        pobj.Display(iValue1, iValue2);

    }
}