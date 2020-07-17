public class ghost_room {
    public static void main(String[] array) {
        int[][] main_list = new int[][]{{5, 2, 3, 0}, 
                                        {2, 1, 5, 3}, 
                                        {0, 1, 2, 1}, 
                                        {3, 0, 2, 0}};
        int list_element = 0;
        int small_list_element = 0;
        int sum = 0;
        int last_list = main_list.length - 1;

        while(list_element<=last_list){
            if(list_element < last_list && list_element > 0){
                if(main_list[list_element+1][small_list_element] != 0 && main_list[list_element-1][small_list_element] != 0){
                    sum = sum + main_list[list_element][small_list_element];
                }
                if(list_element < last_list && list_element > 0){
                    if(main_list[0][small_list_element] != 0 && main_list[list_element][small_list_element] != 0){
                        sum = sum + main_list[list_element][small_list_element];
                    }
                }
            }
            if(main_list[1][small_list_element] != 0){
                sum = sum + main_list[0][small_list_element];
            }
            if(main_list[last_list-1][small_list_element] != 0){
                sum = sum + main_list[last_list][small_list_element];
            }
            list_element ++;
            small_list_element ++;
        }
        System.out.println(sum);
    }
    
}