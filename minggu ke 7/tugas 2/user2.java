package tugas1;

public class user2 {
    public static void main(String[] args) {
       TelevisiModern tv = new TelevisiModern("TV Modern, 14 inchies", 100);
       String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                 "METRO TV","TRANS TV","TPI","TV 7",
                                 "TVRI", "TV G","ANTV"};
       
       System.out.println("Pak Lukman, membeli Televisi : "+tv.getDeskripsi());
       tv.getChannels();
       tv.setChannels(semuaChannel);
       
       tv.setchannelsAktif(3);
       tv.setVolume(10);
       tv.setchannelsAktif(10);
       tv.setchannelsAktif(1);
       tv.setModusTampilan(TelevisiModern.TELETEXT);
       tv.setHalamanTeletext(250);
       tv.setModusTampilan(TelevisiModern.TV);
       tv.playCD();
       tv.setDiscTray("The Matrix");
       tv.playCD();
   } 
}
