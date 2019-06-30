
import java.util.Arrays;


public class MyArr {
    public int[] checkAndGetFour(int[] arr){

            for (int i = arr.length-1, count = 0; i>=0; i--, count++) {
                if(arr[i] == 4){
                    int[]answer = new int[count];
                    System.arraycopy(arr,i+1,answer,0,count);
                    return answer;
                }
            }
            throw new RuntimeException("there is no FOUR");
    }

    public boolean checkForOneAndFour(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(i == 4 || i == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try{
            int[] temp = {2, 2, 1,4, 32, 5, 6, 7, 45, 56, 545, 45};
            System.out.println(Arrays.toString(new MyArr().checkAndGetFour(temp)));
            System.out.println(new MyArr().checkForOneAndFour(temp));
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}