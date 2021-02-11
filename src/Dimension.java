public class Dimension {
    private int height;
    private int width;
    private int depth;

    public Dimension(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public long getVolume(int height, int width, int depth){
        return height*width*depth;
    }
}
