package Lesson5;


import java.util.Scanner;
import java.util.regex.Pattern;

public class GetDataFromUser {
    private static final Pattern NAME_PATTERN = Pattern.compile("(?iu)^[а-яёA-Z]+$");
    private static final Pattern DATE_PATTERN = Pattern.compile("^[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]$");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+$");
    private static final Pattern GENDER_PATTERN = Pattern.compile("^[mf]$");

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: Фамилия Имя Отчество дату рождения номер телефона пол ,разделенные пробелом....");
        String data = scanner.nextLine();
        String[] dataArray = data.split("\\s+");

        if (dataArray.length != 6) {
            System.err.println("Вы ввели n = " + dataArray.length + ", нужно 6 строк, разделенных пробелом");
            return getData();
        }

        String firstName = dataArray[0];
        String lastName = dataArray[1];
        String middleName = dataArray[2];
        String birthDate = dataArray[3];
        String phoneNumber = dataArray[4];
        String gender = dataArray[5];

        if (!isValidName(firstName)) {
            System.err.println("Имя написано с ошибкой");
            return getData();
        } else if (!isValidName(lastName)) {
            System.err.println("Фамилия написана с ошибкой");
            return getData();
        } else if (!isValidName(middleName)) {
            System.err.println("Отчество написано с ошибкой");
            return getData();
        } else if (!isValidDate(birthDate)) {
            System.err.println("Дата рождения введена неверно");
            return getData();
        } else if (!isValidNumber(phoneNumber)) {
            System.err.println("Номер должен содержать только цифры");
            return getData();
        } else if (!isValidGender(gender)) {
            System.err.println("Пол: m or f");
            return getData();
        }

        String[] validDataArray = {firstName, lastName, middleName, birthDate, phoneNumber, gender};
        return validDataArray;
    }

    private boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    private boolean isValidDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    private boolean isValidNumber(String number) {
        return NUMBER_PATTERN.matcher(number).matches();
    }

    private boolean isValidGender(String gender) {
        return GENDER_PATTERN.matcher(gender).matches();
    }
}

/* first version

public class GetDataFromUser {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] strArray = data.split("\\s+");


        if (strArray.length != 6) try {
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Вы ввели n = " + strArray.length + ", нужно 6 строк, разделенных пробелом");
            System.out.println("Введите еще раз:");
            return getData();
        }
        else {
            if (!strArray[0].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Имя написано с ошибкой");
                    return getData();
                }
            } else if (!strArray[1].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Фамилие написано с ошибкой ");
                    return getData();
                }
            } else if (!strArray[2].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Отчество написано с ошибкой ");
                    return getData();
                }

            } else if (!strArray[3].matches("^[0-3][0-9].[01][0-9].[12][09][0-9][0-9]$")) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Дата рождения введена неверно  ");
                    return getData();
                }

            } else if (!strArray[4].matches("^[0-9]+$")) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Номер должен содержать только цифры ");
                    return getData();
                }

            } else if (!(strArray[5].equals("m") || strArray[5].equals("f"))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Пол: m or f");
                    return getData();
                }
            }

        }


//        System.out.println(Arrays.toString(strArray));
        return strArray;
    }
}
*/
