public class Carpet {
    private String madeIn;
    private String material;
    private String color;
    private int warranty;

    public Carpet(String madeIn, String material, String color, int warranty) {
        this.madeIn = madeIn;
        this.material = material;
        this.color = color;
        this.warranty = warranty;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getWarranty() {
        return warranty;
    }

    public void getInfo(String madeIn, int warranty){
        System.out.println("The carpet is made in " + madeIn + " and has a warranty of " + warranty + " years.");
    }

}
