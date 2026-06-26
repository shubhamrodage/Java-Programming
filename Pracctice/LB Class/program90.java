import java.util.*;

// input apn dila tar tyat samation of digits (digit chi addition)
// idigit veriable kadhala
class DigitX
{
    public int SumDigits(int iNo)           // Function
    {
        int iSum = 0;                      // calculate count for digit

        while(iNo != 0)
        {
                      
            iSum = iSum + (iNo % 10);
            
            iNo = iNo / 10;
        }
        return iSum;
        
    }

}

class program90
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;           // return value catch karayla lagnara

        System.out.println("Enter number : ");

        iValue = sobj.nextInt();

        iRet = dobj.SumDigits(iValue);

        System.out.println("Samation of digits  : "+iRet);

    }


}