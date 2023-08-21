
public class Yazilimci extends Calisanlar{
    private String diller;
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    
    public void format_at(String isletim_sistemi){
        System.out.println(getAd()+" " + isletim_sistemi + "'ni yüklüyor..." );
    }
    public void bilgileri_goster(){
        super.bilgileri_goster();
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
}
