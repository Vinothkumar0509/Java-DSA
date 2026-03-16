package map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTopAttendance {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Vinoth", 25),
                new Student("Vinoth", 25),
                new Student("Vinoth", 25),
                new Student("Vinoth", 25),


                new Student("Madhan", 25),
                new Student("Madhan", 25),
                new Student("Madhan", 25),
                new Student("Madhan", 25),
                new Student("Madhan", 25),

                new Student("Arun", 25)
        );

        Map<String, Long> studentFrequentMap = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        Optional<String> maxAttempt = studentFrequentMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        if (maxAttempt.isPresent()) {
            System.out.println(maxAttempt.get());
        }
    }
}