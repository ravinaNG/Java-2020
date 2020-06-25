import java.util.Scanner;

public class primeNumber{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number:- ");
       int userNum = sc.nextInt();
       int checkingNum = 2;
       int checkedNum = 1;
        while (checkingNum < userNum) {
            checkingNum++;
            if(userNum%checkingNum==0){
                checkedNum = 0;
                System.out.println("This is not a prime number.");
                break;
            }
        }
        if(checkedNum==1){
            System.out.println("This is a prime number.");
        }
   } 
}