import java.util.Scanner;

public class Player {
    private int damage ;
    private int healty;
    private int money;
    private String name;
    private String charName;
    private Scanner scanner= new Scanner(System.in);
    private Inventory inventory;

    public int getDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Player(String name){

        this.name=name;
        this.inventory=new Inventory();
    }
    public void printInfo(){
        System.out.println("Silahınız :"+this.getInventory().getWeapon().getName());
        System.out.println("Hasarınız :"+this.getDamage());
        System.out.println("Sağlık :"+this.getHealty());
        System.out.println("Silahınız :"+this.getMoney());
    }

    public void  selectChar(){
        Samurai samurai=new Samurai();
        Knight knight=new Knight();
        Okcu archer=new Okcu();

        GameChar[] charList={new Samurai(),new Knight(),new Okcu()};
        for(GameChar gameChar :charList){
            System.out.println("ID "+gameChar.getId()+"Karakter  "+gameChar.getName()+"Hasar  "+gameChar.getDamage()+"Sağlık  "+gameChar.getHealth()+"para  "+gameChar.getMoney());
        }
        System.out.println("******************************************");
        System.out.println("Lütfen karakter giriniz");

        int selectChar=scanner.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Okcu());
                break;
            case 3:
                initPlayer(new Okcu());
                break;
            default:initPlayer(new Samurai());
        }

        System.out.println("Karakter : "+this.getCharName() +"Hasar "+this.getDamage()+" sağlık :"+this.getHealty()+"Money  "+ this.getMoney());

        }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealty(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());

    }

    public void selectLoc(){


    }

}
