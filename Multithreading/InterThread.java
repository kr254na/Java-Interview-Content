package Multithreading;

class SharedResource {
    private int count;
    private boolean isAvailable;
    SharedResource(){
        count = 0;
        isAvailable = false;
    }
    public synchronized void consume() {
        try{
            while(!isAvailable){
                wait();
            }
            System.out.println("Consumer consumes "+count);
            isAvailable = false;
            notify();
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
    public synchronized void produce() {
      try{
          while (isAvailable){
              wait();
          }
          count++;
          System.out.println("Producer produces "+count);
          isAvailable = true;
          notify();
      }
      catch (InterruptedException exception){
          exception.printStackTrace();
      }
    }
}
class Producer extends Thread {
    private SharedResource resource;
    Producer(SharedResource resource){
        this.resource = resource;
    }
    public void run() {
        for(int i=0;i<100;i++){
            resource.produce();
        }
    }
}
class Consumer extends Thread {
    private SharedResource resource;
    Consumer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for(int i=0;i<100;i++){
            resource.consume();
        }
    }
}
public class InterThread {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }
}
