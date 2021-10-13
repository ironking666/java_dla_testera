import Utils.StringUtils;
import computer.*;
import model.Bug;
import model.BugReporter;

import java.util.*;
import java.util.stream.Collectors;


public class MainApp {

    public static void main(String[] args) {


        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 1", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));


        //1.
        long count = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();

        System.out.println(count);
        //2.

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);
        //3.
        Computer computer = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can not find any computer"));

        System.out.println(computer.getName());

        //4.
        List<Computer> collect = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        for (Computer comp : collect
        ) {
            System.out.println(comp.getName() + " " + comp.getHdd());

        }

        //5.

        List<Computer> collect1 = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer comp: collect1
             ) {
            System.out.println(comp.getName() + " " + comp.getType());
        }


    }
}
