

import java.util.NoSuchElementException;

public class CircularQueue<Element> {

	private Element[] Array;
	private int fro;
	private int rer;
	private int cap;
	public int NumElements;
	
	
	public CircularQueue(int size) {
		this.cap= size;
		this.fro = -1;
		this.rer = -1;
		this.Array = (Element[]) new Object[this.cap];
		this.NumElements = 0;
	}
	
	
	public int getFront() {
		return this.fro;
	}

	
	public int getRear() {
		return this.rer;
	}

	
	public int getNumberOfElements() {
		return this.NumElements;
	}
    
	public Element[] getQueueArray() {
		return this.Array;
	}

	
	public boolean isEmpty() {
		return this.NumElements == 0;
	}
    
	
	public boolean isFull() {
		return this.NumElements == this.cap;
	}

	
	public void enqueue(Element element) throws NoSuchElementException {
		if (isFull())
			throw new IllegalStateException("Queue is full");
		if (element == null)
			throw new NullPointerException("Element is null");
		else {
			if (isEmpty()) {
				fro = rer = 0;
			}
			if (rer > NumElements) { 
				rer = 0;
			}
			Array[rer] = element;
			rer++;
			this.NumElements++;
		}
	}
	

	public Element dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Empty queue.");
		Element result = Array[fro];
		Array[fro] = null;
		fro++;
		this.NumElements--;
		return result;
	}
}