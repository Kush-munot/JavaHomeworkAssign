public class Student implements Comparable<Student>{
    int rollNum,semester;
    String name, phno;

    Student(int rollNum, int semester, String name, String phno){
        this.rollNum = rollNum;
        this.semester = semester;
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public int compareTo(Student c){
        if (rollNum > c.rollNum) {
            return 1;
        }else if (rollNum < c.rollNum) {
            return -1;
        }else {
            if (semester > c.semester) {
                return 1;
            }else if (semester < c.semester) {
                return -1;
            }else{
                return 0;
            }
        }
    }

    public String toString(){
        return("Name : " + this.name + "\nRoll Number : " + this.rollNum + "\n");
    }

}