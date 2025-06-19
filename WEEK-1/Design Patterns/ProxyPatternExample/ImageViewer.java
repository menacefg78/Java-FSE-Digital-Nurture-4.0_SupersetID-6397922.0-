public class ImageViewer {
     public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");

        
        System.out.println("First call:");
        image1.display(); 

        System.out.println("Second call:");
        image1.display(); 
    }
}
