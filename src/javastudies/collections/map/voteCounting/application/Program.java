package javastudies.collections.map.voteCounting.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> candidates = new TreeMap<>();

        System.out.print("Enter file path: ");
        String path = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String hasLine = bufferedReader.readLine();
            while (hasLine != null) {
                String[] fields = hasLine.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (candidates.containsKey(name)) {
                    int totalVotes = candidates.get(name);
                    candidates.put(name, totalVotes + votes);

                } else {
                    candidates.put(name, votes);
                }
                hasLine = bufferedReader.readLine();
            }
            for (String name : candidates.keySet()) {
                System.out.println(name + ": " + candidates.get(name));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
