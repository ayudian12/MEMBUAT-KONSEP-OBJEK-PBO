/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.utama.nilai.raport;

/**
 *
 * @author ASUS A407M
 */
public class ProgramUtamaNilaiRaport {
    public static void main(String[] args) {
            Nilai_Raport nilai = new  Nilai_Raport ();
            int pengetahuan, ketrampilan;
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("___Info Nilai Raport___");
            System.out.println("Nilai Pengetahuan = ");
            pengetahuan = input.nextInt();
            System.out.println("Nilai Ketrampilan = ");
            ketrampilan = input.nextInt();
                    
            // pengetahuan
            if (nilai.getnilaiPengetahuan(pengetahuan)) >91 && nilai.getnilaiPengetahuan(pengetahuan) <=100 ) {
               System.out.println("___Hasil Konversi___");
               System.out.println("Konversi Pengetahuan =A ");
            }
            else if (nilai.getnilaiPengetahuan(pengetahuan)) >81 && nilai.getnilaiPengetahuan(pengetahuan) <=90 ) {
               System.out.println("___Hasil Konversi___");
               System.out.println("Konversi Pengetahuan =B+ ");
            }
           else if (nilai.getnilaiPengetahuan(pengetahuan)) >71 && nilai.getnilaiPengetahuan(pengetahuan) <=80 ) {
               System.out.println("___Hasil Konversi___");
               System.out.println("Konversi Pengetahuan =B "); 
            }
            else if (nilai.getnilaiPengetahuan(pengetahuan)) >60 && nilai.getnilaiPengetahuan(pengetahuan) <=70 ) {
               System.out.println("___Hasil Konversi___");
               System.out.println("Konversi Pengetahuan =C ");
            }
            else{
             System.out.println("___Hasil Konversi___");
             System.out.println("Konversi Pengetahuan =D ");
            }        
                    
                    
           // ketrampilan
           if (nilai.getnilaiKetrampilan(ketrampilan)) >91 && nilai.getnilaiKetrampilan(Ketrampilan) <=100 ) { 
             System.out.println("Konversi Ketrampilan = A");
           }
           else if (nilai.getnilaiKetrampilan(ketrampilan)) >81 && nilai.getnilaiKetrampilan(Ketrampilan) <=90 ) { 
             System.out.println("Konversi Ketrampilan = B+");
           } 
           else if (nilai.getnilaiKetrampilan(ketrampilan)) >71 && nilai.getnilaiKetrampilan(Ketrampilan) <=80 ) { 
             System.out.println("Konversi Ketrampilan = B");
           } 
           else if (nilai.getnilaiKetrampilan(ketrampilan)) >60 && nilai.getnilaiKetrampilan(Ketrampilan) <=70 ) { 
             System.out.println("Konversi Ketrampilan = C");
           } 
           else{
                 System.out.println("Konversi Ketrampilan = D");          
           }
    }
     
}
