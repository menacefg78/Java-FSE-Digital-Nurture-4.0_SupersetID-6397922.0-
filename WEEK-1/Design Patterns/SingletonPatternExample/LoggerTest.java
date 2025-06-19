public class LoggerTest {
    public static void main(String[] args) {
        Logger log1= Logger.glog();
        System.out.println(log1.hashCode());
        Logger log2= Logger.glog();
        System.out.println(log2.hashCode());

    }
    
}
