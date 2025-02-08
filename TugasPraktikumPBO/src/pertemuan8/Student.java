package pertemuan8;

/**
 *
 * @author sye
 */
public class Student {
     private final double MIN_SCORE = 80;
    
    private String name;
    private double examResult;
    private boolean pass;
    

    public Student(String name, double examResult) {
        this.setName(name);
        this.setExamResult(examResult);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExamResult() {
        return examResult;
    }

    public void setExamResult(double examResult) {
        try {
            if (examResult < 0) {
            System.out.println("[!!] Cannot less than 0");
            } else {
                this.examResult = examResult;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when"
                    + " defining number of students.");
            System.out.println(e);
        } finally {
            System.out.println("It is FINALLY!");
        }
        
        this.setPass(this.examResult);
    }

    public boolean isPass() {
        return pass;
    }

    private void setPass(double examResult) {
        this.pass = examResult > this.MIN_SCORE;
    }
}
