package Test;
import java.util.Scanner;
import Class.QuanLySach;
   public class Testing{
       public static void main(String[] srgs){
           Scanner sc=new Scanner(System.in);
           QuanLySach qls=new QuanLySach();
           qls.nhapDanhSachTL(sc);
           System.out.println("\n\nNhap vao loai tai lieu can tin: ");
           String loai = sc.nextLine();
           qls.timLoaiTL(loai);
           System.out.println("\n\nNhap vao loai ma lieu can tin: ");
           String maTL = sc.nextLine();
           qls.timMaTL(maTL);
           sc.close();           
       }
   }

