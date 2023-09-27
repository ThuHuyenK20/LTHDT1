
import java.text.ParseException;
import java.util.Scanner;

public abstract class DichVu {
    private int vt=0;
    private int maDV=++vt;

    protected String tenDV;

    private double giaDV;
    Scanner d= new Scanner(System.in);
    public DichVu(){

    }

public DichVu(double gdv){
        this.tenDV="Dich Vu";
        this.giaDV=gdv;
}
    public void xuatDV(){
        System.out.println(this.tenDV);
        System.out.println("Ma dich vu: "+getMaDV()+" "+"Gia tien: "+getGiaDV()+"VND");
    }

    public void nhapDV() {

        System.out.print("Nhap gia tien: ");
        this.giaDV=d.nextDouble();
    }
    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(double giaDV) {
        this.giaDV = giaDV;
    }
}
