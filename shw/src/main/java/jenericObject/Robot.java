package jenericObject;

public class Robot <T, E> {
    private E body;
    private T head;

    public Robot(E body, T head) {
        this.body = body;
        this.head = head;
    }

    public E getBody() {
        return body;
    }

    public void setBody(E body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}
