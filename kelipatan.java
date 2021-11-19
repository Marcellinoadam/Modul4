public class kelipatan {

    public static void main(String[] args) {
      long t = 1000;
      long sum = 0;
  
      for(int i = 1; i<t; i++){
              if(i%3 == 0 || i%5 == 0){
                  sum = sum + i;
              }
          }
          System.out.println("jumlah semua kelipatan 3 atau 5 di bawah 1000 Adalah"); 
          System.out.println(sum);    
    }
  }