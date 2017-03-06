public class Tugas7{
    
    public void Angka(int angka){
        
        switch(angka){
            case 1 : 
                System.out.println("I");
                break;
                
            case 2 : 
                System.out.println("II");
                break;
                
            case 3 : 
                System.out.println("III");
                break;
                
            case 4 : 
                System.out.println("IV");
                break;
                
            case 5 : 
                System.out.println("V");
                break;
                
            case 6 : 
                System.out.println("VI");
                break;
                
            case 7 : 
                System.out.println("VII");
                break;
                
            case 8 : 
                System.out.println("VIII");
                break;
                
            case 9 : 
                System.out.println("IX");
                break;
                
            case 10 : 
                System.out.println("X");
                break;
            
            default : 
                System.out.println("Lain Kali");
                break;
        }
    }
    
    public static void main(String []args){
        
        Tugas7 tgs = new Tugas7();
        tgs.Angka(10);
    
    }
    
    
}