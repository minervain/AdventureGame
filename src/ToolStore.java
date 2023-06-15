public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "mağaza ");
    }

    @Override
    public boolean onLocation(){
        System.out.println("   Mağazaya Hoşgeldin   ");
        System.out.println("1-Siahlar");
        System.out.println("1-Zırh");
        System.out.println("1-Çıkış");
        int selectCase=Location.scanner.nextInt();
        while(selectCase<1||selectCase>3){
            System.out.println("Geçersiz değer ");
             selectCase=Location.scanner.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
            case 2:
                printArmour();
            case 3:
                System.out.println("bir daha bekleriz");
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("silahlar");
        for(Weapon w:Weapon.weapons()){

            System.out.println("Name :"+w.getName()+"Para :"+w.getPrice()+"Damage :"+ w.getDamage() );
        }


    }
        public void buyWeapon(){
            int selectWeapon=scanner.nextInt();

            while(selectWeapon<1||selectWeapon>Weapon.weapons().length){

                System.out.println("Geçersiz değer tekarar girin");
                selectWeapon=scanner.nextInt();
                        }
            Weapon selectedWeapon =Weapon.getWeaponObjByID(selectWeapon);

            if(selectedWeapon!=null){
                if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır");
                }
                else {
                    System.out.println(selectedWeapon.getName()+"Silahı Satın Aldınız");
                    int balance=this.getPlayer().getMoney()- selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız :" +this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız :"+ this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                    System.out.println("Yeni Silahınız "+this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }

    public void printArmour(){
        System.out.println("silahlar");
    }

}
