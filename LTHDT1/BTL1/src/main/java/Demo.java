
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
   Scanner scanner = new Scanner(System.in);
   String s,a,b;
        QuanLyNhaHang ql = new QuanLyNhaHang();
        QuanLyMenu m = new QuanLyMenu();
        QuanLyDichVu dv = new QuanLyDichVu();
            System.out.println("Quan ly nha hang tiec cuoi");
            System.out.println("1.Quan ly Sanh tiec cuoi");
            System.out.println("2.Quan ly Menu");
            System.out.println("3.Quan ly dich vu");
            System.out.println("4.Dat tiec");
            System.out.println("5.Sap xep sanh theo tan suat thue");
            System.out.println("Thoat");
            int line = scanner.nextInt();
            switch (line) {
                case 1: {
                    System.out.println("1.Quan ly sanh tiec cuoi");
                    System.out.println("6.Tim kiem sanh");
                    System.out.println("7.Xoa sanh");
                    System.out.println("8.Thoat");
                    int c = scanner.nextInt();
                   ql.nhapS(2);
                    ql.docFile();
                    System.out.println("Danh sach sanh tiec cuoi:  ");
                    ql.xuatDs();
                        switch (c) {
                            case 6: {
                                System.out.println("Sanh can tiem: ");
                                ql.timKiem("Hoa Huong Duong").forEach(h -> h.xuat());
                                break;
                            }
                            case 7: {
                             ql.xoa("Hoa Mai");
                             System.out.println("Danh sach sau khi xoa:");
                             ql.xuatDs();
                                break;
                            }
                            case 8: {
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                case 2: {
                    Menu mn1 = new ThucAn("co", "Chao rau cu", 50000);

                    Menu mn2 = new ThucUong("Pepsi", 6000, "Pepsico");
                    Menu mn3= new ThucAn("Khong","Lau thai",400000);
                    Menu mn4= new ThucUong("Dr.Thanh",13000,"Tan Hiep Phat");
                    m.themM(mn1);
                    m.themM(mn2);
                    m.themM(mn3);
                    m.themM(mn4);
                    m.nhapMN(1);
                    System.out.println("Danh sach Menu: ");
                    m.xuatMN();
                    System.out.println("2.Quan ly Menu");
                    System.out.println("9.Tim kiem thuc an");
                    System.out.println("10.Tim kiem thuc uong");
                    System.out.println("11.Xoa Menu");
                    System.out.println("12.Thoat");
                    int choise = scanner.nextInt();
                    switch (choise) {
                        case 9: {
                            if (true){
                                System.out.println("Thuc an can tim: ");
                            m.timKiemTA("Lau thai").forEach(h->h.xuatM());}
                            else
                               System.out.println("Khong tim thay!!!");
                            break;
                        }

                        case 10: {
                            System.out.println("Menu can tim: ");
                            m.timKiemTU("Cocacola").forEach(h->h.xuatM());
                            break;
                        }

                        case 11:
                            {
                               m.xoaTA("Lau thai");
                               m.xoaTU("Cocacola");
                                System.out.println("Danh sach menu sau khi xoa:");
                                m.xuatMN();
                                break;
                            }
                            case 12: {
                                return;
                            }
                        default:
                            break;
                    }
                    break;
                }
                case 3: {
                    DichVu dv1 = new ThueCaSi(600000, "Hoa Minzy", 5);
                    DichVu dv2 = new ThueCaSi(7000000, "Anh Tu", 7);
                    DichVu dv3 = new TrangTri(500000);
                    dv.themDV(dv1);
                    dv.themDV(dv2);
                    dv.themDV(dv3);
                    dv.nhapD(2);
                    System.out.println("Danh sach cac dich vu:");
                    dv.xuatD();
                    System.out.println("3.Quan ly dich vu");
                    System.out.println("12.Tim kiem dich vu thue ca si");
                    System.out.println("13.Tim kiem dich vu trang tri");
                    System.out.println("14.Xoa dich vu");
                    System.out.println("15.Thoat");
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 12: {
                            System.out.println("Nhap dich vu can tim:");
                            dv.timKiemCS("Hoa Minzy").forEach(h -> h.xuatDV());
                            break;
                        }
                        case 13: {
                            break;
                        }
                        case 14: {
                            dv.xoaCS("Hoa Minzy");
                            System.out.println("Danh sach ca si sau khi xoa: ");
                            dv.xuatD();
                            break;
                        }
                        case 15: {
                            return;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 4:{
                    System.out.println("4.Dat tiec");
                }
            }
        }
    }
