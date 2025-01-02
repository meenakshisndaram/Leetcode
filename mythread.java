public class mythread extends Thread{
    public void run(){
        for(int i =0 ; i<=10;i++){
            System.out.println("helow");
            try
            {
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}
class threaddemo{
    public static void main(String[] args) throws InterruptedException {
        mythread m  = new mythread();
        m.start();
        m.join(2000);
        for (int i =0;i<10;i++){
            System.out.println("main");
        }
    }
}
