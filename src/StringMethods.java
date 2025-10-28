public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello" + "World";
        str.concat("And Goodbye!"); // immutable is should assign to new var

        StringBuilder strBuilder = new StringBuilder("hello" + "world "); 
        strBuilder.append("And Goodbye!!!"); // that does, no need to assign to any var(same obj) self refrence

        printInformation(str);
        printInformation(strBuilder);
        StringBuilder emptyStr = new StringBuilder(); // 16 chrs only allowed in default
        emptyStr.append("a".repeat(17));
        StringBuilder emptyStr36 = new StringBuilder(36); //show memory= 36 chars
        emptyStr36.append("P".repeat(37));
        printInformation(emptyStr);
        printInformation(emptyStr36);

        StringBuilder strBuilderPlus = new StringBuilder("Hello " + "World "); 
        strBuilderPlus.append("And Goodbye!!!"); 
        strBuilderPlus.deleteCharAt(16).insert(16, "g");
        strBuilderPlus.replace(16, 17, "G");
        strBuilderPlus.reverse().setLength(10);;
        printInformation(strBuilderPlus);
        
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
    public static void printInformation(String str) {
        System.out.println("String = ".concat(str));
        System.out.println("Length = " + str.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String builder = " + builder);
        System.out.println("length" + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
    }

