public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        String firstName = "Азат";
        String middleName = "Фанисович";
        String lastName = "Юнусов";
        String fullName = lastName +" " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        // Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
        // Задание 3
        String newFullName = "Иванов Семён Семёнович";
        newFullName = newFullName.replace("ё","е");
        System.out.println(newFullName);
        System.out.println();

    }
}