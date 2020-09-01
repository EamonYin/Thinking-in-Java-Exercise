package Chapter17.Example;
import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * @author:YiMing
 * @create:2020/9/1,18:26
 * @version:1.0
 */

public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> gen, int quantity) {
        for(int i = 0; i < quantity; ++i) {
            Pair<K, V> p = (Pair)gen.next();
            this.put(p.key, p.value);
        }

    }
    public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
        for(int i = 0; i < quantity; ++i) {
            this.put(genK.next(), genV.next());
        }

    }
    public MapData(Generator<K> genK, V value, int quantity) {
        for(int i = 0; i < quantity; ++i) {
            this.put(genK.next(), value);
        }

    }
    public MapData(Iterable<K> genK, Generator<V> genV) {
        Iterator var4 = genK.iterator();

        while(var4.hasNext()) {
            K key = (K) var4.next();
            this.put(key, genV.next());
        }

    }
    public MapData(Iterable<K> genK, V value) {
        Iterator var4 = genK.iterator();

        while(var4.hasNext()) {
            K key = (K) var4.next();
            this.put(key, value);
        }

    }
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity) {
        return new MapData(gen, quantity);
    }
    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quantity) {
        return new MapData(genK, genV, quantity);
    }
    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quantity) {
        return new MapData(genK, value, quantity);
    }
    public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV) {
        return new MapData(genK, genV);
    }
    public static <K, V> MapData<K, V> map(Iterable<K> genK, V value) {
        return new MapData(genK, value);
    }
}
