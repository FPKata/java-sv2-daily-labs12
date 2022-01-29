package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunningFileManager {
    private List<Run> runnings = new ArrayList<>();

    public void readAllLines(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){  //...= Files.newBufferedReader(Path.of(fileName))
            String line;
            br.readLine();  //fejléc miatt, a kurzort a köv. sor elejére állítja (ELŐOLVASÁS)
            while((line = br.readLine()) != null){
                Run run = createRunObjectFromLine(line);
                runnings.add(run);
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot reach file.", ioe);
        }
    }
    public double sumOfMonthAndYear(int year, Month month){
        double sum = 0;
        for (Run actual : runnings){
            if (actual.getDate().getYear() == year && actual.getDate().getMonth() == month){
                sum += actual.getKm();
            }
        }
        return sum;
    }

    private Run createRunObjectFromLine(String line) {
        String[] temp = line.split(";");
        return new Run(Double.parseDouble(temp[0].split(" ")[0]), LocalDate.parse(temp[1]));
    }
}
