/**
 * Validate Subsequence
 * 
 * Given two non-empty arrays of integers, write a function that determines whether the second array is a 
 * subsequence of the first one.
 * 
 * A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in
 * the same order as they appear in the array.  For instance, the numbers [1, 3, 4] form a subsequence
 * of the array [1, 2, 3, 4], and so do the numbers [2, 4]. Note that a single number in an array and
 * the array itself are both valid subsequence of the array.
 * 
 * Instructions copied from:
 * https://www.algoexpert.io/questions/Validate%20Subsequence
 */

import java.util.*;

class ValidateSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    
		int sequenceIndex = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == sequence.get(sequenceIndex) && sequenceIndex == sequence.size() - 1) {
				return true;
			}
			
			if (array.get(i) == sequence.get(sequenceIndex)) {
				sequenceIndex++;
			}
		}
		
    return false;
  }

  public static void main(String[] args) {

        //#region Test Cases

        // Case 1
        List<Integer> array1 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence1 = new ArrayList<>(Arrays.asList(1, 6, -1, 10));
        System.out.println("--Case 1--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array1, sequence1) + "\n");

        // Case 2
        List<Integer> array2 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence2 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        System.out.println("--Case 2--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array2, sequence2) + "\n");

        // Case 3
        List<Integer> array3 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence3 = new ArrayList<>(Arrays.asList(5, 1, 22, 6, -1, 8, 10));
        System.out.println("--Case 3--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array3, sequence3) + "\n");

        // Case 4
        List<Integer> array4 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence4 = new ArrayList<>(Arrays.asList(22, 25, 6));
        System.out.println("--Case 4--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array4, sequence4) + "\n");

        // Case 5
        List<Integer> array5 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence5 = new ArrayList<>(Arrays.asList(1, 6, 10));
        System.out.println("--Case 5--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array5, sequence5) + "\n");

        // Case 6
        List<Integer> array6 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence6 = new ArrayList<>(Arrays.asList(5, 1, 22, 10));
        System.out.println("--Case 6--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array6, sequence6) + "\n");

        // Case 7
        List<Integer> array7 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence7 = new ArrayList<>(Arrays.asList(5, -1, 8, 10));
        System.out.println("--Case 7--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array7, sequence7) + "\n");

        // Case 8
        List<Integer> array8 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence8 = new ArrayList<>(Arrays.asList(25));
        System.out.println("--Case 8--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array8, sequence8) + "\n");

        // Case 9
        List<Integer> array9 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        List<Integer> sequence9 = new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println("--Case 9--");
        System.out.println("Correct: true");
        System.out.println("Received: " + isValidSubsequence(array9, sequence9) + "\n");

        // Case 10
        List<Integer> array10 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence10 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12));
        System.out.println("--Case 10--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array10, sequence10) + "\n");

        // Case 11
        List<Integer> array11 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence11 = new ArrayList<>(Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10));
        System.out.println("--Case 11--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array11, sequence11) + "\n");

        // Case 12
        List<Integer> array12 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence12 = new ArrayList<>(Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10));
        System.out.println("--Case 12--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array12, sequence12) + "\n");

        // Case 13
        List<Integer> array13 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence13 = new ArrayList<>(Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10));
        System.out.println("--Case 13--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array13, sequence13) + "\n");

        // Case 14
        List<Integer> array14 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence14 = new ArrayList<>(Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10));
        System.out.println("--Case 14--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array14, sequence14) + "\n");

        // Case 15
        List<Integer> array15 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence15 = new ArrayList<>(Arrays.asList(1, 6, -1, -1));
        System.out.println("--Case 15--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array15, sequence15) + "\n");

        // Case 16
        List<Integer> array16 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence16 = new ArrayList<>(Arrays.asList(1, 6, -1, -1, 10));
        System.out.println("--Case 16--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array16, sequence16) + "\n");

        // Case 17
        List<Integer> array17 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence17 = new ArrayList<>(Arrays.asList(1, 6, -1, -2));
        System.out.println("--Case 17--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array17, sequence17) + "\n");

        // Case 18
        List<Integer> array18 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence18 = new ArrayList<>(Arrays.asList(26));
        System.out.println("--Case 18--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array18, sequence18) + "\n");

        // Case 19
        List<Integer> array19 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence19 = new ArrayList<>(Arrays.asList(5, 1, 25, 22, 6, -1, 8, 10));
        System.out.println("--Case 19--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array19, sequence19) + "\n");

        // Case 20
        List<Integer> array20 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence20 = new ArrayList<>(Arrays.asList(5, 26, 22, 8));
        System.out.println("--Case 20--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array20, sequence20) + "\n");

        // Case 21
        List<Integer> array21 = new ArrayList<>(Arrays.asList(1, 1, 6, 1));
        List<Integer> sequence21 = new ArrayList<>(Arrays.asList(1, 1, 1, 6));
        System.out.println("--Case 21--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array21, sequence21) + "\n");

        // Case 22
        List<Integer> array22 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence22 = new ArrayList<>(Arrays.asList(1, 6, -1, 10, 11, 11, 11, 11));
        System.out.println("--Case 22--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array22, sequence22) + "\n");

        // Case 23
        List<Integer> array23 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence23 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 10));
        System.out.println("--Case 23--");
        System.out.println("Correct: false");
        System.out.println("Received: " + isValidSubsequence(array23, sequence23) + "\n");

        //#endregion
       
  }
}
