class Array{
    private int data[];
    private int foot;
    public Array(int len){
        if(len>0){
            this.data = new int[len];
        }else{
            this.data = new int[1];
        }
    }
    public boolean add(int num){
        if(this.foot < this.data.length){
            this.data[this.foot++] = num;
            return true;
        }
        return false;
    }

    public int[] getData() {
        return this.data;
    }
}

class SortArray extends Array{
    public SortArray(int len){
        super(len);
    }
    public int[] getData(){
        java.util.Arrays.sort(super.getData());
        return super.getData();
    }
}

class ReverseArray extends Array{
    public ReverseArray(int len){
        super(len);
    }
    public int[] getData(){
        int center = super.getData().length/2;
        int head = 0;
        int tail = super.getData().length-1;
        for (int i = 0; i < center; i++) {
            int temp = super.getData()[head];
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] = temp;
            head++;
            tail--;
        }
        return super.getData();
    }
}

public class Demo1 {
    public static void main(String[] args) {
        ReverseArray arr = new ReverseArray(3);
        System.out.print(arr.add(50)+",");
        System.out.print(arr.add(20)+",");
        System.out.print(arr.add(30)+",");
        System.out.println(arr.add(40));
        int temp[] = arr.getData();
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+",");
        }
    }
}
