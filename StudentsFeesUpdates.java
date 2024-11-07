package sectionBfees;

class StudentsfeesUpdates {
    String name;
    int age;
    long mobNo;
    int leave;
    int fees;

    public StudentsfeesUpdates(String name, int age, long mobNo, int leave, int fees) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.leave = leave;
        this.fees = fees;
    }
// methods
    void displayStudent() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Mobile No: " + this.mobNo);
        System.out.println("Leave: " + this.leave);
        System.out.println("Fees (Numeric): " + this.fees);
        System.out.println("Fees in Alphabetic : " + getAlphabeticDigit(this.fees) + studentFeeString(this.fees));

    }

    void enterAge() {
        this.age += 1;
    }

    private String studentFeeString(int fees) {
        switch (fees) {
            case 0:
            	
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10: 
                return "Ten";
            case 20: 
                return "Twenty";
            case 30:
                return "Thirty";
            case 40: 
                return "Forty";
            case 50: 
                return "Fifty";
            case 60: 
                return "Sixty";
            case 70: 
                return "Seventy";
            case 80: 
                return "Eighty";
            case 90: 
                return "Ninety";
            case 100: 
                return "hundred";
            case 200: 
                return "two hundred ";
            case 300:
                return "Three hundred ";
            case 400: 
                return "Four hundred";
            case 500: 
                return "Five hundred";
            case 600: 
                return "Six hundred";
            case 700: 
                return "Seven hundred";
            case 800: 
                return "Eight hundred";
            case 900: 
                return "Nine hundred";
            case 1000: 
                return " ten hundred";
            case 2000: 
                return "two thousand";
            case 3000:
                return "Three thousand ";
            case 4000: 
                return "Four thousand";
            case 5000: 
                return "Five thousand";
            case 6000: 
                return "Six thousand";
            case 7000: 
                return "Seven thousand";
            case 8000: 
                return "Eight thousand";
            case 9000: 
                return "Nine thousand";
            case 10000: 
                return "ten thousand ";    
            default:
                return "";
        }

    }    
    
    String getAlphabeticDigit(int fees) {

        if (fees < 0)  return "Invalid Fees";
        
        int thousands = fees / 1000;
        int hundreds = (fees % 1000) / 100;
        int tens = (fees % 100) / 10;
        int singles = (fees % 10);

    
        System.out.println(thousands);
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(singles);
        
       String printPd =studentFeeString(thousands );
       System.out.println(printPd);
       
       printPd = studentFeeString(hundreds);
       System.out.println(printPd);
       
       printPd = studentFeeString(tens );
       System.out.println(printPd);
       
       printPd = studentFeeString(singles );
       System.out.println(printPd);
       
       
       
        if (fees == 1000) return "One Thousand";
       else if (fees == 1001) return "one thousand one";
       else if (fees == 1002) return "one thousand two";
       else if (fees == 1003) return "one thousand three";
       else if (fees == 1004) return "one thousand four";
       else if (fees == 1005) return "one thousand five";
       else if (fees == 1006) return "one thousand six";
       else if (fees == 1007) return "one thousand seven";
       //  complete 
       else if (fees == 2000) return "Two thousand";
       else if (fees == 2500) return "Two Thousand Five Hundred";
       else if (fees == 3500) return "Three Thousand Five Hundred";
       else if (fees == 4500) return "Four Thousand Five Hundred";
       else if (fees == 5500) return "Five Thousand Five Hundred";
       else if (fees == 6500) return "Six Thousand Five Hundred";
       else if (fees == 7500) return "Seven Thousand Five Hundred";
       else if (fees == 7300) return "Seven Thousand Three Hundred";
       else if (fees == 8356) return "Eight thousand three hundred fifty Six";
       else if (fees == 8500) return "Eight Thousand Five Hundred";
       else if (fees == 9500) return "Nine Thousand Five Hundred";
       else if (fees == 10000) return "Ten Thousand";
       else return "Invalid Fees";
      
   
    }
    
   

    public static void main(String args[]) {
    	StudentsfeesUpdates s1 = new StudentsfeesUpdates("Shradha", 20, 1234567891, 10, 8356);
        System.out.println("Fees in Alphabetic form: " + s1.getAlphabeticDigit(8356) );
       
        StudentsfeesUpdates s2 = new StudentsfeesUpdates("Ganesh", 18, 1987635321, 12, 7300);
        System.out.println("Fees in Alphabetic form: " + s2.getAlphabeticDigit(7300) );
    
        StudentsfeesUpdates s3 = new StudentsfeesUpdates("Shreya", 19, 1234654321, 5, 4585);
        System.out.println("Fees in Alphabetic form: " + s3.getAlphabeticDigit(4585) );
        
        StudentsfeesUpdates s4 = new StudentsfeesUpdates("Aditi", 22, 1667654321, 21, 3754);
        System.out.println("Fees in Alphabetic form: " + s4.getAlphabeticDigit(3754) );
        
        s1.enterAge();
        s2.enterAge();
        s3.enterAge();
        s4.enterAge();

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
        s4.displayStudent();
        
    }
}
 