import java.util.Scanner;
 
class obat {

  public void fungsiObat(int usia, int jenisKelamin, int beratBadan){
    if(usia > 21){
      if(jenisKelamin == 1 ){                                    /*laki laki*/
        if(beratBadan > 150){
           System.out.println("\nsilahkan ambil obat nomer 1");
        }else{                                                   /*Beratbadanlaki<150*/
          System.out.println("\nSilahkan ambil obat nomer 2");
        }
      }else{                                                     /*perempuan*/
        if(beratBadan>150){
          System.out.println("\nSilahkan ambil obat nomer 3");

        }else{                                                   /*beratbadanperempuan<150*/
          System.out.println("\nAnda Tidak Memerlukan Obat");
        }
      }/*end of jenis kelamin perempuan umur 21*/
                                                                 /*end of usia 21*/
    }else{                                                       /*jika usia < 21*/    
      if(jenisKelamin == 1){                                     /*laki*/
        if(beratBadan>150){                                      /*berat badan 150*/
          System.out.println("\nsilahkan ambil obat nomer 1 & 2");
        }else{                                                   /*berat badan <150*/
          System.out.println("\nSilahkan ambil obat nomer 3");
        }

      }else{                                                    /*perempuan*/
        if(beratBadan>150){                                     /*berat badan>150*/
          System.out.println("\nAnda Tidak Memerlukan Obat");
        }else{                                                  /*berat badan<150*/
          System.out.println("\nsilahkan ambil obat nomer 1 & 3");
        }
      }
    }
  }


  public static void main(String args[]){
  obat objectObat = new obat();

  //
  Scanner inputJenisKelamin = new Scanner(System.in);
  Scanner inputUsia = new Scanner(System.in);
  Scanner inputBeratBadan = new Scanner(System.in);
  System.out.println("berapa usia anda? (input Nomer)");
  int usiaUser = inputUsia.nextInt();
  System.out.println("Apa Jenis Kelamin Anda? (input Nomer)");
  System.out.println("1. Laki-laki ");
  System.out.println("2. Perempuan ");
  int jenisKelamin = inputJenisKelamin.nextInt();
  System.out.println("berapa berat badan anda? (input Nomer)");
  int beratUser = inputBeratBadan.nextInt();

  //fungsi
  objectObat.fungsiObat(usiaUser, jenisKelamin, beratUser);





}
}