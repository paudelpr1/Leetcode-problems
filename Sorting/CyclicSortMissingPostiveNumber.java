package Sorting;

public class CyclicSortMissingPostiveNumber {
    public static void main(String[] args){
        int[] arr = {1,-2, 0 , 3};
        int result = firstMissingPositive(arr);
        System.out.println(result);

    }

    static int firstMissingPositive(int[] nums) {
        int num = cyclicSort(nums);
        return num;
        
    }

    static int cyclicSort(int[] arr){
        int i = 0; 
        while(i < arr.length ){
            int index = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[index]){
                swap(arr, i, index);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }

        }
        return arr.length + 1;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
