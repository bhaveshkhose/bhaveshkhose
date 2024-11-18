#include<stdio.h>
#include<string.h>

//Method for sorting array by Insertion sort
void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
//method for sorting array by selection sort
void selectionSort(int arr[], int n) {
    int i, j, minIndex, temp;

    // Traverse through all array elements
    for (i = 0; i < n - 1; i++) {
        // Find the minimum element in the unsorted part
        minIndex = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap the found minimum element with the first element
        temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

// Method for pattern matching 
void patternMatching(char text[], char pattern[]) {
    int textLen = strlen(text);
    int patternLen = strlen(pattern);
    int found = 0;

    // Loop through the text
    for (int i = 0; i <= textLen - patternLen; i++) {
        int j;

        // Check if the pattern matches the substring in text
        for (j = 0; j < patternLen; j++) {
            if (text[i + j] != pattern[j]) {
                break;
            }
        }

        // If the pattern is found
        if (j == patternLen) {
            printf("Pattern found at index %d\n", i);
            found = 1;
        }
    }

    // If pattern is not found
    if (!found) {
        printf("Pattern not found in the text.\n");
    }
}

// Function to print the array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main function to test insertion sort
int main() {
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf(n);

    printf("Original array: ");
    printArray(arr, n);

    insertionSort(arr, n);

    printf("Using Insertion,Sorted is array: ");
    printArray(arr, n);

    int[] nums = {30,23,1,5,4,3,19};
    int i = sizeof(nums) / sizeof(arr[0]);
    selectionSort(nums , i);
    printArray(nums , i);

    return 0;
}
