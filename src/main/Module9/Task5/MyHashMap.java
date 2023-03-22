package Task5;

public class MyHashMap <K, V> {
    private Node<K, V>[] table;
    private int size;

    private static class Node <K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public MyHashMap(int size) {
        table = new Node[size];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = hash % table.length;
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node<K, V> newNode = new Node<K, V> (key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }
    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % table.length;
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    public void remove(K key) {
        int hash = key.hashCode();
        int index = hash % table.length;
        Node<K, V> node = table[index];
        Node<K, V> prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    table[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
    public void clear() {
        Node<K, V>[] newTable = new Node[table.length];
        table = newTable;
        size = 0;
    }
    public int size() {
        return size;
    }
}
