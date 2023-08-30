import java.util.Scanner;
public class student {
  private String Name;
 private String Lop;
 private Double Score;
 private faculty y = new faculty();

    public student(String Name, String Class, Double Score) {
        this.Name = Name;
        this.Lop = Class;
        this.Score = Score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLop() {
        return Lop;
    }

    public void setClass(String Class) {
        this.Lop = Class;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double Score) {
        this.Score = Score;
    }

    public faculty getY() {
        return y;
    }

    public void setY(faculty y) {
        this.y = y;
    }
    
    public student(){
        
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        y.nhap();
        System.out.print("Nhap ten hoc sinh: ");
        Name = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        this.Lop = sc.nextLine();
        System.out.print("Nhap diem: ");
        Score = sc.nextDouble();
         System.out.println("---------------------------");
    }
    public void xuat(){
        y.xuat();
        System.out.println("Ten hoc sinh la: " + this.Name);
        System.out.println("Hoc sinh lop: " + this.Lop);
        System.out.println("Diem: " + this.Score);

    }

   
 
          
}
