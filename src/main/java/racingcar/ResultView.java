package racingcar;

import java.util.List;

public class ResultView {
    public static void printStatus(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        int countOfCar = cars.size();

        for (int carNumber = 0; carNumber < countOfCar; carNumber++) {
            sb.append(cars.get(carNumber).getCarName())
              .append(" : ")
              .append(printMove(cars.get(carNumber).getMoveDistance()))
              .append("\n");
        }
        System.out.println(sb.toString());
    }

    static String printMove(int count) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < count; index++) {
            sb.append("-");
        }
        return sb.toString();
    }

    static void printWinner(String winnerNames) {
        StringBuilder sb = new StringBuilder(winnerNames);

        sb.append("가 최종 우승했습니다.");
        System.out.println(sb.toString());
    }
}
