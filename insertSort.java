// Insertion Sort
// Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly. 
// Time Complexity: O(N2) 


// import java.util.*;
package Sorting;

// class Sorting {
//     public static void printArray(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] ={3,5,6,4,9,7};

//         //insertion sort
//         for(int i=1; i<arr.length; i++) {
//             int current = arr[i];
//             int j= i-1;
//             while(j>=0 && arr[j] > current) {
//                 //keep swaping
//                 arr[j+1] =arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }


class insertSort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,7,5,7,4,9};
        for(int i=1; i<arr.length; i++){
            int current= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>current){
                //keep swaping
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
