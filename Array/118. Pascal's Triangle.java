public class Solution {
    public List<List<Integer>> generate(int numRows) {

        // However, there is a major difference between them.

        // The set() method adds a new element at the specified position by replacing
        // the older element at that position.
        // The add() method adds a new element at the specified position by shifting the
        // older element towards the right position.
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            System.out.println(row);

            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;

    }
}