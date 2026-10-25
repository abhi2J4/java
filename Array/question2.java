// package Array;



//  Q2. Move All Zeros to the End


public class question2 {
  
    public static void main(String[] args) {
        System.out.println("Print all the zero At the End");

        int arr[] ={0,2,3,3,0,4,0,5,3,0,0,0};

        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]  != 0){
                 arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        for(int i = 0 ; i<arr.length;i++){
             System.out.println(arr[i]);
        }



        
    }

}
