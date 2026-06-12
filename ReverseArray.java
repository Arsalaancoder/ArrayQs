public class ReverseArray {

    public static void reverseArray(int[] arr){
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            temp[i] = arr[arr.length - 1 - i];
        }
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = temp[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
   public static void main(String[] args) {

    int arr[] = {1, 2, 3, 4, 5};
    reverseArray(arr);
    
   
    
   }
    
}
