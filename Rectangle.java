import java.util.Objects;

public class Rectangle extends Quadrangle{
    private int weight;
    private int height;

    @Override
    public void getSize(int weight, int height) {
        this.weight = weight;
        this.height = height;
        System.out.println("Площадь прямоугольника = " + (weight * height));
    }

    public void perimeter(int weight, int height) {
        this.weight = weight;
        this.height = height;
        System.out.println("Периметр прямоугольника = " + 2 * (weight + height));
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return weight == rectangle.weight &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, height);
    }
}
