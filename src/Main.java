public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+ " " +firstName+ " " +middleName;
        System.out.println("ФИО сотрудника — "+fullName);
        System.out.println("Задание 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника —" +upperFullName);
        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —" +fullName1);


    }
}