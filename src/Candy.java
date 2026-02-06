import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candy {
    List<List<String>> candylist= new ArrayList<>();
    List<String> candies = new ArrayList<>();
    public String name;
    public String stock;

    public Candy(String name, String stock) {
        this.name = name;
        this.stock = stock;
        candies.add(name);
        candies.add(stock);
        candylist.add(candies);

    }
    public String getName() {
        return this.name;
    }

    public String getStock() {
        return this.stock;
    }
    public String toString() {
        return "Candy: " + name + ", Stock: " + stock;
    }
    public void viewCandies() {
        if (candies.isEmpty()) {
            System.out.println("No candy available");
        }
        else {
            System.out.println(candylist);
        }
    }
    public void addCandy(String name, String stock) {
        List<String> candies = new ArrayList<>();
        candies.add(name);
        candies.add(stock);
        candylist.add(candies);
        System.out.println("Candy has been added!");
    }
    public void updateCandy(String name, String stock) {
        List<String> updatecandies = new ArrayList<>();
        updatecandies.add(name);
        updatecandies.add(stock);
        Scanner scanner = new Scanner(System.in);
        int p = candylist.indexOf(updatecandies);
        List<String> innerListToUpdate = candylist.get(p);
        System.out.println("What candy would you like to add? ");
        String updatedCandy = scanner.nextLine();
        System.out.println("How much stock would you like? ");
        String updatedStock = scanner.nextLine();
        innerListToUpdate.clear();
        innerListToUpdate.add(updatedCandy);
        innerListToUpdate.add(updatedStock);
//        innerListToUpdate.set();
        System.out.println(innerListToUpdate);

    }
    public void removeCandy(String name, String stock) {
        List<String> removecandies = new ArrayList<>();
        removecandies.add(name);
        removecandies.add(stock);
        candylist.remove(removecandies);

    }
}
