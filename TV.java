public class TV {
    private int size;
    public TV(int size) {this.size=size;}
    protected int getSize(){return size;}
    public static void main(String[] args){
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
//1번
 class ColorTV extends TV {
    int color;
    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public void printProperty() {
        System.out.printf(getSize()+"인치 %d 컬러", color);
    }
 }

 class IPTV extends ColorTV {
    String ip;
    public IPTV(String ip, int size, int color){
        super(size, color);
        this.ip=ip;
    }
     public void printProperty() {
         System.out.printf("\n나의 IPTV는 %s 주소의 "+getSize()+"인치 %d 컬러", ip, color);
     }
 }