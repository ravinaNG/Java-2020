import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] list = {5, 1, 12, -5, 16, 2, 12, 14};
        int counter = 0;
        int swape_num = 0;
        while(counter<list.length){
            int mini_num = list[counter];
            int index = counter;
            int mini_num_index = 0;
            while(index<list.length){
                if(list[index]<mini_num){
                    mini_num = list[index];
                    mini_num_index = index;
                }
                index++;
            }
            swape_num = list[counter];
            list[counter] = mini_num;
            list[mini_num_index] = swape_num;
            counter++;
        }
        System.out.println(list.toString(list));
    }
}