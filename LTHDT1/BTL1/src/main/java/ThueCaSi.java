

public class ThueCaSi extends DichVu{
    private String caSi;
    private int soLuong;

    public ThueCaSi(){

    }
    public ThueCaSi(double gdv,String cs,int sl){
        super(gdv);
        this.tenDV="Thue ca si";
        this.caSi=cs;
        this.soLuong=sl;
    }

    @Override
    public void nhapDV()  {
        System.out.print("Nhap ten ca si: ");
        this.caSi=d.nextLine();
        System.out.print("Nhap so luong bai hat: ");
        this.soLuong=d.nextInt();
        super.nhapDV();

    }

    @Override
    public void xuatDV() {
        this.tenDV="Thue ca si";
        super.xuatDV();
        System.out.println("Ten ca si: "+getCaSi()+" "+"So luong bai hat: "+getSoLuong());
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
