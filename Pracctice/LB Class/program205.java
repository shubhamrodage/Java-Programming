/*
    iRow = 4
    iCal = 4

    a  b  c  d
    a  b  c  d
    a  b  c  d
    a  b  c  d

*/


import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 97; j <= iCol; j++, ch++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }

}

class program205
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