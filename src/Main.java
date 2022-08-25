public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task12() {
        String firstName = "Denis";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String middleName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] characters = fullName.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (i == 0) {
                characters[i] = Character.toUpperCase(characters[i]);
            } else if (i == fullName.indexOf(" ") + 1) {
                characters[i] = Character.toUpperCase(characters[i]);
            } else if (i == fullName.lastIndexOf(" ") + 1) {
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        String correctFullName = new String(characters);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + correctFullName);
    }

    private static void task7() {
        StringBuilder firstString = new StringBuilder("135");
        String secondString = "246";
        int firstStringLength = firstString.length();
        for (int i = 0; i < firstStringLength; i++) {
            firstString.insert(i + i + 1, secondString.charAt(i));
        }
        System.out.println("Данные строки — " + firstString);
    }

    private static void task8() {
        String word = "aabccddefgghiijjkk";
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == characters[i + 1]) {
                System.out.print(characters[i]);
            }
        }
    }
}

