import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyMenu {
    private List<Menu> mn= new ArrayList<>();
    public void themM(Menu m) {
        this.getMn().add(m);
    }

    public void nhapMN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap Menu: %d\n", (i + 1));
            Menu m = new ThucAn();
            m.nhapM();
            mn.add(m);
            Menu tu = new ThucUong();
            tu.nhapM();
            mn.add(tu);


        }

    }

    public void xuatMN() {
        this.getMn().forEach(m -> m.xuatM());
    }
    public List<Menu> timKiemTA(String kw) {
        return this.mn.stream().filter(h -> h.getTenM().contains(kw) == true).collect(Collectors.toList());
    }
    public List<Menu> timKiemTU(String kw) {
        return this.mn.stream().filter(h -> h.getTenM().contains(kw) == true).collect(Collectors.toList());
    }
    public boolean xoaTA(String tenM) {
        Menu menu = this.mn.stream()
                .filter(h -> h.getTenM().equals(tenM))
                .findFirst().orElse(null);
        if (menu == null) {
            return false;
        }
        this.mn.remove(menu);
        return true;
    }
    public boolean xoaTU(String tenM) {
        Menu menu = this.mn.stream()
                .filter(h -> h.getTenM().equals(tenM))
                .findFirst().orElse(null);
        if (menu == null) {
            return false;
        }
        this.mn.remove(menu);
        return true;
    }

    public List<Menu> getMn() {
        return mn;
    }

    public void setMn(List<Menu> mn) {
        this.mn = mn;
    }
}
