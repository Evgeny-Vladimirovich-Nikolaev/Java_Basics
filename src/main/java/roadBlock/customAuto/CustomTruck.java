public class CustomTruck  extends CustomAuto implements Crossable{
    private int speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    public CustomTruck(String licensePlate,
                     int speed,
                     double weight,
                     double width,
                     double height,
                     double length) {
        super(licensePlate);
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public boolean roadBlockCross() {
        return true;
    }

    @Override
    int getSpeed() {
        return speed;
    }

    @Override
    double getWeight() {
        return weight;
    }

    @Override
    double getWidth() {
        return width;
    }

    @Override
    double getHeight() {
        return height;
    }

    @Override
    double getLength() {
        return length;
    }
}
