package Class;
import java.util.Scanner;
import java.util.ArrayList;
public class QuanLySach {
    private ArrayList<TaiLieu> dstl;
    public QuanLySach(){
        dstl=new ArrayList<TaiLieu>(10);
    }
    public void themTaiLieu(TaiLieu t1){
        dstl.add(t1);
    }
    public void nhapDanhSachTL(Scanner sc){
        int chon;
        String stop;
        TaiLieu t1;
        do{
            System.out.println("\tChon loai tai lieu (1-Sach, 2-TapChi, 3-Bao): ");
            chon=sc.nextInt();
            sc.nextLine();
            
            switch (chon) {
                case 1:
                    t1=new Sach();
                    break;
                case 2:
                    t1=new TapChi();
                    break;
                case 3:
                    t1=new Bao();
                    break;   
                 
                default:
                    t1=new Sach();
                    break;
            }
            t1.nhapThongTin(sc);
            themTaiLieu(t1);
            System.out.println("\tBan co muon nhap vao nua khong(co/khong): ");
            stop=sc.nextLine();
        } while(stop.equals("co"));
    }
    public void timMaTL(String maTL){
        for (TaiLieu t1 :dstl){
            if (maTL.equals(t1.getMaTaiLieu())){
                t1.hienThiThongTin();
            }
        }
    }
    public void timLoaiTL (String loai){
        for (TaiLieu t1 : dstl){
            if (loai.equals("Sach")&&(t1 instanceof Sach)){
                t1.hienThiThongTin();
            }
            else if (loai.equals("Bao")&&(t1 instanceof Bao)){
                t1.hienThiThongTin();
            }
            else if (loai.equals("TapChi")&&(t1 instanceof TapChi)){
                t1.hienThiThongTin();
            }
        }
    }      
}
