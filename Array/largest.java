

public class largest {
     public static void main(String[] args) {
        int arr[] = {1,2,3,54,5,8};


        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
              
        }
      System.out.println("The Largest Number is  : "+ largest);
    }
}
