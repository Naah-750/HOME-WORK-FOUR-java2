public class Q_one
{
    public void addFirst(E e)
    {
        if (size == 0)
        {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }
        else
        {
            tail.setNext(new Node<>(e, tail.getNext()));
        }
        size++;
    }
}
