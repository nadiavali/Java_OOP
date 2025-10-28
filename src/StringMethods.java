public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "10/11/1990";
        int statrtingIndex = birthDate.indexOf("1990");
        System.out.println("statring Index: " + statrtingIndex);
        System.out.println("Birth year = " + birthDate.substring(statrtingIndex));
        System.out.println("Month = " + birthDate.substring(3,5));
        String newBirthDate = String.join("/", "25", "08", "1993");
        System.out.println("New birth date using join = " + newBirthDate);
        newBirthDate = "12".concat("/").concat("11").concat("/").concat("1993");
        System.out.println("concat year = ".concat(newBirthDate));
        System.out.println(newBirthDate.replace("2", "1"));
        System.out.println(newBirthDate.replaceFirst("/", "."));
        System.out.println(newBirthDate.replaceAll("/", "."));
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2)); // 4 space befeore ABC -2 = 2 spcae indentet = removing space
        System.out.println("---\n".repeat(3).indent(3));
    }
    }

