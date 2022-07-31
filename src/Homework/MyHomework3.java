package Homework;

import java.io.*;

public class MyHomework3 {
    //Задание 1
    public static void main(String[] args) throws IOException {

     Zhiguli zhiguli = new Zhiguli();
     Toyota toyota = new Toyota();
     zhiguli.broken();
     toyota.music();


        //Задание 2
        FileReader reader = new FileReader("E:\\Programs\\java_core_2\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line1 = bufferedReader.readLine();
        String line2 = bufferedReader.readLine();
        System.out.println(line1 + " " + line2);
        reader.close();
        bufferedReader.close();

        //Задание 3
        FinancialRecord financialRecord = new FinancialRecord(500,300);
        FileWriter fileWriter = new FileWriter("E:\\Programs\\java_core_2\\report.txt");
        fileWriter.write("доходы = " + financialRecord.getIncomes() + ", расходы равно = "
                + financialRecord.getOutcomes());
        fileWriter.close();



    }
}

