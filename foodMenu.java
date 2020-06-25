import java.util.Scanner;

public class foodMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day you will cook:- ");
        String day = sc.nextLine();  
        // System.out.println(day); 
        if(day.equals("monday")){
            System.out.println("Rajma chawal :)");
        }
        else if(day.equals("sunday")){
            System.out.println("Biryani");
        }
        else if(day.equals("tuesday")){
            System.out.println("Daal chawal and bhujya");
        }
        else{
            System.out.println("make whatever you want");
        }
    }
}