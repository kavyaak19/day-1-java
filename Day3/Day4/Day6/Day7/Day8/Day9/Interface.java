interface Camera{
    void clickPhoto();
}
interface MusicPlayer{
    void playMusic();
}
class Phone implements Camera, MusicPlayer{
    public void clickPhoto() {
        System.out.println("Photo taken from phone");
    }
    public void playMusic() {
        System.out.println("Music playing in phone");
    }
}

public class Interface {
    public static void main(String[] args) {
        Phone P = new Phone();
        P.clickPhoto(); // Calls the clickPhoto method from Camera interface
        P.playMusic(); // Calls the playMusic method from MusicPlayer interface
    }
    
}
