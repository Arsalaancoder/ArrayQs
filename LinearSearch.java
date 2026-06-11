class LinearSearch {

     public int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found

    }

   public static void main(String[] args) {
    int[] arr = {5, 3, 2, 8, 1};
    int x = 8;
    int result = new LinearSearch().linearSearch(arr, x);
    System.out.println("Index of " + x + " is: " + result);
   }
    
}
