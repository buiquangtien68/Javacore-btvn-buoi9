package service;

import entities.STATUS;
import entities.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public void menu(Scanner scanner, ArrayList<Worker> workers){
        int select;
        do {
            System.out.println("Worker Management");
            System.out.println("1.Add Worker");
            System.out.println("2.Up salary");
            System.out.println("3.Down salary");
            System.out.println("4.Display Infomation salary");
            System.out.println("5.Exit");
            System.out.println("Mời bạn chọn:");
            select=Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    workers.add(addWorker(scanner));
                    break;
                case 2:
                    upSalary(scanner,workers);
                    break;
                case 3:
                    downSalary(scanner,workers);
                case 4:
                    printInfo(workers);
            }
        }while (select!=5);

    }
    public Worker addWorker(Scanner scanner){
        System.out.println("Mời bạn nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi:");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập lương:");
        double salary=Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập nơi làm việc:");
        String workPlace= scanner.nextLine();
        LocalDate addWorkerTime=LocalDate.now();
        Worker worker=new Worker(name,age,salary,workPlace);
        worker.setAddWorkerTime(addWorkerTime);
        return worker;
    }

    public void upSalary(Scanner scanner,ArrayList<Worker> workers){
        System.out.println("Mời bạn nhập id:");
        int inputId=Integer.parseInt(scanner.nextLine());
        if (inputId==Worker.getAutoId()){
            System.out.println("Mời bạn nhập phần lương tăng thêm:");
            double inputUpSalary=Double.parseDouble(scanner.nextLine());
            double upSalary= workers.get(inputId-1).getSalary()+inputUpSalary;
            workers.get(inputId-1).setSalary(upSalary);
            workers.get(inputId-1).setSTATUS(STATUS.UP);
        }else System.out.println("Nhập sai id");
    }
    public void downSalary(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Mời bạn nhập id:");
        int inputId = Integer.parseInt(scanner.nextLine());
        if (inputId == Worker.getAutoId()) {
            System.out.println("Mời bạn nhập phần lương giảm:");
            double inputDownSalary = Double.parseDouble(scanner.nextLine());
            double downSalary=workers.get(inputId-1).getSalary()-inputDownSalary;
            workers.get(inputId-1).setSalary(downSalary);
            workers.get(inputId-1).setSTATUS(STATUS.DOWN);
        } else System.out.println("Nhập sai id");
    }
    public void printInfo(ArrayList<Worker> workers){
        System.out.println(workers);
    }
}
