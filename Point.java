import java.util.Objects;

public class Point extends Figure{
    private int coordinatesX;
    private int coordinatesY;

    @Override
    public int getSize() {
        return coordinatesX;
    }

    public String getSizeCoordinates(){
        int x = getCoordinatesX();
        int y = getCoordinatesY();
        String coord = "(" + x + "," + y + ")";
        return coord;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Point point = (Point) o;
        return coordinatesX == point.coordinatesX &&
                coordinatesY == point.coordinatesY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coordinatesX, coordinatesY);
    }
}


