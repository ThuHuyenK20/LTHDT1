import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyDichVu {
    private List<DichVu> dv=new ArrayList<>();
    public void themDV(DichVu d) {
        this.getDv().add(d);
    }

    public void nhapD(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap dich vu: %d\n", (i + 1));
            DichVu tcs = new ThueCaSi();
            tcs.nhapDV();
            this.getDv().add(tcs);
            DichVu tt = new TrangTri();
            tt.nhapDV();
            this.getDv().add(tt);
            DichVu kr= new Karaoke();
            kr.nhapDV();
            this.getDv().add(kr);
        }

    }

    public void xuatD() {
        this.getDv().forEach(stc -> stc.xuatDV());
    }

    public List<DichVu> timKiemCS(String kw) {
        return this.getDv().stream().filter(h -> h.getTenDV().contains(kw) == true).collect(Collectors.toList());
    }
    public boolean xoaCS(String tenCS) {
        DichVu casi = this.dv.stream()
                .filter(h -> h.getTenDV().equals(tenCS))
                .findFirst().orElse(null);
        if (casi == null) {
            return false;
        }
        this.dv.remove(casi);
        return true;
    }
    public List<DichVu> getDv() {
        return dv;
    }

    public void setDv(List<DichVu> dv) {
        this.dv = dv;
    }


}
