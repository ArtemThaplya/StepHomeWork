package homeWork_8;

class AbonentBase<T> {
    private T name;
    private T nomer;
    private T id;
    private T balans;
    private T status;

    AbonentBase(T name, T nomer, T id, T balans, T status) {
        this.name = name;
        this.nomer = nomer;
        this.id = id;
        this.balans = balans;
        this.status = status;
    }

    public AbonentBase() {
    }

    public AbonentBase(T status) {
        this.status = status;
    }

    public T getName() {
        return name;
    }

    public T getNomer() {
        return nomer;
    }

    public T getId() {
        return id;
    }

    public T getBalans() {
        return balans;
    }

    public T getStatus() {
        return status;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setNomer(T nomer) {
        this.nomer = nomer;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setBalans(T balans) {
        this.balans = balans;
    }

    public void setStatus(T status) {
        this.status = status;
    }
}
