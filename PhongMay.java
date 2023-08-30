
package buoi5bai3;

import java.util.Scanner;
public class PhongMay {
   private String MaPhong;
   private String TenPhong;
   private Double DienTich;
   private QuanLy x;
   private May[] y;
   private int n ;
   public PhongMay(){
       
   }

    public PhongMay(String MaPhong, String TenPhong, Double DienTich, QuanLy x, May[] y, int n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public Double getDienTich() {
        return DienTich;
    }

    public void setDienTich(Double DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

   

    
   public void Nhap(){
       Scanner s = new Scanner(System.in);
       System.out.printf("Nhap ma phong : ");
       MaPhong = s.nextLine();
       System.out.printf("Nhap ten phong : ");
       TenPhong = s.nextLine();
       System.out.printf("Nhap dien tich : ");
       DienTich = s.nextDouble();
       x = new QuanLy();
       x.Nhap();
       System.out.printf("Nhap so may tinh : ");
       n=s.nextInt();
       y = new May[n];
       for(int i=0 ; i<n ; i++){
           y[i]= new May();
           y[i].NHap();
       }
   }
   public void Xuat(){
       System.out.println("Ma phong : "+MaPhong);
       System.out.println("Ten Phong: " + TenPhong);
        System.out.println("Dien tich: " + DienTich);
        x.Xuat();
        System.out.println("So luong may tinh : "+n);
        for(int i=0 ; i<n ; i++){
            System.out.println("May " + (i + 1));
            y[i].Xuat();
        }
   }

  
}
