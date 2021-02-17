import java.util.Objects;

public class Triangle extends Figure{
    private int ab;
    private int bc;
    private int ac;

    @Override
    public void getSize(int ab, int bc) {
        this.ab = ab;
        this.bc = bc;
        int p = (ab + bc + ac) / 2;
        int S = (int) Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
        System.out.println("Площадь треугольника = " + S);
    }

    public void perimeter(int ab, int bc) {
        this.ab = ab;
        this.bc = bc;
        System.out.println("Периметр треугольника = " + (ab + bc + ac));
    }

    public int getAb() {
        return ab;
    }

    public int getBc() {
        return bc;
    }

    public int getAc() {
        return ac;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return ab == triangle.ab &&
                bc == triangle.bc &&
                ac == triangle.ac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ab, bc, ac);
    }
}