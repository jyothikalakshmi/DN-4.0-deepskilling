class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Instance created");
    }
    public static Logger getInstance(){
        if(instance==null){
              instance=new Logger();
        }
        return instance;
    }
    public void show(){
        System.out.println("Hello from Logger");
    }
}
public class Singleton{
    public static void main(String args[]){
        Logger obj=Logger.getInstance();
        Logger obj2=Logger.getInstance();;
        obj.show();
        obj2.show();
        if(obj==obj2){
            System.out.println("same logger instance is used");
        }
        else{
            System.out.println("different logger instances are used");;
        }
    }
}
