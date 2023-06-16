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
                addStudent(students);
            }
            else if (num == 2){
                removeStudent(students);
            }
            else if (num == 3){
                viewStudent(students);
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
    static String addStudent(List<String> array1){
        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter student name: ");
        String name = input1.nextLine();
        array1.add(name);
        return null;
    }
    static String removeStudent(List<String> array2){
        Scanner input2 = new Scanner (System.in);
        viewStudent(array2);
        System.out.println("Enter student number: ");
        int num = input2.nextInt();
        array2.remove(num-1);
        return null;
    }
    static String viewStudent(List<String> array3){
        for (int count = 0; count < (array3).size(); count++){
            System.out.println((count+1) + ". " + array3.get(count));
        }
        return null;
    }

}