import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Predicate;

public class PutOnlyArrayList<T> extends ArrayList<T> {

  @Override
  public void clear() {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public Iterator<T> iterator() {
    return new PutOnlyArrayListIterator<T>(super.iterator());
  }

  @Override
  public ListIterator<T> listIterator() {
    return new PutOnlyArrayListListIterator<T>(super.listIterator());
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    return new PutOnlyArrayListListIterator<T>(super.listIterator(index));
  }

  @Override
  public T remove(int index) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public boolean remove(Object o) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public boolean removeIf(Predicate<? super T> filter) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  protected void removeRange(int fromIndex, int toIndex) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException("You can't delete from the list");
  }
}