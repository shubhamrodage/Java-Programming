// Write a program to check whether a number is a palindrome or not.
class Logic
{
    void CheckPalindrome(int iNo)
    {
        
        int temp = iNo; 
        int rev = 0;
        int iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            rev = (rev * 10) + iDigit;
            iNo = iNo/10;
        }
        if(rev == temp)
        {
            System.out.println("it is Palindrome");
        }
        else
        {
             System.out.println("it is not Palindrome");
        }
    }


}
class program2
{
    public static void main (String A[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);

    }
}