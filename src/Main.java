public class Main {
    public static void main(String[] args) {
        Wardrobe myWard = new Wardrobe(4, 5, new Dimension(2022, 3500, 600));
        Bed myBed = new Bed("wood", "double", "Brown" );
        Carpet myCarpet = new Carpet("Pakistan", "wool", "grey", 5 );
        Room myRoom = new Room(myWard, myBed, myCarpet);

        System.out.println(myRoom.getBed().getArea(23, 12));
        System.out.println(myRoom.getWardrobe().getDimension().getVolume(22, 35, 6));
        myRoom.getCarpet().getInfo( "India", 4);
        myRoom.makeBed();


    }
}
