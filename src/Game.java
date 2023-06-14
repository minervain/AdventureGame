import java.util.Scanner;

public class Game {


    private Scanner scanner= new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.println("Lütfen isim giriniz");
        String playerName=scanner.nextLine();
        Player player =new Player(playerName);
        System.out.println(player.getName()+" hoşgeldiniz ");
        System.out.println("Lütfen Oyun için karakter seçin");
        player.selectChar();
    }
}
