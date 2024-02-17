package Src.DSA.Hashing;

import java.util.LinkedList;

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


    private int hashFunction(K key){ // 0-N-1
        int bi=key.hashCode();
        return Math.abs(bi) %N;
    }

    private int searchInLL(K key ,int bi){
        LinkedList<Node> ll = buckets[bi];
        int di = 0;
        for(int i=0; i<ll.size();i++){
            if(ll.get(i).key == key){
                return i; // di
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node> oldBucket[]=buckets;
        buckets=new LinkedList[N*2];

        for (int i = 0; i <N*2 ; i++) {
            buckets[i] = new LinkedList<Node>();
        }

        for(int i=0;i<oldBucket.length;i++){
            LinkedList<Node> ll =oldBucket[i];
            for (int j = 0; j < ll.get(); j++) {
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }
    public void put(K key,V value){
        int bi = hashFunction(key);
        int di=searchInLL(key,bi); // data index

        if(di == -1){// key does not exist
            buckets[bi].add(new Node(key,value));
            n++;
        }else { // key exits
            Node node = buckets[bi].get(di);
            node.value=value;
        }

        double lambda = (double)n/N;
        if(lambda>2.0){
            rehash();

        }
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

    public static void main(String[] args) {
        // 42:32
    }
}
