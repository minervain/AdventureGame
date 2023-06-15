import java.util.Scanner;

public class    Game {


    private Scanner scanner= new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.println("Lütfen isim giriniz");
        String playerName=scanner.nextLine();
        Player player =new Player(playerName);
        System.out.println(player.getName()+" hoşgeldiniz ");
        System.out.println("Lütfen Oyun için karakter seçin");
        player.selectChar();
        player.selectLoc();
        player.printInfo();

        Location location=null;
        while (true){
            player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1-Güvenli ev  ");
            System.out.println("2- mağaza");
            System.out.println("Yer Seçiniz");
            int selectLoc=scanner.nextInt();

            switch (selectLoc){
                case 1:
                    location= new SafeHouse(player);

                case 2:
                    location=new ToolStore(player);
                    break;
                default:
                    location=new SafeHouse(player);
            }
            if(!(location.onLocation())){
                System.out.println("Öldünüz    ");
                break;
            }
        }

    }

}
