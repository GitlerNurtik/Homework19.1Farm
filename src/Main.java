public class Main {
    public static void main(String[] args) {
    Cow cow = new Cow("Корова", 5,"Женский","Полу-Негр");
    Horse horse = new Horse("Лошадка", 7, "Мужской", "Скакалка");
    Sheep sheep = new Sheep("Овца", 3, "Мужской", "Волосатый чорт");

    Cow[] cowsFromFarm1 = new Cow[]{cow,cow,cow,cow,cow};
    Horse[] horsesFromFarm1 = new Horse[]{horse,horse};
    Sheep[] sheepFromFarm1 = new Sheep[]{sheep,sheep,sheep};
        Cow[] cowsFromFarm2 = new Cow[]{cow};
        Horse[] horsesFromFarm2 = new Horse[]{horse};
        Sheep[] sheepFromFarm2 = new Sheep[]{sheep};
    Farm farm = new Farm("ул. Мохнатая",cowsFromFarm1,  horsesFromFarm1,  sheepFromFarm1, "Mussolini");
    Farm2 farm2 = new Farm2("ул. Лысая", cowsFromFarm2, horsesFromFarm2, sheepFromFarm2, "Alisher");

        System.out.println(farm);
        System.out.println("\n\n\n\n\n\n");
        System.out.println(farm2);


    }
}