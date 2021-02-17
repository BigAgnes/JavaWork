import java.util.Objects;

abstract public class Figure {
    private int weight;
    private int height;


    public abstract void getSize(int weight, int height);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return weight == figure.weight &&
                height == figure.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }
}
