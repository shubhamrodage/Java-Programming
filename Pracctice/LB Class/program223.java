/*
    iRow = 4
    iCal = 4

    *
    *  *
    *  *  *
    *  *  *  *
  
*/


import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        // filter for diagonal pattern
        if(iRow != iCol)
        {
            System.out.println("Invalid parameters");
            System.out.println("Number of rows and column should be same");
            return;
        }        

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= i; j++)    // j <= i optimization
            {                     
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

}

class program223
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