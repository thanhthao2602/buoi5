import java.util.Scanner;
public class faculty {
    private String Name;
    private String Date;
   private school x = new school();

    public faculty(String Name, String Date) {
        this.Name = Name;
        this.Date = Date;
    }
   public faculty(){
       
   }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public school getX() {
        return x;
    }

    public void setX(school x) {
        this.x = x;
    }
   public void nhap(){
       Scanner sc = new Scanner(System.in);
         System.out.print("Nhap ten truong: ");
        x.setName(sc.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        x.setDate(sc.nextLine());
        x.getDate();
        System.out.print("Nhap ten khoa: ");
        Name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        Date = sc.nextLine();
        
   }
   public void xuat(){
       System.out.println("Ten truong la: " + this.x.getName());
        System.out.println("Ngay vao truong la: " + this.x.getDate());
        System.out.println("Ten khoa la: " + this.Name);
        System.out.println("Ngay vao khoa la: " + this.Date);

   }
}
