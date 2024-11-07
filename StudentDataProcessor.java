import java.util.ArrayList;
import java.util.List;

public class StudentDataProcessor {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ganesh", 19, "1987635321", 12, 7300));
        students.add(new Student("Shreya", 20, "1234654321", 5, 4585));
        students.add(new Student("Aditi", 23, "1667654321", 21, 3754));

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Mobile No: " + student.getMobileNo());
            System.out.println("Leave: " + student.getLeave());
            System.out.println("Fees (Numeric): " + student.getFeesNumeric());
            System.out.println(getFeesInAlphabetic(student.getFeesNumeric()));
            System.out.println();
        }
    }

    public static String getFeesInAlphabetic(int fees) {
        String[] units = {"", "Thousand", "Million", "Billion"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (fees == 0) {
            return "Zero";
        }

        StringBuilder alphabeticFees = new StringBuilder();
        int i = 0;
        while (fees > 0) {
            if (fees % 1000 != 0) {
                alphabeticFees.insert(0, getPartOfFeesInAlphabetic(fees % 1000) + " " + units[i] + " ");
            }
            fees /= 1000;
            i++;
        }

        return alphabeticFees.toString().trim();
    }

    public static String getPartOfFeesInAlphabetic(int part) {
        StringBuilder alphabeticPart = new StringBuilder();
        if (part >= 100) {
            alphabeticPart.append(ones[part / 100] + " Hundred");
            part %= 100;
        }
        if (part >= 20) {
            alphabeticPart.append(" " + tens[part / 10]);
            part %= 10;
        } else if (part >= 10) {
            alphabeticPart.append(" " + getTeen(part));
            part = 0;
        }
        if (part > 0) {
            alphabeticPart.append(" " + ones[part]);
        }
        return alphabeticPart.toString().trim();
    }

    public static String getTeen(int teen) {
        switch (teen) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return "";
        }
    }
}

class Student {
    private String name;
    private int age;
    private String mobileNo;
    private int leave;
    private int feesNumeric;

    public Student(String name, int age, String mobileNo, int leave, int feesNumeric) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.leave = leave;
        this.feesNumeric = feesNumeric;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getLeave() {
        return leave;
    }

    public int getFeesNumeric() {
        return feesNumeric;
    }
}


 /*   String result = "";

        if (thousands > 0) {
            result += studentFeeString (thousands) + " Thousand ";
        }

        if (hundreds > 0) {
            result += studentFeeString (hundreds) + " Hundred ";
        }

        if (tens > 1) {
            result += studentFeeString (tens) + " ";
        } else if (tens == 1) {
            result += studentFeeString (singles) + " ";
        } else {
            result += studentFeeString (singles) + " ";
        }

        return result.trim();
    }
*/