package Modul4.soal3;

public class Anjing extends HewanPeliharaan {
    private String furColor;
    private String ability;

    public Anjing(String name, String breed, String furColor, String ability) {
        super(name, breed);
        this.furColor = furColor;
        this.ability = ability;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + getFurColor());
        System.out.println("Memiliki kemampuan: " + getAbility());
    }
}