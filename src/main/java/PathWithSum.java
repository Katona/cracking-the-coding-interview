import btree.Node;

public class PathWithSum {
    public int countPathWithSum(int sum, Node<Integer> node) {
        if (node == null) {
            return 0;
        }
        int remaining = sum - node.value;
        if (remaining == 0) {
            return 1;
        }
        int leftCount = countPathWithSum(remaining, node.left) + countPathWithSum(sum, node.left);
        int rightCount = countPathWithSum(remaining, node.right) + countPathWithSum(sum, node.right);
        return leftCount + rightCount;
    }
}