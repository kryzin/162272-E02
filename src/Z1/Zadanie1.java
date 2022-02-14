package Z1;
import java.time.LocalTime;

public class Zadanie1 {
    public static void main(String[] args){
        Integer[] sorted = new Integer[]{1,2,2,1};
        Integer[] notsorted = new Integer[]{1,2,3,4,5,6};
        LocalTime[] times = new LocalTime[]{
                LocalTime.MIN,
                LocalTime.MIN.plusHours(1),
                LocalTime.MIN
        };
        LocalTime[] timesn = new LocalTime[]{
                LocalTime.MIN,
                LocalTime.MIN.plusHours(2),
                LocalTime.MIN.plusHours(3)
        };

        System.out.println(ArrayUtil.jestPalindromem(sorted));
        System.out.println(ArrayUtil.jestPalindromem(notsorted));
        System.out.println(ArrayUtil.jestPalindromem(times));
        System.out.println(ArrayUtil.jestPalindromem(timesn));

    }

    public class ArrayUtil{
        public static <T extends Comparable> boolean jestPalindromem(T[] arr){
            for(int i=0; i<=arr.length-1;i++){
                for(int j= arr.length-1; j>0; j--){
                    if(arr[i].compareTo(arr[j])!=0) return false;
                    else i++;
                }
            }   return true;
        }
    }
}
