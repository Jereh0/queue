/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        QueueClass QUEUE = new QueueClass(5);
        
        QUEUE.insertData(5);
        QUEUE.insertData(10);
        QUEUE.insertData(9);
        QUEUE.insertData(6);
        
        QUEUE.queueLoop();
        System.out.println(QUEUE.peekFront());
        System.out.println(QUEUE.peekRear());
        
    }
    
}
