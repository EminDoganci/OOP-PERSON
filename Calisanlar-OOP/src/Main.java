
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        
        String islemler = "İşlemler\n"
                + "1. Yazılımcı işlemleri\n"
                + "2. Yönetici işlemleri\n"
                + "Çıkış için q'ya basınız.";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
        
        while (true) {

            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Emin", "Doğancı", 10, "C#, Java");
                
                String yazilimci_islemler = "Yazılımcı işlemleri\n"
                        + "1. Format at\n"
                        + "2. Bilgileri göster\n"
                        + "Bir üst menü için q'ya basınız.";
                
                System.out.println("******************");
                System.out.println(yazilimci_islemler);
                System.out.println("******************");
                
                
                while (true) { 
                    System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                    String y_islemler = scanner.nextLine();
                    
                    
                    
                    if (y_islemler.equals("q")){
                        System.out.println("Bir üst menüye çıkılıyor...");
                        break;
                    }
                    else if(y_islemler.equals("1")){
                        System.out.print("İşletim sistemini giriniz: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.format_at(isletim_sistemi);
                        
                    }
                    else if(y_islemler.equals("2")){
                        yazilimci.bilgileri_goster();
                    }
                    
                    else {
                        System.out.println("Geçersiz bir işlem seçtiniz. Lütfen tekrar deneyiniz.");
                        
                        
                    }
                    
                }
                
            }
            
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("İlhan", "Doğancı", 1, 10);
                String yonetici_islemler = "Yönetici işlemleri\n"
                        + "1. Zam yap\n"
                        + "2. Bilgileri göster\n"
                        + "Bir üst menü için q'ya basınız.";
                        
                        System.out.println("***********************");
                        System.out.println(yonetici_islemler);
                        System.out.println("***********************");
                        
                        while (true) {
                            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                            String ynt_islem = scanner.nextLine();
                            
                            if (ynt_islem.equals("q")) {
                                System.out.println("Bir üst menüye çıkılıyor...");
                                break;
                                
                            }
                            else if(ynt_islem.equals("1")){
                                System.out.println("Yapılması istenilen zam miktarını giriniz: ");
                                int zam_miktari = scanner.nextInt();
                                scanner.nextLine();
                                yonetici.zam_yap(zam_miktari);
                            }
                            else if(ynt_islem.equals("2")){
                                yonetici.bilgiler_goster();
                            }
                            
                            else {
                                System.out.println("Geçersiz işlem yaptınız. Lütfen tekrar deneyiniz.");
                            }
                           
                            
                        }
                
            }
            else{
                System.out.println("Geçersiz işlem yaptınız. Lütfen tekrar deneyiniz.");
            }
        }
        
    }
    
}
