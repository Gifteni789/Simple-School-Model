import java.util.*;

public class ManageStudents {
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
