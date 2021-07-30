package latihansoal;

public class LatihanSoal3 {
    
    public static void main(String[] args){
        
        int sukuPertama = 10;
        int selisih = 5;
        int jumlahDeretAritmatika = 0;

        for (int i=1 ; i<=3 ; i++){
            for (int j=1 ; j<=5 ; j++){
                System.out.print(sukuPertama+"   ");
                
                jumlahDeretAritmatika += sukuPertama;
                
                sukuPertama += selisih;
            }
            System.out.println();
        }
        System.out.println("Jumlah Deret Aritmatika adalah "+jumlahDeretAritmatika);
    }
}
