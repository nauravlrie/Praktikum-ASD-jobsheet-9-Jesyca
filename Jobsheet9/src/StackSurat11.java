public class StackSurat11 {
    Surat11 [] stack;
    int top;
    int size;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }
    public boolean isFull () {
        return top == size -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat11 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public Surat11 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }
    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }
    public void cari (String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: ");
                System.out.println(stack[i].namaMahasiswa + " - " + stack[i].kelas);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
