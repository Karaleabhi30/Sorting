// package Sorting;

// //Bubble sort
// public class prct {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 8, 5, 9, 6, 2 };
//         // bubble sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j + 1] < arr[j]) {
//                     // keep swapping
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//             printArray(arr);
//         }
//     }
// }

package Sorting;

/**
 * prct
 */

// selection sort

// public class prct {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 5, 8, 6, 2, 9 };
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[smallest]) {
//                     smallest = j;
//                 }
//             }
//             // keep swapping
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }

/**
 * prct
 */
//insertion sort
public class prct {
public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args){
        int arr[]={3,7,5,2,9,6};
     for(int i=1; i<arr.length; i++){
        int current=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>current) {
            //keep swapping
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
     }
     printArray(arr);
    }
    
}