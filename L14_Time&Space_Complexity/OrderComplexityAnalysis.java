public class OrderComplexityAnalysis {
    public static void main(String[] args) {
        // Amount of space or time taken upby an algorithm or code as function of input size
        System.out.println("Not the actual time taken");
        /*****************
         * Time and Space Complexity
         * -> we should find the worst case always for the time complexity
         * -> now some loop analysis is done and learned
         * *****************/
        System.out.println("Oyasumi....");
        System.out.println("should not break my streak");


        /**************
         * Now recursion analysis for time and space complexity is started...
         * In this, I learned a lot about the worst and base case of recursion.
         * And I did learn how to find out all this with some formulas..... (Intuitively or practically)
         * Some rules :
         * 1. Total work done = (no. of calls * work in each call)
         * 2. Recurrence Relation/equation
         * 3. Space Complexity = (max depth * memory in each call)
         * ************** */


        /*****************
         * Analysis for MergeSort() ->
         * It is a little tricky coz, it has two different time complexity
         * One is for mergeSort() and one is for merge() function that merge the element back to original as sorted...
         * For merge() ->
         * it has 3 while loop = O(n)
         * and 1 for loop = O(n)
         * Thus TC of merge() is O(n)
         * 
         * 
         * 
         * ******************/
    }
}