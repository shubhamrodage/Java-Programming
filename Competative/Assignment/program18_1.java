// Write a program to check whether a number is prime or not.
class Logic
{
    void CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;

        if(iNo <= 1)
        {
            System.out.println("Invalid input");
            return;
        }

        for(iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                bFlag = false;
                break;
            }
           
        }
         if(bFlag == true)
        {
            System.out.println("It is Prime number");
        }
        else
        {
            System.out.println("It is Prime not number");   
        }
}

}
class program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(12);
    }
}