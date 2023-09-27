import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyNhaHang {
    private List<SanhTiecCuoi> ds = new ArrayList<>();

    public void themS(SanhTiecCuoi stc) {
        this.ds.add(stc);
    }

    public void nhapS(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap sanh: %d\n", (i + 1));
            SanhTiecCuoi stc = new SanhTiecCuoi();
            stc.nhap();
            this.ds.add(stc);

        }

    }

    public void xuatDs() {
        this.getDs().forEach(stc -> stc.xuat());
    }

    public void docFile() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/input.txt");
        try (Scanner s = new Scanner(f)) {
            while (s.hasNext()) {
                SanhTiecCuoi h = new SanhTiecCuoi();
                h.setName(s.nextLine());
                h.setViTri(s.nextLine());
                h.setSucChua(Integer.parseInt(s.nextLine()));
                h.setGiaThue(Double.parseDouble(s.nextLine()));

                this.ds.add(h);
            }
        }
    }


    public List<SanhTiecCuoi> timKiem(String kw) {
        return this.ds.stream().filter(h -> h.getName().contains(kw) == true).collect(Collectors.toList());
    }
    public boolean xoa(String name) {
        SanhTiecCuoi sanh= this.ds.stream()
                .filter(h -> h.getName().equals(name))
                .findFirst().orElse(null);
        if (sanh == null) {
            return false;
        }
        this.ds.remove(sanh);
        return true;
    }
    public List<SanhTiecCuoi> getDs() {
        return ds;
    }

    public void setDs(List<SanhTiecCuoi> ds) {
        this.ds = ds;
    }
}



   
