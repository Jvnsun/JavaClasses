import java.util.ListIterator;

public class PutOnlyArrayListListIterator<T> implements ListIterator<T> {
  private ListIterator<T> listIterator;

  public PutOnlyArrayListListIterator(ListIterator<T> listIterator) {
    this.listIterator = listIterator;
  }

  @Override
  public void add(T arg0) {
    this.listIterator.add(arg0);

  }

  @Override
  public boolean hasNext() {
    return this.listIterator.hasNext();
  }

  @Override
  public boolean hasPrevious() {
    return this.listIterator.hasPrevious();
  }

  @Override
  public T next() {
    return this.listIterator.next();
  }

  @Override
  public int nextIndex() {
    return this.listIterator.nextIndex();
  }

  @Override
  public T previous() {
    return this.listIterator.previous();
  }

  @Override
  public int previousIndex() {
    return this.listIterator.previousIndex();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public void set(T arg0) {
    this.listIterator.set(arg0);
  }

}