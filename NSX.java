package buoi5;
import java.util.Scanner;


public class NSX {
    private String MaNSX ;
    private String TenNSX;
    private String DcNSX;

    public NSX(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public NSX() {
      
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }
    
   public void nhap(){
       Scanner s = new Scanner(System.in);
       System.out.print("Nhap ma nsx : ");
         MaNSX = s.nextLine();
        System.out.print("Nhap ten nsx : "); 
         TenNSX = s.nextLine();
         System.out.print("Nhap dia chi nsx : ");
         DcNSX = s.nextLine();
         System.out.println("---------------------------");
   } 
   public void xuat(){
       System.out.println("Ma nha san xuat la: " + this.getMaNSX());
        System.out.println("Ten nha san xuat la: " + this.getTenNSX());
        System.out.println("Dia chi nha san xuat la: " + this.getDcNSX());
               
   }

    

   
}

