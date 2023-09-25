/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30

*/
class Pascal {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numsRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            newRow.add(1)
        }

        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numsRows - 2).get(i - 1) + prevRows.get(numsRows - 2).get(i));
        }

        prevRows.add(newRow);
        return prevRows;


    }
}
