public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(100);
        boss.setTypeOfProtection("Fire ball");
        System.out.println(boss.getHealth() + " - Health");
        System.out.println(boss.getDamage() + " - Damage");
        System.out.println(boss.getTypeOfProtection() + " - TypeOfProtection");


    }
}