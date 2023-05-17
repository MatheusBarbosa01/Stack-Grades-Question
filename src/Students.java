public class Students {
    private String name;
    private Stack <Double> stack = new Stack<Double>();

    public void addGrades(double grades){
        stack.push(grades);
    }
    public void show(){
        System.out.println(stack);
    }
    public Students(String name) {
        this.name = name;
    }
}
