public class Q_two
{
    public int size()
    {
        if (tail == null)
        {
            return 0;
        }
        int count = 1;
        Node<E> current = tail.getNext();
        while (current != tail)
        {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
