
public class Yonetici extends Calisanlar{
    private int sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }
    
    public void bilgiler_goster(){
        super.bilgileri_goster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println(getAd() + " çalışanlara " + zam_miktari +" kadar zam yapıyor.");
    }
    
    
}
