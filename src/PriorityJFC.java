import java.util.*;
import java.io.*;

public class PriorityJCF<E>
extends AbstractQueue<E>
implements Serializable{

	@Override
	public boolean offer(E e) {
		
		return false;
	}

	@Override
	public E poll() {
		
		return null;
	}

	@Override
	public E peek() {
		
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		
		return null;
	}

	@Override
	public int size() {
		
		return 0;
	}
	
	
}