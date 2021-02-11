public class Bed {
    private String material;
    private String type;
    private String color;

    public Bed(String material, String type, String color) {
        this.material = material;
        this.type = type;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getArea(double width, double length){
        return width*length;
    }

    public void make() {
        System.out.println(" Bed => Making ");
    }


}
