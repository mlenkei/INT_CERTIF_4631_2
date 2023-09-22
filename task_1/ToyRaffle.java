import java.io.FileReader;
import java.io.IOException;

public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "1: Баскетбольный мяч", 15, 15);
        Toy toy2 = new Toy(2, "2: Трактор на колесиках", 200, 55);
        Toy toy3 = new Toy(3, "3: Меч кладинец", 300, 75);
        Toy toy4 = new Toy(4, "4: Избушка на курьих ножках", 35, 45);
        Toy toy5 = new Toy(5, "5: Пластилин разноцветный", 50, 85);
        Toy toy6 = new Toy(6, "6: Маска на хэ́ллоуи́н", 1, 25);
        Toy toy7 = new Toy(7, "7: Горный хрусталь подвеска", 9, 15);
        Toy toy8 = new Toy(8, "8: Футбольный мяч", 25, 75);
        Toy toy9 = new Toy(9, "9: Самосвал на колесиках", 80, 60);
        Toy toy10 = new Toy(10, "10: Терминатор в упаковке", 90, 65);
        Toy toy11 = new Toy(11, "11: Кукла с глазами", 100, 30);
        Toy toy12 = new Toy(12, "12: Набор фламастеров", 59, 40);
        Toy toy13 = new Toy(13, "13: Самакат детский", 1, 6);
        Toy toy14 = new Toy(14, "14: Велосипед горный", 1, 5);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);
        store.addToy(toy10);
        store.addToy(toy11);
        store.addToy(toy12);
        store.addToy(toy13);
        store.addToy(toy14);


        store.changeToyFrequency(1, 30, 15);
        store.changeToyFrequency(2, 30, 200);
        store.changeToyFrequency(3, 30, 300);
        store.changeToyFrequency(4, 30, 35);
        store.changeToyFrequency(5, 30, 50);
        store.changeToyFrequency(6, 30, 1);
        store.changeToyFrequency(7, 30, 9);
        store.changeToyFrequency(8, 30, 25);
        store.changeToyFrequency(9, 30, 80);
        store.changeToyFrequency(10, 30, 90);
        store.changeToyFrequency(11, 30, 100);
        store.changeToyFrequency(12, 30, 59);
        store.changeToyFrequency(13, 30, 1);
        store.changeToyFrequency(14, 30, 1);


        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName() + "\n -------------");
        }
        try(FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Lot_Toys\\prize_surprise.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    System.out.println(" --------------- \n Все разыгранные игрушки в этой акции ");
    
    }
}
