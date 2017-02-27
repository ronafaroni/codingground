public class Tugas6{
    
    public void kelulusan(int nilai){
        if(nilai < 60){
            System.out.println("Selamat Anda tidak lulus");
        }else if(nilai > 60){
            System.out.println("Selamat Anda lulus");
        }
    }

     public static void main(String []args){
        Tugas6 tgs = new Tugas6();
        tgs.kelulusan(50);
     } 
}