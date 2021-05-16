package generic;

public class OrderedPaire<K, V> implements Pair<K, V>{
    private K key;
    private V value;

    public OrderedPaire(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OrderedPaire{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
