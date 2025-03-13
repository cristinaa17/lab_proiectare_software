public class Triangle extends Form {
    private float height;
    private float base;

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

}
