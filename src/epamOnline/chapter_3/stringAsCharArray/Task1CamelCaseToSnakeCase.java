package epamOnline.chapter_3.stringAsCharArray;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Task1CamelCaseToSnakeCase {
    public static void main(String[] args) {
        String[] vars = {"wildCat", "stupidFox", "theGreatestShowman", "oldMcDonaldHasAFarm" };
        convertToSnakeCase(vars);
        //convertToSnakeCaseWay2(vars);
        System.out.println(Arrays.toString(vars));
    }

    private static void convertToSnakeCase(String[] vars){
        for (int i = 0; i < vars.length; i++) {
            char[] var = vars[i].toCharArray();
            int switches = 0;
            for (int j = 0; j < var.length; j++) {
                if (Character.isUpperCase(var[j])){
                    vars[i] = vars[i].substring(0, j +switches) + "_" + Character.toLowerCase(var[j]) + vars[i].substring(j +1+switches);
                    switches++;
                }
            }
        }
    }

//    private static void convertToSnakeCaseWay2(String[] vars){
//        String regex = "([a-z])?([A-Z]+)";
//        for (int i = 0; i < vars.length; i++) {
//            vars[i] = vars[i].replaceAll(regex, "$1_$2").toLowerCase();
//        }
//    }
}
