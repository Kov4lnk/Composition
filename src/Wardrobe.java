public class Wardrobe {
    private int dressSlots;
    private int shelfSlots;
    private Dimension dimension;

    public Wardrobe(int dressSlots, int shelfSlots, Dimension dimension) {
        this.dressSlots = dressSlots;
        this.shelfSlots = shelfSlots;
        this.dimension = dimension;
    }

    public int getDressSlots() {
        return dressSlots;
    }

    public int getShelfSlots() {
        return shelfSlots;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
