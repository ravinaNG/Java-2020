import java.util.Arrays;
public class secondMaxInNestedLoop {
    public static void main(String[] args) {
        int list[] = {0, 1, 6, 2, 5, 10};
        int max_num = 0;
        int iteration = 0;
        int second_max = 0;
        while(iteration<list.length){
            if(max_num<list[iteration]){
                max_num = list[iteration];
            }
            int second_iteration = 0;
            while(iteration>second_iteration){
                if(list[second_iteration]>second_max && list[second_iteration] <max_num){
                    second_max = list[iteration];
                }
                second_iteration++;
            }
            iteration++;
        }
        System.out.print("This is the array:- ");
        System.out.println(Arrays.toString(list));
        System.out.print("Max number:- ");
        System.out.println(max_num);
        iteration = 0;
        System.out.print("Second max number:- ");
        System.out.println(second_max);
    }
}