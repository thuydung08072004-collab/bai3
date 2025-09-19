package Class;
import java.util.Scanner;
public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;
   public TapChi(){
       
   }
   public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh,int soPhatHanh, int thanhPhatHanh){
       super(maTaiLieu, tenNXB, soBanPhatHanh);
       this.soPhatHanh=soPhatHanh;
       this.thangPhatHanh=thangPhatHanh;
   }
   public void nhapThongTin(Scanner sc){
       super.nhapThongTin(sc);
       System.out.println("\t Nhap so phat hanh ");
       soPhatHanh=sc.nextInt();
       System.out.println("\t Nhap thang phat hanh ");
       thangPhatHanh=sc.nextInt();
       sc.nextLine();
   }
   public void hienThiThongTin(){
       super.hienThiThongTin();
       System.out.println("\tSo Phat Hanh"+soPhatHanh);
       System.out.println("\tThang Phat Hanh"+thangPhatHanh);
   }
}

