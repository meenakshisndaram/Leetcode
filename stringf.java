import org.w3c.dom.NodeList;

import  java.util.Scanner;
class Solution5  extends Thread{

    synchronized void display() throws InterruptedException{
        for(int i =0 ;i<5 ;i++){
            Thread.sleep(2000);
            this.show();
            System.out.println("display by :"+Thread.currentThread().getName());
        }

    }


    void show() throws InterruptedException{
        for(int i =0 ;i<5 ;i++){
            Thread.sleep(1000);
            System.out.println("show by :"+Thread.currentThread().getName());
        }

    }

    public  void run(){

        System.out.println(Thread.currentThread().getName()+"started.....");
        try {
            display();
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            show();
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

        Solution5 t = new Solution5();

        t.start();


    }

}
