import java.util.*;

// input apn dila tar tyat 7 kiti vela ala te count karaych ahe
class DigitX
{
    public int CountDigits(int iNo)           // Function
    {
        int iDigit = 0;
        int iCount = 0;                      // calculate count for digit

        while(iNo != 0)
        {
            iDigit = iNo % 10;                // single digit milnar
            if(iDigit==7)
            {
                iCount++;
            }
            
            iNo = iNo / 10;

        }
        return iCount;
        
    }

}

class program85
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;           // return value catch karayla lagnara

        System.out.println("Enter number : ");

        iValue = sobj.nextInt();

       // dobj.CountDigits(iValue);               // Call

        iRet = dobj.CountDigits(iValue);

        System.out.println("Numbers of digits are : "+iRet);

    }


}