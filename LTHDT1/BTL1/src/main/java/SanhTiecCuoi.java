import java.util.Scanner;
public class SanhTiecCuoi {
    private static int dem=0;
    private  String maSanh;
    private String name;
    private String viTri;
    private int sucChua;
    private double giaThue;
Scanner s= new Scanner(System.in);

    {
        maSanh= String.format("B%03d", ++dem);
    }
public SanhTiecCuoi(){

}

public SanhTiecCuoi( String name , String vt, int sc, double gt){
    this.name= name;
    this.viTri=vt;
    this.sucChua= sc;
    this.giaThue=gt;
}
public void xuat(){
    System.out.println("Ma sanh: " + getMaSanh() +"  "+"Ten Sanh: "+getName()+"  "+"Vi Tri: "+ getViTri()+"  "+
            "Suc chua: "+ getSucChua()+"  "+"ban"+"  "+"Gia Thue: "+getGiaThue() +"VND");

}
public void nhap(){
    System.out.print("Nhap ten sanh: ");
    this.name=s.nextLine();
    System.out.print("Nhap vi tri:  ");
    this.viTri=s.nextLine();
    System.out.print("Nhap suc chua: ");
    this.sucChua=s.nextInt();
    System.out.print(" Nhap vao gia thue:  ");
    this.giaThue=s.nextDouble();
}


    public String getMaSanh() {
        return maSanh;
    }

    public void setMaSanh(String maSanh) {
        this.maSanh = maSanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }
}
