public class TrangTri extends DichVu {
    public TrangTri(){

    }
     public TrangTri(double gdv){
         super(gdv);
        this.tenDV="Trang Tri";
     }

    @Override
    public void nhapDV() {
        super.nhapDV();
    }

    @Override
    public void xuatDV() {
        super.xuatDV();
        this.tenDV="Trang Tri";
    }
}
