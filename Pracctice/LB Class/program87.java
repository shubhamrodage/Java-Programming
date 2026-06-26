import java.util.*;

// input apn dila tar tyat Odd digits kiti vela ala te count karaych ahe
class DigitX
{
    public int CountOddDigits(int iNo)           // Function
    {
        int iDigit = 0;
        int iCount = 0;                      // calculate count for digit

        while(iNo != 0)
        {
            iDigit = iNo % 10;                // single digit milnar
            if(iDigit % 2 != 0)
            {
                iCount++;
            }
            
            iNo = iNo / 10;

        }
        return iCount;
        
    }

}

class program87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;           // return value catch karayla lagnara

        System.out.println("Enter number : ");

        iValue = sobj.nextInt();

        iRet = dobj.CountOddDigits(iValue);

        System.out.println("Numbers of Odd digits are : "+iRet);

    }


}