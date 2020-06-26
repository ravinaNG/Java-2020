import java.util.Arrays;
public class secondMax {
    public static void main(String[] args) {
        int list[] = {0, 1, 6, 2, 5, 10};
        int max_num = 0;
        int iteration = 0;
        while(iteration<list.length){
            if(max_num<list[iteration]){
                max_num = list[iteration];
            }
            iteration++;
        }
        System.out.print("This is the array:- ");
        System.out.println(Arrays.toString(list));
        System.out.print("Max number:- ");
        System.out.println(max_num);
        int second_max = 0;
        iteration = 0;
        while(iteration<list.length){
            if(list[iteration]>second_max && list[iteration] <max_num){
                second_max = list[iteration];
            }
            iteration++;
        }
        System.out.print("Second max number:- ");
        System.out.println(second_max);
    }
}
