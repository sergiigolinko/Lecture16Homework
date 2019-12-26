public class GenClassThreeParameters<T,K,V> {
    private T object;
    private K key;
    private V value;

    public GenClassThreeParameters(T object,K key,V value){
        this.object=object;
        this.key=key;
        this.value=value;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getObject() {
        return object;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenClassThreeParameters<?, ?, ?> that = (GenClassThreeParameters<?, ?, ?>) o;

        if (object != null ? !object.equals(that.object) : that.object != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = object != null ? object.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GenClassThreeParameters{" +
                "object=" + object +
                ", key=" + key +
                ", value=" + value +
                '}';
    }
}
