import btree.Node;

public class PathWithSum {
    public int countPathWithSum(int sum, Node<Integer> node) {
        if (node == null) {
            return 0;
        }
        int remaining = sum - node.value;
        int totalCount = 0;
        if (remaining == 0) {
            totalCount++;
        }
        totalCount += countDirectPathWithSum(remaining, node.left) + countPathWithSum(sum, node.left);
        totalCount += countDirectPathWithSum(remaining, node.right) + countPathWithSum(sum, node.right);

        return totalCount;
    }

    private int countDirectPathWithSum(int sum, Node<Integer> node) {
        if (node == null) {
            return 0;
        }
        int remaining = sum - node.value;
        int totalCount = 0;
        if (remaining == 0) {
            totalCount++;
        }
        totalCount += countDirectPathWithSum(remaining, node.left);
        totalCount += countDirectPathWithSum(remaining, node.right);

        return totalCount;
    }
}