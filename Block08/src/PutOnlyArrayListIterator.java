import java.util.Iterator;

public class PutOnlyArrayListIterator<T> implements Iterator<T> {
  private Iterator<T> iterator;

  public PutOnlyArrayListIterator(Iterator<T> iterator) {
    this.iterator = iterator;
  }

  @Override
  public boolean hasNext() {
    return this.iterator.hasNext();
  }

  @Override
  public T next() {
    return this.iterator.next();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

}