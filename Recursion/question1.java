class question1 {
   public static void  printNum(int n ){
       //base case 

       if(n == 11){
           return;
       }
       System.out.println(n);
       printNum(n+1);
   }
    public static void main(String[] args) {

        int n = 1; 

        printNum(n);
        System.out.println("Try clicking the Run button.");
    }
}