public class Q_four
{
    public static <E> boolean sameSequence(CircularlyLinkedList<E> L, CircularlyLinkedList<E> M)
    {
        if (L.size() != M.size())
        {
            return false;
        }
        if (L.size() == 0 && M.size() == 0)
        {
            return true;
        }
        Node<E> tailL = L.tail;
        Node<E> tailM = M.tail;
        Set<Node<E>> visitedNodes = new HashSet<>();
        Node<E> currentL = tailL.getNext();
        Node<E> currentM = tailM.getNext();
        while (currentL != tailL) {
            visitedNodes.add(currentL);
            currentL = currentL.getNext();
        }
        visitedNodes.add(tailL);
        while (currentM != tailM)
        {
            if (!visitedNodes.contains(currentM))
            {
                return false;
            }
            currentM = currentM.getNext();
        }
        return visitedNodes.contains(tailM);
    }
}
