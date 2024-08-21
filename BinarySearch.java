import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr = {10,20,30,50,100,200, 1000};
      
      int l = 0;
      int r = arr.length - 1;
      int key = 50;
      
      while(l <= r) {
        
        int mid = ((l+r) / 2);
        
        if(key == arr[mid]){
          System.out.println("Element Found at Index: "+mid+" and Element is: "+arr[mid]);
        
          return;
        }
        else if(key < arr[mid]){
          r = mid - 1;
        }
        else{
          l = mid - 1;
        }
      }
      System.out.println("Element Not Found in Array");
  }
}
