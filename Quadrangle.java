import java.util.Objects;

public class Quadrangle extends Figure{
    private int weight;
    private int height;

    @Override
    public int getSize() {
        return weight * height;
    }

    public int perimeter(int weight, int height) {
        return (2 * (weight + height));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrangle that = (Quadrangle) o;
        return weight == that.weight &&
                height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }
}
