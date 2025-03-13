public class Circle extends Form {
    private float radius;

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
