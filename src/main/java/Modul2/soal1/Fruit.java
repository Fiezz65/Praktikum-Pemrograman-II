package Modul2.soal1;

public class Fruit {
    private String name;
    private double weight;
    private double price;
    private double totalWeight;

    public Fruit(String name, double weight, double price, double totalWeight) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.totalWeight = totalWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double calculatePricePerKg() {
        return price / weight;
    }

    public double calculateBeforeDiscount() {
        return calculatePricePerKg() * totalWeight;
    }

    public double calculateDiscount() {
        double discount = totalWeight / 4;
        return (int) discount * (price * 4) * 0.02;
    }

    public double calculateAfterDiscount() {
        return calculateBeforeDiscount() - calculateDiscount();
    }

    public void display() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight + " kg");
        System.out.println("Harga: Rp" + price);
        System.out.println("Jumlah Beli: " + totalWeight + " kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", calculateBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f%n", calculateDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", calculateAfterDiscount());
        System.out.println();
    }
}