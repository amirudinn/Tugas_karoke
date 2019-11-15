
package amir_karoke;

import java.util.Scanner;

public class Amir_karoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        double disk1 = 11.11/100*55000;
        double disk2 = 11.11/100*70000;
        double disk3 = 11.11/100*120000;
        double disk4 = 11.11/100*150000;
        
        System.out.println("Karaoke Syariah DAKSS");
        System.out.println("1. Room Small Hanya Rp55.000/jam");
        System.out.println("2. Room Small Hanya Rp70.000/jam");
        System.out.println("3. Room Small Hanya Rp120.000/jam");
        System.out.println("4. Room Small Hanya Rp150.000/jam");
        System.out.println("ADA INFO EVENT 11.11 , ADA DISKON 11.11% BUAT KALIAN YANG BOOKING 3 JAM ATAU LEBIH");
        System.out.println("Booking Att Rame Hayoh(y/t):");
        String pil = sc.nextLine();
        if(pil.equals("y")||pil.equals("Y"))
        {
            System.out.println("Asik!!");
            System.out.println("Pilih Room Berapa :");
            Integer room = sc.nextInt();
            if(room==1)
            {
                System.out.println("Pilih Room Small dengan Harga Rp55.000/jam");
                System.out.println("Mau Berapa lama :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("udah booking ");  
                    System.out.println("Infonya Bossque :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Small");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+55000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama:(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("udah booking ");  
                    System.out.println("Alhamdulillah DAPET DISKON 11.11%");  
                    System.out.println("Infonya Bossque :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Small");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 55000*lama;
                    double dsj = total1-disk1;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            if(room==2)
            {
                System.out.println("Pilih Room Medium dengan Harga Rp70.000/jam");
                System.out.println("Mau Berapa lama :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama Kamu :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("udah booking");  
                    System.out.println("Infonya Bossquee :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Medium");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+70000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("udah booking");  
                    System.out.println("Alhamdulillah DAPET DISKON 11.11%");  
                    System.out.println("Nich Infonya Bossquee :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Medium");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 70000*lama;
                    double dsj = total1-disk2;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            if(room==3)
            {
                System.out.println("Pilih Room Large dengan Harga Rp120.000/jam");
                System.out.println("Mau Berapa lama  :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("dah booking");  
                    System.out.println("Infonya Bosquee :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Large");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+120000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Nama :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("udah booking ");  
                    System.out.println("Alahamdulillah DAPET DISKON 11.11%");  
                    System.out.println("Infonya :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Large");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 120000*lama;
                    double dsj = total1-disk3;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            if(room==4)
            {
                System.out.println("Pilih Family Room  dengan Harga Rp150.000/jam");
                System.out.println("Mau Berapa lama :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Udah Pesen "+lama+ " jam");
                    System.out.println("kela-kela maneh saha :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("dah booking");  
                    System.out.println("yeh info daks :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Family Room");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+150000*lama);
                }
                if(lama>=3)
                {
                    System.out.println(" Pesen "+lama+ " jam");
                    System.out.println("kela-kela saha maneh :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("dah boking");  
                    System.out.println("Alhamdulillah DAPET DISKON 11.11%");  
                    System.out.println("Infonya :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Family Room");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 =150000*lama;
                    double dsj = total1-disk4;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            
        }
        else if(pil.equals("t")||pil.equals("T"))
        {
            System.err.println("Thanks you:(");
        }
        else
        {
            System.err.println("Pilih Y dan T :(");
        }
        
    }
    
}