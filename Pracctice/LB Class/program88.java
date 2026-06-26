import java.util.*;

// input apn dila tar tyat Even, Odd digits kiti vela ala te count karaych ahe
// There are two counter
class DigitX
{
    public void CountEvenOddDigits(int iNo)           // Function
    {
        int iDigit = 0;
        int iCountEven = 0, iCountOdd = 0;           // calculate two counter for digit

        while(iNo != 0)
        {
            iDigit = iNo % 10;                // single digit milnar
            if(iDigit % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
            
            iNo = iNo / 10;
        }
        
        System.out.println("Numbers of Even Digits : "+iCountEven);
        System.out.println("Numbers of Odd Digits : "+iCountOdd);
    }

}

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        dobj.CountEvenOddDigits(iValue);

       

    }


}