import java.util.Scanner;

public class Sample7 {
    public static void main(String[] args) {
        //Declare Variables
        Scanner scanner = new Scanner(System.in);
        String sName;
        int idNum;
        double hCom;
        
        //DO-WHILE LOOP
        do {
            System.out.print("Student Name     : ");
            sName = scanner.nextLine();
        //While Statement if sName < 2 or sName > 20
        } while (sName.length() < 2 || sName.length() > 20);
        
        do {
            System.out.print("ID Number (234-567): ");
            idNum = scanner.nextInt();
        } while (idNum < 234 || idNum > 567);

        do {
            System.out.print("Hours Completed (0-250) : ");
            hCom = scanner.nextDouble();
        } while (hCom < 0 || hCom > 250.0);


        // Determine classif based on hours completed
        String classif;
        if (hCom < 30) {
            classif = "Freshmen";
        } else if (hCom < 60) {
            classif = "Sophomore";
        } else if (hCom < 90) {
            classif = "Junior";
        } else {
            classif = "Senior";
        }

        // Display output
        System.out.println("\nOutput screen");
        System.out.println("Student Name   : " + sName);
        System.out.println("ID Number      : " + idNum);
        System.out.println("Hours Complete : " + hCom);
        System.out.println("classif  : " + classif);
    }
}

