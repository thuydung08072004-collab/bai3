package Class;
import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;
    public Sach(){
        
    }
    public Sach (String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang){
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soTrang=soTrang;
        this.tacGia=tacGia;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tNhap tac gia: ");
        tacGia=sc.nextLine();
        System.out.println ("\tNhap so trang: ");
        soTrang=sc.nextInt();
        sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tTac gia"+tacGia);
        System.out.println("\tSo trang"+soTrang);
    }
}
