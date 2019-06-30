import java.util.ArrayList;
import java.util.Arrays;


public class MyArr {
    public int[] checkAndGet(int[] arr){

            for (int i = arr.length-1, count = 0; i>=0; i--, count++) {
                if(arr[i] == 4){
                    int[]answer = new int[count];
                    System.arraycopy(arr,i+1,answer,0,count);
                    return answer;
                }
            }
            throw new RuntimeException("there is no FOUR");


    }

    public static void main(String[] args) {
        try{
            int[] temp = {2, 2, 1,4, 32, 5, 6, 7, 45, 56, 545, 45};
            System.out.println(Arrays.toString(new MyArr().checkAndGet(temp)));

        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}