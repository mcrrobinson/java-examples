

public class GradeManager {
    private double[] grades;
    
    public GradeManager(int gradeCount) {
        this.grades = new double[gradeCount];
    }

    public double get(int index){
        return this.grades[index];
    }

    public int size() {
        return this.grades.length;
    }

    public double lowestGrade(){
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value > get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }
    

    public double highestGrade(){
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value < get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }
    

    public double averageGrade(){
        double value = 0;
        for(int i = 0; i < size();i++){
            value += get(i);
        }
        return value/size();
    }
    

    public String allGgrades(){
        String values = "[ ";
        for(int i = 0; i < size();i++){
            if(i<size()-1){
                values += get(i) + " , ";
            }
            else {
                values += get(i) ;
            }
        } 
        values += " ]";
        return values;
    }
    

    public void replaceGrade(int index, double newValue){
        set(index,newValue);
    } 
    

    public void set(int i, double nextDouble) {
        this.grades[i] = nextDouble;
    }

}
