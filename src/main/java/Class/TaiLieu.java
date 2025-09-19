package Class;
import java.util.Scanner;
public class TaiLieu {
    private String maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;
    public TaiLieu(){
        
    }
    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh){
        this.maTaiLieu=maTaiLieu;
        this.soBanPhatHanh=soBanPhatHanh;
        this.tenNXB=tenNXB;
    }
    public void nhapThongTin (Scanner sc){
        System.out.println("\tNhap ma tai lieu: ");
        maTaiLieu =sc.nextLine();
        System.out.println("\tNhap ten Nha xuat ban: ");
        tenNXB =sc.nextLine();
        System.out.println("\tNhap So Ban Phat Hanh: ");
        soBanPhatHanh =sc.nextInt();
        sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("\tMa tai lieu: "+maTaiLieu);
        System.out.println("\tTen nha xuat ban: "+tenNXB);
        System.out.println("\tSo Ban Phat Hanh: "+soBanPhatHanh);
    }
    public String getMaTaiLieu(){
        return maTaiLieu;
    }
}
