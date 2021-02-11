public class Room {
    private Wardrobe wardrobe;
    private Bed bed;
    private Carpet carpet;

    public Room(Wardrobe wardrobe, Bed bed, Carpet carpet) {
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.carpet = carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void makeBed() {
        System.out.println("Room => Making bed");
        bed.make();
    }


}
