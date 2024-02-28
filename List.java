public interface List<T> {
    void add(T element);
    T remove();
    T get(int index);
    boolean isEmpty();
}