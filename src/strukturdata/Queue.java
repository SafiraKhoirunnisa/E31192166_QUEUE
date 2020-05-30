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
public class Queue {
 int data[];
    int head = 0;
    int tail = -1;

    public Queue(int size) {
        data = new int[size];
    }

    public boolean isEmpty(){ //Memeriksa apakah queue kosong
        if(tail==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){ //Memeriksa apakah queue penuh
        if(tail==data.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(int dataBaru){ //Memasukkan data ke dalam queue
        if(isEmpty()){ //Memeriksa apakah queue kosong
            tail = head;
            data[tail] = dataBaru;
        }else if(!isFull()){ //Memeriksa apakah queue penuh
            tail++;
            data[tail] = dataBaru;
        }else if(isFull()){
            System.out.println("antrian sudah penuh");
        }
    }

    public int Dequeue(){ //Mengeluarkan data terdepan dari queue
        int temp = data[head];
        for(int i=head;i<=tail-1;i++){
            data[i] = data[i+1];
        }
        tail--;
        return temp;
    }
    
    public void tampilkan(){
        if(!isEmpty()){ //Memeriksa apakah queue kosong
            int index = head;
            while(index <= tail){
                System.out.print("|"+data[index]+"| ");
                index++;
            }
            System.out.println();
        }else{
            System.out.println("Kosong");
        }
    }   
}
