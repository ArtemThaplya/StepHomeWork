package homeWork_19_ListProduct;

public class Product {
    private String tovar1;
    private String tovar2;
    private String tovar3;
    private String tovar4;
    private String tovar5;

    public Product(String tovar1, String tovar2, String tovar3, String tovar4, String tovar5) {
        this.tovar1 = tovar1;
        this.tovar2 = tovar2;
        this.tovar3 = tovar3;
        this.tovar4 = tovar4;
        this.tovar5 = tovar5;
    }

    public Product(String tovar1, String tovar2, String tovar3, String tovar4) {
        this.tovar1 = tovar1;
        this.tovar2 = tovar2;
        this.tovar3 = tovar3;
        this.tovar4 = tovar4;
    }

    public Product(String tovar1, String tovar2, String tovar3) {
        this.tovar1 = tovar1;
        this.tovar2 = tovar2;
        this.tovar3 = tovar3;
    }

    public Product(String  tovar1, String tovar2) {
        this.tovar1 = tovar1;
        this.tovar2 = tovar2;
    }

    public Product(String tovar1) {
        this.tovar1 = tovar1;
    }

    public String getTovar1() {
        return tovar1;
    }

    public void setTovar1(String tovar1) {
        this.tovar1 = tovar1;
    }

    public String getTovar2() {
        return tovar2;
    }

    public void setTovar2(String tovar2) {
        this.tovar2 = tovar2;
    }

    public String getTovar3() {
        return tovar3;
    }

    public void setTovar3(String tovar3) {
        this.tovar3 = tovar3;
    }

    public String getTovar4() {
        return tovar4;
    }

    public void setTovar4(String tovar4) {
        this.tovar4 = tovar4;
    }

    public String getTovar5() {
        return tovar5;
    }

    public void setTovar5(String tovar5) {
        this.tovar5 = tovar5;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tovar1='" + tovar1 + '\'' +
                ", tovar2='" + tovar2 + '\'' +
                ", tovar3='" + tovar3 + '\'' +
                ", tovar4='" + tovar4 + '\'' +
                ", tovar5='" + tovar5 + '\'' +
                '}';
    }
}
