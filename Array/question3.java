class question3 {
    public static void main(String[] args) {
        System.out.println("Find the messing Elements");

        int arr[] = {1,2,4,5};

        int n = arr.length + 1;

        int expectedSum = n *(n+1)/2;
        int actualSum = 0;


        for(int i = 0; i <arr.length; i++){
             actualSum = actualSum +  arr[i];
        }

        int missing = expectedSum - actualSum;

       
             System.out.println("Find the messing Element :   " + missing);
        
    }
}