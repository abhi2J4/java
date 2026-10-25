// // package Array;

// public class second {
    

//      public static void main(String[] args) {
//         int arr[] = {1,2,3,54,5,8};


//         int largest = arr[0];
//         int Secondlg = -1; 
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }        
//         }
//       System.out.println(largest);

//          for(int i = 0 ; i < arr.length; i++)
//             {
//                 if(arr[i]> Secondlg && arr[i]!= largest){
//                     Secondlg = arr[i];
//                 }
//             }   
//          System.out.println(Secondlg);
//     }
// }


//optimize Solution


class second {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 54, 5, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second-largest distinct element does not exist");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
