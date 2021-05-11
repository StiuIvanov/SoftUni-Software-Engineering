package ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        validate(length, "Length");
        this.length = length;

    }

    private void setWidth(double width) {
        validate(width, "Width");
        this.width = width;
    }


    private void setHeight(double height) {
        validate(height, "Height");
        this.height = height;

    }


    public double calculateSurfaceArea() {
        return 2 * (width * height) + 2 * (width * length) + 2 * (length * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume() {
        return length * height * width;

    }


    private boolean isNotValid(double side) {
        return side <= 0;
    }

    private void validate(double length, String side ) {
        if (length <= 0) {
            throw new IllegalStateException(String.format("%s cannot be zero or negative.",side));
        }
    }
}
