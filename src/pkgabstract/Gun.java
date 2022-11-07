package pkgabstract;
public class Gun extends Weapon{
    public int bullet;
    int maxBullet;
    public Gun(int bullet){
        this.bullet = bullet;
        maxBullet = bullet;
    }
    @Override
    public void attack(){
        if(bullet > 0){
            bullet--;
            System.out.println("senjata");
            System.out.println("menembakan peluru");
            System.out.println("sisa peluru : " + bullet);
        }
        else{
            reload();
        }
    }
    void reload(){
        bullet = maxBullet;
        System.out.println("Reloading . . . .");
        System.out.println("sisa peluru : " + bullet);
    }
}
