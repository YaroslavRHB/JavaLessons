package homeworks.hw_17_09_23.railway;

import java.util.Objects;

public class TrainService {
    private Train[] trains;

    public TrainService(int size) {
        trains = new Train[size];
    }

    public void addTrain(Train train) {
        for (int i = 0; i < trains.length; i++) {
            if (Objects.isNull(trains[i])) {
                trains[i] = train;
                break;
            }
        }
    }

    public void showAllTrains() {
        for (Train train : trains) {
            if (Objects.nonNull(train)) {
                train.view();
            }
        }
    }

    public void showTrainsDeparture(Cities city) {
        for (Train train : trains) {
            if (Objects.nonNull(train) && train.getDeparture() == city) {
                train.view();
            }
        }
    }

    public void showTrainsArrival(Cities city) {
        for (Train train : trains) {
            if (Objects.nonNull(train) && train.getArrival() == city) {
                train.view();
            }
        }
    }

    public void showTrainByNumber(int number) {
        for (Train train : trains) {
            if (Objects.nonNull(train) && train.getNumber() == number) {
                train.view();
            }
        }
    }

    public void showClass(Coach type) {
        for (Train train : trains) {
            if (Objects.nonNull(train) && train.getCoach() == type) {
                train.view();
            }
        }
    }
}
