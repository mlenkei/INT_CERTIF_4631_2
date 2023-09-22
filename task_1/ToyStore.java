import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ToyStore {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String prizeFilePath;

    public ToyStore() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        prizeFilePath = "C:\\Users\\ASUS\\Desktop\\Lot_Toys\\prize_surprise.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency, double newQuantity) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setQuantity(newQuantity()-1);
                toy.setFrequency(newFrequency);
            }
        }
    }

    private int newQuantity() {
        return 0;
    }

    public void organizeRaffle() {
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }
    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }

            return prizeToy;
        } else {
            System.out.println("Все игрушки кончились");
            return null;
        }
    }
}

