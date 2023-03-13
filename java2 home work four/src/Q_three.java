public class Q_three
{
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        CircularlyLinkedList<?> other = (CircularlyLinkedList<?>) o;
        if (size() != other.size())
        {
            return false;
        }
        if (size() == 0 && other.size() == 0)
        {
            return true;
        }
        Node<E> current = tail.getNext();
        Node<?> otherCurrent = other.tail.getNext();
        while (current != tail)
        {
            if (!current.getElement().equals(otherCurrent.getElement()))
            {
                return false;
            }
            current = current.getNext();
            otherCurrent = otherCurrent.getNext();
        }
        return tail.getElement().equals(other.tail.getElement());
    }
}