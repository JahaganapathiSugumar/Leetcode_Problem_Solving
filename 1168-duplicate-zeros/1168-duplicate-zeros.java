class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int num : arr){
            if(num == 0){
                zeros++;
            }
        }

        for(int i = arr.length - 1,j = arr.length - 1 + zeros;i != j;i--){
            if(j < arr.length){
                arr[j] = arr[i];
            }
            j--;
            if(arr[i] == 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                j--;
            }
        }
    }
}