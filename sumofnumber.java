public class sumofnumber {
    public static void main(String[] args) {
        int sum=0;
        for (int number=10; number<=37; number++)
        {
            if ( number%6==0 && number%9==0)
            // if (number%18==0) 18 is lcm of 6 and 9 
            {
                sum=sum+number;
            }
        }
        System.out.println("Sum of no from 10 to 950 is :"+sum);
    }
}