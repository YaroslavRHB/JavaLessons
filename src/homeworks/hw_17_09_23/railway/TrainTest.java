package homeworks.hw_17_09_23.railway;

/**
 * 1) Организовать приложение касса вокзала.
 * Приложение должно позволять:
 * 1) Создавать рейс(номер, количество вагонов, класс удобства(использовать enum),
 * город отбытия/прибытия(использовать enum), время в пути, скоростной/нескоростной).
 * 2) Выводить список всех рейсов.
 * 3) Выводить список рейсов по городу отбытия, передавать как параметр.
 * 4) Выводить список рейсов по городу прибытия, передавать как параметр.
 * 5) Просматривать отдельный рейс по номеру, номер передавать как параметр.
 * 6) Выводить рейсы, у которых вагоны типа люкс/эконом.
 */
public class TrainTest {
    public static void main(String[] args) {
        Train train1 = new Train(345, 5, Coach.FIRST, Cities.DUBLIN, Cities.BELFAST,
                480, TrainType.HIGH_SPEED_TRAIN);
        Train train2 = new Train(1345, 4, Coach.SECOND, Cities.CORK, Cities.DUBLIN,
                220, TrainType.REGULAR);
        Train train3 = new Train(455, 6, Coach.FIRST, Cities.BELFAST, Cities.CORK,
                150, TrainType.HIGH_SPEED_TRAIN);
        Train train4 = new Train(266, 5, Coach.SECOND, Cities.GALWAY, Cities.TULLAMORE,
                280, TrainType.REGULAR);
        Train train5 = new Train(18, 4, Coach.SECOND, Cities.TULLAMORE, Cities.GALWAY,
                360, TrainType.REGULAR);


        TrainService ts = new TrainService(5);
        ts.addTrain(train1);
        ts.addTrain(train2);
        ts.addTrain(train3);
        ts.addTrain(train4);
        ts.addTrain(train5);

        ts.showAllTrains();
        ts.showTrainsDeparture(Cities.DUBLIN);
        ts.showTrainsArrival(Cities.CORK);
        ts.showTrainByNumber(18);
        ts.showClass(Coach.SECOND);
    }
}
