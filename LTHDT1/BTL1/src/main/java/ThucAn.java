public class ThucAn extends Menu{
    private String anChay;

    public ThucAn(){

    }
    public ThucAn(String ac,String tenM, double gia){
       super(tenM,gia);
        this.anChay=ac;
    }

    @Override
    public void xuatM() {
        this.ten="Thuc An";
        super.xuatM();
        System.out.println("Co an chay duoc khong: "+getAnChay());
    }

    @Override
    public void nhapM() {
        System.out.print("Co an chay khong: ");
        this.anChay=m.nextLine();
        super.nhapM();
    }

    public String getAnChay() {
        return anChay;
    }

    public void setAnChay(String anChay) {
        this.anChay = anChay;
    }
}
