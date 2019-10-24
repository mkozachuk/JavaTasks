package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        int id;
        Sex sex;
        //start here - начни тут
        if (args[0].equals("-c")){
            if (args[2].equals("м")){
                    allPeople.add(Person.createMale(args[1], simpleDateFormat.parse(args[3])));
            }
            else if (args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1], simpleDateFormat.parse(args[3])));
            }

            System.out.println(allPeople.size() - 1);
        }
        else if (args[0].equals("-u")){
            id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(args[2]);
            sex = (args[3].equals("м")) ? Sex.MALE : Sex.FEMALE;
            allPeople.get(id).setSex(sex);
            allPeople.get(id).setBirthDate(simpleDateFormat.parse(args[4]));

        }
        else if (args[0].equals("-d")){
            id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDate(null);

        }
        else if (args[0].equals("-i")) {
            id = Integer.parseInt(args[1]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String dateString = dateFormat.format(allPeople.get(id).getBirthDate());
            String sexString = (allPeople.get(id).getSex() == Sex.MALE) ? "м" : "ж";
            System.out.println(allPeople.get(id).getName() + " " + sexString + " " + dateString);

        }
    }
}
