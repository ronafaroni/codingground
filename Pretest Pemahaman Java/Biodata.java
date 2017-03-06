public class Biodata{
    
    String nama,alamat;
    int umur;
    
    public void CetakBiodata(){
        
        System.out.println("Nama Saya         : "+nama);
        System.out.println("Nama Berasal dari : "+alamat);
        System.out.println("Nama Berumur      : "+umur);
    }
    
    public static void main(String []args){
        
        Biodata data = new Biodata();
        data.nama = "Kevin Ryoma";
        data.alamat = "Jepara Bate";
        data.umur = 20;
        
        data.CetakBiodata();
    }
}