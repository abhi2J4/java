// Online Java Compiler (Editor)
// Write and run Java online using this editor.


// Q4. Remove Duplicates from a Sorted Array

class question4 {
    public static void main(String[] args) {
        System.out.println("Unique Element Find");

        int arr[] = {1,2,2,3,4,4,5,6,6};

        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[index]){
                index++;
                arr[index] = arr[i];
            }
        }

        System.out.println("Unique Element");

        for(int i = 0; i <= index;i++){
                 System.out.println(arr[i]+ " ");
        }

               System.out.println("\nCount: " + (index + 1));
    }
}