package Chapter17.Example;

/**
 * @author:YiMing
 * @create:2020/9/1,18:26
 * @version:1.0
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }
}
