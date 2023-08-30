
package buoi5;

import java.util.Scanner;
public class Hang {
  private String MaHang;
private String TenHang;  
private NSX x ;

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
public Hang(){
        
    }
    public Hang(String MaHang, String TenHang, NSX x) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.x = x;
        x.nhap();
    }
    
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma hang : ");
        MaHang = s.nextLine();
        System.out.print("Nhap ten hang : ");
        TenHang = s.nextLine();
        
    }
    public void xuat(){
         System.out.println("Ma hang la: " + this.getMaHang());
        System.out.println("Ten hang la: " + this.getTenHang());
        
    }

 
    

}
