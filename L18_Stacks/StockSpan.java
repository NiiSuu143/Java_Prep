import java.util.*;

public class StockSpan {
    // stock span
    public static void stockSpan(int[] stocks, int[] span) {
        // make a stack to put the index of stocks
        Stack<Integer> s = new Stack<>();
        span[0] = 1;  // for 1st stock 
        s.push(0);  // push 0(the index of stock) -> which will become prevHigh

        // 
        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];

            while(!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                span[i] = i+1;  // for last one or last stocks
            } else {
                int prevHigh = s.peek();    // previous high stock
                span[i] = i - prevHigh;
            }

            s.push(i);   // push the current price idx to stack
        }
    }
    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];

        /***************
         * Time Complexity = O(n)
         * Space Complexity = O(n)
         * Span -> Max. no. of consecutive days of which `price <= today's price`
         * **************/
        stockSpan(stocks, span);

        // to print the span
        for(int i=0; i<span.length; i++) {
            System.out.print(span[i]+ " ");
        }
    }
}
