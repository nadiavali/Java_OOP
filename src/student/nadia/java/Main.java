package student.nadia.java;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LAPStudent s = new LAPStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
            Student pojoStudent = new Student("S92306", "Nadia", "05/11/1985", "Java Masterclass");
            LAPStudent recordStudent = new LAPStudent("S92307", "Cem", "05/11/1985", "Java Masterclass");
            System.out.println(pojoStudent);
            System.out.println(recordStudent);
            pojoStudent.setClassList(pojoStudent.getClassList() + " Python");
           // record is immutible

            System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
            System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
        }
    }
}

