package tugas_struktur_data;
        //ANTRIAN PEMBELIAN TIKET BIOSKOP

public class Queue {
    
    static int[] queue;
    static int panjang_antrian;
    static int tail;
    
    static void inisialisasi(int i)
    {
        panjang_antrian=i;
        queue=new int[panjang_antrian];
        tail=0;
    }
    
    static boolean kosong()
    {
        return tail<=0;
    }
    
    static boolean penuh()
    {
        return tail>=panjang_antrian;
    }
    
    static void enqueue(int i)
    {
        if(penuh())
            System.out.println("maaf antrian sudah penuh");
        else
        {
            System.out.println("pengunjung "+i+" masuk antrian");
            queue[tail++]=i;
        }
    }
    
    static void dequeue()
    {
        if(kosong())
            System.out.println("maaf, antrian kosong");
        else
        {
            int pop=queue[0];
            int i=1;
            System.out.println("Pengunjung "+pop+" sudah keluar antrian");
            while(i<tail)
            {
                queue[i-1]=queue[i];
                i++;
            }
            tail--;
        }
    }
}
