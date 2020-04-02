package homeWork_14_InternetMagaz;

public class TV<T> {
    private T manufacturer;
    private T price;
    private T diagonal;
    private T count;

    public TV(T manufacturer, T price, T diagona, T count) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.diagonal = diagonal;
    }

    public T getCount() {
        return count;
    }

    public void setCount(T count) {
        this.count = count;
    }

    public T getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(T manufacturer) {
        this.manufacturer = manufacturer;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public T getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(T diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", count=" + count +
                '}';
    }
}
