public class ArraySum {
   static int sumArray(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++)
    sum=sum+arr[i];
   return sum;
   }
        public static void main(String[] args){
            int arr[]={242,2523,3633,23};
            System.out.println(sumArray(arr));
            System.out.println("Al Wahab");
}
}
