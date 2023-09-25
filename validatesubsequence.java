/*Validate Subsequence

Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same order as they appear in the array. For instance, the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4]. and so do the numbers [7, 4] Note that a single number in an array and the array itself are both valid subsequences of the array.
sample 1
Sample Input

array[5, 1, 22, 25, 6, -1, 8, 10] [1, 6, -1, 10]

Sample Output

true

sample 2
Sample Input

array[5, 1, 22, 25, 6, -1, 8, 10] [1, 6, 10, -1]

Sample Output

false*/

public class validatesubsequence {
    public static void main(String[] args) {
        int[] arr={5,1,22,25,6,-1,8,10};
        int[] arr1={1,5,10};

        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==arr1[j]){
                j++;
                count++;
            }

        }
        if(count==arr1.length){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
