package Chapter17.Test20;//: containers/SimpleHashMaps2.java
// A demonstration hashed Map.

import Chapter17.Test15.MapEntry;
import Chapter17.Test19.SimpleHashMap;
import net.mindview.util.Countries;

import java.util.*;

public class SimpleHashMaps2<K, V> extends SimpleHashMap<K, V> {
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        if (buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K, V>>();
            // Lines added here:
        else {
            System.out.println(
                    "Collision while adding\n" + pair
                            + "\nBucket already contains:");
            Iterator<MapEntry<K, V>> it =
                    buckets[index].iterator();
            while (it.hasNext())
                System.out.println(it.next());
        }
        // End of lines added
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if (!found)
            buckets[index].add(pair);
        return oldValue;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
} /* Output:
{CAMEROON=Yaounde, CONGO=Brazzaville, CHAD=N'djamena, COTE D'IVOIR (IVORY COAST)=Yamoussoukro, CENTRAL AFRICAN REPUBLIC=Bangui, GUINEA=Conakry, BOTSWANA=Gaberone, BISSAU=Bissau, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, ERITREA=Asmara, THE GAMBIA=Banjul, KENYA=Nairobi, GABON=Libreville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, EQUATORIAL GUINEA=Malabo, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, GHANA=Accra, DJIBOUTI=Dijibouti, ETHIOPIA=Addis Ababa}
Asmara
[CAMEROON=Yaounde, CONGO=Brazzaville, CHAD=N'djamena, COTE D'IVOIR (IVORY COAST)=Yamoussoukro, CENTRAL AFRICAN REPUBLIC=Bangui, GUINEA=Conakry, BOTSWANA=Gaberone, BISSAU=Bissau, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, ERITREA=Asmara, THE GAMBIA=Banjul, KENYA=Nairobi, GABON=Libreville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, EQUATORIAL GUINEA=Malabo, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, GHANA=Accra, DJIBOUTI=Dijibouti, ETHIOPIA=Addis Ababa]
*///:~
