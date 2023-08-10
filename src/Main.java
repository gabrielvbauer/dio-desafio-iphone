import com.dio.entities.Iphone;

public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone("iPhone 15 Pro Max", "15.9.9", 128000000000.0);

    iphone.play();
    iphone.pause();
    iphone.selectMusic();

    iphone.call();
    iphone.answer();
    iphone.startVoiceMail();

    iphone.showPage();
    iphone.openNewPage();
    iphone.updatePage();
  }
}
