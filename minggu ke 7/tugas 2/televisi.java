package tugas1;

public class televisi {
    private String deskripsi;
    private int jumlahChannel;
    private String[] channels = null;
    private int channelAktif;
    private int volume;
    
    public televisi(String Deskripsi, int jumlahChannel){
        this.deskripsi = Deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public int getjumlahChannel() {
      return jumlahChannel;
    }
    
    public String[] getChannels() {
        if(channels == null) {
            System.out.println("Belum ada channel yang diset!");
        }
        return channels;
    }
    
    public void setChannels(String[] Channels){
        if (Channels.length > jumlahChannel ){
            System.out.println("Maaf TV ini hanya dapat menyimpan " + jumlahChannel + " channels");
        } else {
            this.channels = Channels;
            System.out.println("Informasi channel berhasil di update!");
        }
    }
    
    public int getchannelAktif(){
        return channelAktif;
    }
    
    public void setchannelsAktif(int ChannelsAktif){
        if (ChannelsAktif > channels.length ){
            System.out.println("Channel yang Anda inginkan belum diset!");
            return;
        } 
            this.channelAktif = ChannelsAktif;
            System.out.println("Pindah channel ke : "+ channels[ChannelsAktif]);
        }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int Volume){
        this.volume = Volume;
        System.out.println("Intensitas volume sekarang : " + Volume);
    }
    }

    
