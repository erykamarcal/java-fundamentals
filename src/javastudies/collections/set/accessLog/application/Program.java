package javastudies.collections.set.accessLog.application;

import javastudies.collections.set.accessLog.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            Set<LogEntry>logEntries = new HashSet<>();

           String line = bufferedReader.readLine();
           while (line != null){

               String [] fields = line.split(" ");
               String username = fields[0];
               Instant moment = Instant.parse(fields[1]);

               logEntries.add(new LogEntry(username, moment));

               line  = bufferedReader.readLine();
           }
            System.out.println("Total Users: " + logEntries.size());

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
