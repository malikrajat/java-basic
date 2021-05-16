package generic;

public class Box<T> {
    private T typeData;

    public T getTypeData() {
        return typeData;
    }

    public void setTypeData(T typeData) {
        this.typeData = typeData;
    }

    @Override
    public String toString() {
        return "Box{" +
                "typeData=" + typeData +
                '}';
    }
}
