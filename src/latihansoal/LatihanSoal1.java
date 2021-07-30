package latihansoal;

public class LatihanSoal1 {
    
    public static void main (String[] args){
        System.out.println("<<<<< Latihan Soal 1 >>>>>");
        System.out.println();
        
        int sukuPertama = 3;
        int selisih = 5;
        int jumlahSuku = 10;
        int sukuSaatIni = sukuPertama;
        int jumlahDeretAritmatika = 0;

        for(int i = 1; i <= jumlahSuku; i++){
            System.out.println("Suku ke - "+i+" adalah "+sukuSaatIni);

           jumlahDeretAritmatika += sukuSaatIni;
            
            sukuSaatIni += selisih;
            
        }

        System.out.println("Jumlah Deret Matematika : " + jumlahDeretAritmatika);
    }
}