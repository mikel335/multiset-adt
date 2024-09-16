/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
    abstract void add(Integer item);

    abstract void remove(Integer item);

    abstract void contains(Integer item);

    abstract void is_empty();

    abstract void count(Integer item);

    abstract void size();
}
