import java.util.*;

public class kbcGame {
    public static void main(String[] args) {

        String[] questions = new String[] {
            "Q. Where does Ravina work?",
            "Q. What is the post of Ravina?",
            "Q. What is the relation of Ravina with NG?", 
            "Q. Ravina fluint in?", 
            "Q. How many sister are there in Ravina's family?"
        };

        String[][] options = new String[][]{
            {"1. Navgurukul", "2. Rootbridge", "3. P.P.", "4. Pratham"},
            {"1. Intern(Tech team)", "2. Imployee(tech team)", "3. One of Team members(NG)", "4. Nonetech"},
            {"1. Family type", "2. Student", "3. Elumni", "4. comfortable place"},
            {"1. Coding", "2. Mentoring", "3. Commnication", "4. Articulation"},
            {"1. Five", "2. Two", "3. Eight", "4. Four"}
        };
        int[] answers = new int[]{2, 1, 4, 1, 1};
        Scanner user_input = new Scanner(System.in);
        int question_index = 0;
        int lifeline = 1;

        while(question_index<questions.length){
            System.out.println(questions[question_index]);
            int option_index = 0;

            while(option_index<options.length-1){
                System.out.println(options[question_index][option_index]);
                option_index++;
            }

            System.out.println(" ");
            System.out.println("** For LifeLine please enter 0 **");
            System.out.print("What is the correct answer?- ");
            int user = user_input.nextInt();
            System.out.println(" ");
            System.out.println("         *****            ");

            if(user==0){
                if(lifeline>1){
                    System.out.println("Hey, you have used your lifeline.");
                    System.out.println("Please try once more, don't give it up!");
                    System.out.println("         *****            ");
                    System.out.println(" ");
                    continue;
                }
                else{
                    System.out.println(questions[question_index]);
                    if(question_index==0){
                        System.out.println(options[question_index][1]);
                        System.out.println(options[question_index][3]);
                        System.out.print("What is the correct answer?- ");
                        user = user_input.nextInt();
                        System.out.println(" ");
                        System.out.println("         *****            ");
                        // continue;
                    }
                    if(question_index>0 && question_index<answers.length){
                        System.out.println(options[question_index][question_index-1]);
                        System.out.println(options[question_index][question_index]);  
                        System.out.print("What is the correct answer?- ");
                        user = user_input.nextInt();
                        System.out.println(" ");
                        System.out.println("         *****            ");
                        // continue;
                    }
                    lifeline=lifeline+1;
                }
            }

            if(user==answers[question_index]){
                System.out.println("Congratulations! you are correct :)");
                System.out.println("         *****          ");
                System.out.println(" ");
            }
            else{
                System.out.println("Oh Sorry!, your answer is wrong :(");
                System.out.println("         *****          ");
                System.out.println(" ");
            }
            question_index++;
        }
    }
}


        