package homeWork_10.StarsSystems;

public class Planet<T, I> {
    private T name;
    private I distance;

    public Planet(T name, I distance) {
        this.name = name;
        this.distance = distance;
    }

    Planet() {
    }

    public T getName() {
        return name;
    }

    public I getDistance() {
        return distance;
    }

//    public void setName(T name) {
//        this.name = name;
//    }                                                // второй    способ
//
//    public void setDistance(I distance) {
//        this.distance = distance;
//    }

    @Override
    public String toString() {
        return "Planet{" +
                "name=" + name +
                ", distance=" + distance +
                '}';
    }
}
