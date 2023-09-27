import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Karaoke extends DichVu{
    private Date thoiGian;
    private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    public Karaoke(){

    }
    public Karaoke(double gdv,Date tg){
        super(gdv);
        this.tenDV="Karaoke";
        this.thoiGian=tg;
    }
  // public Karaoke(int maDV,double gdv,String tg) throws ParseException {
   //     this(maDV,gdv,F.parse(tg));
    // }


  // @Override
    //public void nhapDV() throws ParseException {
      //  super.nhapDV();
       //System.out.print("Thoi gian: ");
         // this.thoiGian= F.parse(d.nextLine());
  // }

    @Override
    public void xuatDV() {
        this.tenDV="Karaoke";
        super.xuatDV();
       // System.out.println(" Thoi Gian: "+ getF().format(this.getThoiGian()));
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

}
