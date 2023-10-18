import entities.Worker;
import service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Worker> workers=new ArrayList<>();
        WorkerService workerService=new WorkerService();
        workerService.menu(scanner,workers);









    }
}
