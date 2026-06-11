public class BinarySerach {

    public int binarySearch(int[]arr, int k)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == k)
            {
                return i;
            }
        }        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int result = new BinarySerach().binarySearch(arr, k);
        System.out.println("Index of " + k + " is: " + result);
    }
    
}
