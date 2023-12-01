//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        // Calculate the sum of the given array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sums
        int missingNumber = expectedSum - actualSum;
        
        return missingNumber;
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {1, 2, 3, 5};
        int n1 = 5;
        System.out.println(solution.missingNumber(arr1, n1));  // Output: 4

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int n2 = 10;
        System.out.println(solution.missingNumber(arr2, n2));  // Output: 9
    }
}
