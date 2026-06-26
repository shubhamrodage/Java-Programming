import java.util.*;

// input apn dila tar tyat Even samation of digits (digit chi addition)
// idigit veriable kadhala
class DigitX
{
    public int SumEvenDigits(int iNo)           // Function
    {
        int iDigit = 0;
        int iSum = 0;                      // calculate count for digit

        while(iNo != 0)
        {
            iDigit = iNo % 10; 

            if(iDigit%2 == 0)
            {       
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum;
        
    }

}

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;           // return value catch karayla lagnara

        System.out.println("Enter number : ");

        iValue = sobj.nextInt();

        iRet = dobj.SumEvenDigits(iValue);

        System.out.println("Samation of Even digits  : "+iRet);

    }


}