import java.util.Scanner;

public class ThucUong extends Menu {
    private String hangSX;
    Scanner d= new Scanner(System.in);

    public ThucUong(){

    }
    public ThucUong(String tenM, double gia,String hsx){
        super(tenM,gia);
        this.hangSX=hsx;
    }
    @Override
    public void xuatM() {
        this.ten="Thuc Uong";
        super.xuatM();
        System.out.println("Hang san xuat: "+getHangSX());
    }

    @Override
    public void nhapM() {
        System.out.print("Hang san xuat: ");
        this.hangSX=m.nextLine();
        super.nhapM();
    }
    public ThucUong(String hsx){
        this.hangSX=hsx;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }
}
