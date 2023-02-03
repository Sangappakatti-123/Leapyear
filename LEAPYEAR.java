import java.util.Scanner;
public class LEAPYEAR {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("enter the year");
       int n=s.nextInt();
       if(n%4==0)
       { if(n%100==0)
          { if(n%400==0)
            { System.out.println("the ENTERED YEAR IS LEAP YEAR");
            }
            else {System.out.println("the ENTERED YEAR IS NOT LEAP YEAR");
            }
          }
           else { System.out.println("the ENTERED YEAR IS  LEAP YEAR");}
       }
        else
       { System.out.println("the ENTERED YEAR IS NOT LEAP YEAR");
       }
    }
    }
