import java.util.Objects;

public class Square extends Rectangle implements Sizeable{
    private int side;
    private int sizeSide;

    @Override
    public void getSize(int side, int sizeSide) {
        this.side = side;
        System.out.println("Площадь квадрата" + Math.pow(side, 2));
    }

    public void perimeter(int side) {
        this.side = side;
        System.out.println("Периметр квадрата = " + (side * sizeSide));
    }

    public int getSide() {
        return side;
    }

    public int getSizeSide() {
        return sizeSide;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return side == square.side &&
                sizeSide == square.sizeSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, sizeSide);
    }
}