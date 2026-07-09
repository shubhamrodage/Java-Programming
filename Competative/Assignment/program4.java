// Write a program to find the minimum of three numbers.
class Logic
{
    void minimum(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            System.out.println("a is Greater than a & c : "+a);
        }
        else if(b > a && b > c)
        {
            System.out.println("b is Greater than b & c : "+b);
        }
        else
        {
            System.out.println("c is Greater than a & b : "+c); 
        }
    }
}
class program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.minimum(11,7,9);

    }
}