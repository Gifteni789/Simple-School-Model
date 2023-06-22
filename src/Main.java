import java.util.*;
public class Main {
    private static List<String> students = new ArrayList<>();

    public static void main(String[] args) {

//        students.add("Bolaolu Isaac");
//        System.out.println(students);
        Scanner input = new Scanner(System.in);
        System.out.print("WELCOME. \n 1. Add a student (Enter 1) \n 2. Remove a student (Enter 2) \n 3. View student(s) (Enter 3) \n 4. Exit (Enter 4) \n What would you like to do? ");
        int num = input.nextInt();;
        while (num <= 4){
            if (num == 1){
                ManageStudents.addStudent(students);
            }
            else if (num == 2){
                ManageStudents.removeStudent(students);
            }
            else if (num == 3){
                ManageStudents.viewStudent(students);
            }
            else if (num == 4){
                System.out.println("Goodbye.");
                break;
            }
            else{
                System.out.println("Inaccurate Entry.");
            }
            System.out.print("Next action: ");
            num = input.nextInt();
        }
    }
}