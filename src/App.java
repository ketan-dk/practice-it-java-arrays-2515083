
import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {

    int[] arr = new int[]{20, 30, 40, 50, 60, 70};

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }

    System.err.println("______________");

    for(int i=arr.length-1; i>=0; i--){
      System.out.println(arr[i]);}

      System.out.println("______________");
    for(int i=arr.length-1; i>=0; i=i-2){
      System.out.println(arr[i]);
    }  
    System.out.println("____________");

      for(int item : arr){
        System.out.println(item);
      }

      System.out.println("JAVA Streams_________");

      //Java streams
      Arrays.stream(arr).forEach(System.out::println);

      //Arrays.streams(arr).filter
      //Arrays.streams(arr).average
      //Arrays.streams(arr).sum()
  }
}