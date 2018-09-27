package homeWork_10.StarsSystems;

 public class Moon {
    private String name = "Moon";

   public Moon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     Moon() {
    }

     @Override
     public String toString() {
         return "Moon{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }
