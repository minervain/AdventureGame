public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Bölge");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli bölgedesiniz ");
        System.out.println("Canınız Fullendi ");
        return true;
    }
}
