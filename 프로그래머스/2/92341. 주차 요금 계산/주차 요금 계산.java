import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        String[] temp;
        ParkingLot parkingLot = new ParkingLot(fees);
        for (int i = 0; i < records.length; i++) {
            temp = records[i].split(" ");
            parkingLot.goThoughGate(new Car(temp[0], temp[1], temp[2]));
        }

        parkingLot.removeLeastCarsInParkingLot();


        return parkingLot.getCarPayments();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] fees = {180, 5000, 10, 600};
        String[] records =
                {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN",
                        "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] result = solution.solution(fees, records);
        for (int n : result) {
            System.out.println(n);
        }
    }
}

class Car {
    String time;
    String carNumber;
    String inOrOut;

    public Car(String time, String carNumber, String inOrOut) {
        this.time = time;
        this.carNumber = carNumber;
        this.inOrOut = inOrOut;
    }
}

class ParkingLot {
    private HashMap<String, Car> currentParkingLot;
    private HashMap<String, Integer> paymentMachine;

    int defaultTime;
    int defaultCost;
    int unitTime;
    int unitCost;

    public ParkingLot(int[] fees) {
        currentParkingLot = new HashMap<>();
        paymentMachine = new HashMap<>();
        defaultTime = fees[0];
        defaultCost = fees[1];
        unitTime = fees[2];
        unitCost = fees[3];
    }

    public void goThoughGate(Car car) {
        if (car.inOrOut.equals("IN")) {
            carIn(car);
        } else {
            carOut(car);
        }
    }


    private void carIn(Car car) {
        currentParkingLot.put(car.carNumber, car);
    }


    private void carOut(Car car) {
        if (paymentMachine.get(car.carNumber) == null) {
            paymentMachine.put(car.carNumber, getElapsedMin(car));
        } else {
            int ogTotalTime = paymentMachine.get(car.carNumber);
            paymentMachine.put(car.carNumber, ogTotalTime + getElapsedMin(car));
        }
        currentParkingLot.remove(car.carNumber);
    }


    private int getElapsedMin(Car car) {
        return calculateElapsedMin(car.time, currentParkingLot.get(car.carNumber).time);
    }


    private int calculateElapsedMin(String end, String start) {
        String[] endTime = end.split(":");
        String[] startTime = start.split(":");

        int endMinSum = Integer.parseInt(endTime[0]) * 60 + Integer.parseInt(endTime[1]);
        int startMinSum = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);

        return endMinSum - startMinSum;
    }

    public void removeLeastCarsInParkingLot() {
        if (!currentParkingLot.isEmpty()) {
            Iterator<String> iterator = currentParkingLot.keySet().iterator();
            while (iterator.hasNext()) {
                Car car = currentParkingLot.get(iterator.next());

                if (paymentMachine.get(car.carNumber) == null) {
                    paymentMachine.put(car.carNumber, calculateElapsedMin("23:59", car.time));
                } else {
                    int ogTotalTime = paymentMachine.get(car.carNumber);
                    paymentMachine.put(car.carNumber, ogTotalTime + calculateElapsedMin("23:59", car.time));
                }
                //currentParkingLot.remove(car.carNumber);
            }


        }
    }


    public int[] getCarPayments() {
        Iterator<String> iterator = paymentMachine.keySet().iterator();
        List<String> carNumberList = new ArrayList<>();

        while (iterator.hasNext()) {
            carNumberList.add(iterator.next());
        }

        Collections.sort(carNumberList);
        int[] totalPayments = new int[carNumberList.size()];

        for (int i = 0; i < totalPayments.length; i++) {
            int currentTotalMin = paymentMachine.get(carNumberList.get(i));

//            if (isInParkingLot(carNumberList.get(i))) {
//                Car car = currentParkingLot.get(carNumberList.get(i));
//                currentTotalMin += calculateElapsedMin("23:59", car.time);
//            }

            totalPayments[i] = calculatePayments(currentTotalMin);
        }

        return totalPayments;
    }


    public boolean isInParkingLot(String carNumber) {
        return currentParkingLot.containsKey(carNumber);
    }


    private int calculatePayments(int min) {
        int sum = defaultCost;
        if (min > defaultTime) {
            double temp = (double) (min - defaultTime) / unitTime;
            sum += (int) (Math.ceil(temp) * unitCost);
        }
        return sum;
    }

}