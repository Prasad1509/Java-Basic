import java.util.Scanner;
class armstrong
{
public static void Arm (String args[]) 
 {
    Scanner sc = new Scanner(System.in);
    int n,arm=0,rem,c;
    System.out.println("Enter the number");
    n=sc.nextlnt();
    c=n;
    while(n>0)
    {
        rem=n%10;
        arm=(rem*rem*rem)+arm;
        n=n/10;
    }

  if(c==arm)
  System.out.println("Armstrong number");
  else
  System.out.println("Not Armstrong number");



    
 }
}