public class Logger {
    private Logger() {
        System.out.println("Logger Created");
    }

    private static Logger log;

    public static Logger glog() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

}