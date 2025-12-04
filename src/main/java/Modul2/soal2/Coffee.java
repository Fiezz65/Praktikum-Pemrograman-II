package Modul2.soal2;

public class Coffee {
    public String coffeeName;
    public String size;
    public double price;
    private String buyer;

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyer() {
        return buyer;
    }

    public double getTax() {
        return price * 0.11;
    }

        public void info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }
}