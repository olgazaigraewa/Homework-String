public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firsName, middleName);
        System.out.println("ФИО сотрудника - " + fullName + ".");

        System.out.println("Задача 2");
        String fullNameForTheReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета -" + fullNameForTheReport + ".");

        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника - " + fullName2 + ".");
    }
}