
package buoi5bai3;
import java.util.Scanner;
public class May {
  private   String MaMay ;
  private  String TenMay;
  private  String TinhTrang;

    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    public May(){
        
    }
    public void NHap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma may : ");
        MaMay = s.nextLine();
        System.out.println("Nhap ten may : ");
        TenMay = s.nextLine();
        System.out.println("Nhap tinh trang may : ");
        TinhTrang = s.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma may la : "+this.MaMay);
        System.out.println("Ten may la : "+this.TenMay);
        System.out.println("Tinh trang may : "+this.TinhTrang);
    }
  
    
}
