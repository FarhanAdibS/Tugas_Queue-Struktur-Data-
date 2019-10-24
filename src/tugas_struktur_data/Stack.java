package tugas_struktur_data;
        //TUMPUKAN BAJU


public class Stack {
    static int[] stack;
    static int banyak_tumpukan;
    static int top;
    
    static void inisialisasi(int i)
    {
        banyak_tumpukan=i;
        stack=new int[banyak_tumpukan];
        top=0;
    }
    
    static boolean kosong()
    {
        return top<=0;
    }
    
    static boolean penuh()
    {
        return top>=banyak_tumpukan;
    }
    
    static void push(int i)
    {
        if(penuh())
            System.out.println("maaf, tumpukan baju anda penuh");
        else
        {
            System.out.println("Baju "+i+" masuk ke tumpukan");
            stack[top++]=i;
        }
    }
    
    static void pop()
    {
        if(kosong())
            System.out.println("maaf, tumpukan baju anda kosong");
        else
        {
            top--;
            System.out.println("Baju "+stack[top]+" keluar dari tumpukan");            
        }
    }
}
