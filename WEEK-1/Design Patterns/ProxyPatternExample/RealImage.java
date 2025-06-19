public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();  // expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk...");
    }

    public void display() {
        System.out.println("Displaying " + filename);
    }
    
}
