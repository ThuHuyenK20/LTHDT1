import java.util.Scanner;

public class GiaThue {
    private GiaThue sangBT;
    private GiaThue chieuBT;
    private GiaThue toiBT;
    private GiaThue sangCT;
    private GiaThue chieuCT;
    private GiaThue toiCT;
    private Scanner g= new Scanner(System.in);

    public GiaThue(GiaThue sbt, GiaThue cbt, GiaThue tbt, GiaThue sct, GiaThue cct,GiaThue tct){
        this.sangBT=sbt;
        this.chieuBT=cbt;
        this.toiBT=tbt;
        this.sangCT=sct;
        this.chieuCT=cct;
        this.toiCT=tct;
    }



    public GiaThue getSangBT() {
        return sangBT;
    }

    public void setSangBT(GiaThue sangBT) {
        this.sangBT = sangBT;
    }

    public GiaThue getChieuBT() {
        return chieuBT;
    }

    public void setChieuBT(GiaThue chieuBT) {
        this.chieuBT = chieuBT;
    }

    public GiaThue getToiBT() {
        return toiBT;
    }

    public void setToiBT(GiaThue toiBT) {
        this.toiBT = toiBT;
    }

    public GiaThue getSangCT() {
        return sangCT;
    }

    public void setSangCT(GiaThue sangCT) {
        this.sangCT = sangCT;
    }

    public GiaThue getChieuCT() {
        return chieuCT;
    }

    public void setChieuCT(GiaThue chieuCT) {
        this.chieuCT = chieuCT;
    }

    public GiaThue getToiCT() {
        return toiCT;
    }

    public void setToiCT(GiaThue toiCT) {
        this.toiCT = toiCT;
    }

    public Scanner getG() {
        return g;
    }

    public void setG(Scanner g) {
        this.g = g;
    }
}
