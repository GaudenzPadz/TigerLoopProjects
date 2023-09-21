import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        //Scanner To Get User input
        Scanner scanner = new Scanner(System.in);

        // Input variables
        String sName;
        int sCode, cCode;
        double rFee;
        // Output variables
        String session="", cDesc;
        double cFee, discPct, dAmt, tBal;

        // Input screen
        System.out.print("Student name      : ");
        sName = scanner.nextLine();

        System.out.print("Session code (1/2): ");
        sCode = scanner.nextInt();
               // Assign session based on session code
        if (sCode==1) session="Morning";
        if (sCode==2) session="Afternoon";
 
        System.out.print("Course code (50-52): ");
        cCode = scanner.nextInt();
                // Assign cDesc and cFee based on cCode
        switch (cCode) {
            case 50:
                cDesc = "C++";
                cFee = 7000.00f;
                break;
            case 51:
                cDesc = "Java";
                cFee = 8000.00f;
                break;
            case 52:
                cDesc = "Visual Basic";
                cFee = 9000.00f;
                break;
            default:
                cDesc = "Invalid Course Code";
                cFee = 0.00f;
                break;
        }
        
        
        System.out.print("Registration fee (3500-6500 & Above)   : ");
        rFee = scanner.nextFloat();
        // Calculate discount percentage based on rFee
        if (rFee < 4499.99) {
            discPct = 0;
            
        } else if (rFee <= 5499.00) {
            discPct = 2;
            
        } else if (rFee <= 6499.00) {
            discPct = 4;
            
        } else {
            discPct = 6;
        }
        
        // Calculate discount amount and total balance
        dAmt = cFee * discPct / 100;
        tBal = cFee - (rFee + dAmt);

        // Output
        System.out.println("\nOutput screen");
        System.out.println("Student name     : " + sName);
        System.out.println("Session          : " + session);
        System.out.println("Course desc      : " + cDesc);
        System.out.println("Total balance     : " + tBal);
    }
}
