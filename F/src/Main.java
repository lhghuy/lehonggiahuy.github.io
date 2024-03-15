import java.util.Scanner;

class HOCSINH {

    Scanner scanner = new Scanner(System.in);
    private String maSo;
    private String hoTen;
    private float DTB;

    public String getMaSo(){
        return maSo;
    }
    public String getHoTen(){
        return hoTen;
    }
    public float getDTB(){
        return DTB;
    }


    public void setMaSo(String ms){
        maSo = ms;
    }
    public void setHoTen(String name){
        hoTen = name;
    }
    public void setDTB(float diem){
        DTB = diem;
    }

    public void input(){

        maSo = scanner.nextLine();


        hoTen = scanner.nextLine();


        DTB = scanner.nextFloat();
    }

    public void rank(){
        if(DTB >=8.5 && DTB <= 10){
            System.out.println("Gioi");
        }
        else if(DTB >=7 && DTB < 8.5){
            System.out.println("Kha");
        }
        else if(DTB >=5 && DTB < 7){
            System.out.println("Trung Binh");
        }
        else{
            System.out.println("Yeu");
        }
    }
    public void output(){
        System.out.print(maSo +" - "+ hoTen+" - "+DTB +" - ");

    }
}

public class Main {
    public static void main(String[] args) {

        //Khai báo đối tượng hs từ lớp HOCSINH
        HOCSINH hs1 = new HOCSINH();
        HOCSINH hs2 = new HOCSINH();
        Scanner sc = new Scanner(System.in);
        //Gọi các phương thức từ đối tượng hs
        hs1.setMaSo(sc.nextLine());
        hs1.setHoTen(sc.nextLine());
        hs1.setDTB(Float.parseFloat(sc.nextLine()));

        hs2.setMaSo(sc.nextLine());
        hs2.setHoTen(sc.nextLine());
        hs2.setDTB(Float.parseFloat(sc.nextLine()));

        if(hs1.getDTB() > hs2.getDTB())
        {
            System.out.println(hs1.getMaSo());
        }
        else
        {
            System.out.println(hs2.getMaSo());
        }
    }
}