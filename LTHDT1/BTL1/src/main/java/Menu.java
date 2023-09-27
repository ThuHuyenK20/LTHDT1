import java.util.Scanner;

public abstract class Menu {
    protected String ten;
    private static int stt=0;
    private int id=++stt;
    private String tenM;
    private double giaM;
    Scanner m=new Scanner(System.in) ;

public Menu(){

}

public Menu( String tenM, double gia){
    this.ten="Menu";
    this.tenM=tenM;
    this.giaM=gia;
}

public void xuatM(){
    System.out.println(this.ten);
    System.out.print("Ma mon: "+getId()+" "+"Ten mon: "+getTenM()+" "+"Gia tien: "+getGiaM()+"VND");
}

public void nhapM(){
    System.out.print("Nhap ten mon:  ");
    this.tenM=m.nextLine();
    System.out.print("Nhap gia tien: ");
    this.giaM=m.nextDouble();
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenM() {
        return tenM;
    }

    public void setTenM(String tenM) {
        this.tenM = tenM;
    }

    public double getGiaM() {
        return giaM;
    }

    public void setGiaM(double giaM) {
        this.giaM = giaM;
    }
}

