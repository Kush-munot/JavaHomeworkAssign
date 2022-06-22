public class Student extends Person implements Admission {
    int rollNum,percentage;

    Student(){}
    Student(String name, String gender, String address, String nationality, int rollNum, int percentage){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.nationality = nationality;
        this.rollNum = rollNum;
        this.percentage = percentage;
    }


    public void takeAdmission(boolean passed, int feespaid, boolean optedForCourse){
        if(passed && feespaid == fees && optedForCourse){
            System.out.println("Admission Granted! Congratulations!!");
        }else{
            System.out.println("Sorry to reject your Admission Request. All the Best for Futre Endevours!!");
        }
    }
}
