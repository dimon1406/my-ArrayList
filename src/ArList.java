import java.util.Arrays;

public class ArList<T> {
    private Object[] data = new Object[10];
    private int size;

    public void add(T value){
        if (size == data.length){
            data = Arrays.copyOf(data, data.length + data.length/2 +1);
            data[size] = value;
            size++;
        }else{
            data[size]= value;
            size++;
        }
    }

    public void add(T value, int index){
        if(index < 0 || index >=size){
            throw new IndexOutOfBoundsException("Индекс превышает границу");
        }
        if (size<data.length){
            System.arraycopy(data,index, data, index+1,size-index);
            data[index] = value;
            size++;
        } else{
            data = Arrays.copyOf(data,data.length + data.length/2+1);
            System.arraycopy(data,index, data, index+1,size-index);
            data[index] = value;
            size++;
        }
    }

    public T get(int index){
        if(index < 0 || index >=size) throw new IndexOutOfBoundsException("Индекс превышает границу");

        return (T) data[index];
    }

    public void remove(int index){
        if(index < 0 || index >=size) throw new IndexOutOfBoundsException("Индекс превышает границу");

        data[index] = null;
        System.arraycopy(data,index+1,data,index, size-index+1);
        size--;
    }

    public int size(){
        return this.size;
    }

    public Object[] toArray(){
        return Arrays.copyOf(data,size);
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(data,size));
    }
}
