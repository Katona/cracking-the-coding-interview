import static org.junit.Assert.assertEquals;

import org.junit.Test;

import btree.Node;

public class PathWithSumTest {
    @Test
    public void test() {
        Node<Integer> root = new Node<>(1, new Node<>(1), new Node<>(1));
        PathWithSum summer = new PathWithSum();
        assertEquals(2, summer.countPathWithSum(2, root));
        assertEquals(3, summer.countPathWithSum(1, root));
    }

    @Test
    public void testNonConsequtive() {
        Node<Integer> root = new Node<>(1, 
            new Node<>(1,
                new Node<>(0,
                    new Node<>(2),
                    null),
                null),
            null);
        PathWithSum summer = new PathWithSum();
        assertEquals(1, summer.countPathWithSum(3, root));
    }

    @Test
    public void testMedium() {
        Node<Integer> root = new Node<>(1,
            new Node<>(1,
                new Node<>(1),
                new Node<>(1)
            ),
            new Node<>(1,
                new Node<>(1),
                new Node<>(1)
            )
        );
        PathWithSum summer = new PathWithSum();
        assertEquals(6, summer.countPathWithSum(2, root));

    }

    @Test
    public void testBig() {
        Node<Integer> root = new Node<>(1, 
            new Node<>(1,
                new Node<>(1,
                    new Node<>(1),
                    new Node<>(1)
                ),
                new Node<>(1,
                    new Node<>(1),
                    new Node<>(1)
                )
            ),
            new Node<>(1,
                new Node<>(1,
                    new Node<>(1),
                    new Node<>(1)
                ),
                new Node<>(1,
                    new Node<>(1),
                    new Node<>(1)
                )
        ));
        PathWithSum summer = new PathWithSum();
        assertEquals(15, summer.countPathWithSum(1, root));
        assertEquals(14, summer.countPathWithSum(2, root));

    }
}