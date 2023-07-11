package chapter03;

public class OpenHash<K, V> {

    enum Status { OCCUPIED, EMPTY, DELETED};

    static class Bucket<K, V> {
        private K key;
        private V data;
        private Status stat;

        Bucket() {
            stat = Status.OCCUPIED;
        }

        void set(K key, V data, Statues stat) {
            this.key = key;
            this.data = data;
            this.stat = stat;
        }

        void setStat(Status stat) {
            this.stat = stat;
        }

        K getKey() {
            return key;
        }

        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;
    private Bucket<K, V>[] table;

    
}
