/**
 * 
 * @author LUIS PEDRO GARCIA 19344
 *
 * @param <E>
 */
//Interface obtenida de el libro de texto: Duane A.(2007). JavaStructures edicion sqrt(7).


public interface iPriorityQueue<E extends Comparable<E>>
{

public E getFirst();
// pre: !isEmpty()
// post: returns the minimum value in priority queue


public E remove();
// pre: !isEmpty()
// post: returns and removes minimum value from queue


public void add(E value);
// pre: value is non-null comparable
// post: value is added to priority queue


public boolean isEmpty();
// post: returns true iff no elements are in queue


public int size();
// post: returns number of elements within queue


public void clear();
// post: removes all elements from queue
}