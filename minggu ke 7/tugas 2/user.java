package tugas1;

public class user {
   public static void main(String[] args) {
       televisi tv = new televisi("TV Tempoe Doloe, 14 inchies", 10);
       String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                 "METRO TV","TRANS TV","TPI","TV 7",
                                 "TVRI", "TV G","ANTV"};
       String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR","LA TV",
                                  "METRO TV","TRANS TV","TPI","TV 7"};
       
       System.out.println("Pak Lukman, membeli Televisi : "+tv.getDeskripsi());
       tv.getChannels();
       tv.setChannels(semuaChannel);
       tv.setChannels(channelFavorit);
       
       tv.setchannelsAktif(3);
       tv.setVolume(10);
       tv.setchannelsAktif(10);
       tv.setchannelsAktif(1);
   } 
}
