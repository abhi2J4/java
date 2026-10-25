// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class question5 {
    public static void main(String[] args) {
        System.out.println("Find the majority Elements in Java");


        int arr[] = {2,2,2,2,2,2,9,9,9,9,9,9,9,9};

        int candidate = 0;
        int count = 0;


        for(int  i = 0; i <arr.length;i++){
            if(count == 0){
                candidate = arr[i];
            }

            if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}
