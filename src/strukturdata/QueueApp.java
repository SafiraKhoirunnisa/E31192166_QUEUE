/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata;

/**
 *
 * @author Safira
 */
//instance objek dari kelas Queue.
public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(3);//jumlah antrian yang ingin dimasukkan
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
    }
}
