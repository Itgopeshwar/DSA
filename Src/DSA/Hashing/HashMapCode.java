package Src.DSA.Hashing;

public class HashMapCode {
    static class HasMap<K,V>{
        K key;
        V value;

        public Node(K key, V value){
            this.key=key;
            this.value=value;
        }
    }

    private int n; // n is numbered of nodes
    private int N; // length of buckets.length
    private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets = new LinkedList[4];
        for (int i = 0; i <4 ; i++) {
            this.buckets[i]=new LinkedList<>();
        }
    }


    private int hashFunction(k key){

    }
    public void put(K key,V value){
        int bi = hashFunction(key);
        searchInLL(key,bi); // data index
    }

    public boolean containsKey(K key){
        return false;
    }

    public V remove(K key){
        return null;
    }

    public V get(K key){
        return null;
    }

    public ArrayList<K> keySet(){
        return false;
    }
}
