

package hw9;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class HW9{
    
    
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
       Thread thread1 = new Thread(new Runnable(){
           String arrayOne[] = {"A", "E", "I", "M", "Q", "U", "Y"};
        public void run(){
            synchronized (arrayOne){
                for(int i=0; i < arrayOne.length; i++){
                   
                    System.out.print(arrayOne[i]+" ");
                    arrayOne.notify();
                }
                try {  
                            arrayOne.wait();  
                } catch (InterruptedException e) {  
                        }  
            }
        }
    });
    Thread thread2 = new Thread(new Runnable(){
        String arrayTwo[] = {"B", "F", "J", "N", "R", "V", "Z"};
        public void run(){
           
            synchronized (arrayTwo){
                for(int i=0; i < arrayTwo.length; i++){
                    
                    System.out.print(arrayTwo[i]+" ");
                    arrayTwo.notify();
                }
                try {  
                            arrayTwo.wait();  
                } catch (InterruptedException e) {  
                        }  
            }
            
            
            
        }
    });
    Thread thread3 = new Thread(new Runnable(){
         String arrayThree[] = {"C", "G", "K", "O", "S", "W"};
        public void run(){
             
            synchronized (arrayThree){
                for(int i=0; i < arrayThree.length; i++){
                    
                    System.out.print(arrayThree[i]+" ");
                    arrayThree.notify();
                }
                try {  
                            arrayThree.wait();  
                } catch (InterruptedException e) {  
                        }  
            }
            
            
            
           
        }
    });
    Thread thread4 = new Thread(new Runnable(){
        String arrayFour[] = {"D", "H", "L", "P", "T","X"};
        public void run(){
           synchronized (arrayFour){
                for(int i=0; i < arrayFour.length; i++){
                   
                    System.out.print(arrayFour[i]+" ");
                    arrayFour.notify();
                }
                try {  
                            arrayFour.wait();  
                } catch (InterruptedException e) {  
                        }  
            }
            
            
             
        }
    });
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    
    }

    
}
