
package buoi5bai3;

import java.util.Scanner;
public class QuanLy {
   private String MaQL;
   private String Hoten;

    public QuanLy(String MaQL, String Hoten) {
        this.MaQL = MaQL;
        this.Hoten = Hoten;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }
    public QuanLy(){
        
    }
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap ma QL : ");
        MaQL = s.nextLine();
        System.out.printf("Nhap ho ten : ");
        Hoten = s.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma QL la : "+MaQL);
        System.out.println("Ho ten la : "+Hoten);
    }
   
}
