/*
    get users data
        get type
        get values based on type
    use data to calculate BMI
        use method for each formula
        use if to calc category
    display both BMI and category
*/





import java.util.Scanner;

public class BMICalculator{
    private String unitType;
    private double height;
    private double weight;
    private double BMI;
    private String BMICategory;
    private Scanner in;
    
    public static void main(String[] args) throws Exception {
        BMICalculator test = new BMICalculator();
        test.readUserData();
        test.calculateBmi();
        test.displayBmi();
    }

    public BMICalculator(){
        this.in = new Scanner(System.in);
    }
    
    public void readUserData(){
        readUnitType();
        readMeasurementData();
    }

    private void readUnitType(){
        do{
            System.out.println("Is your data \"metric\" or \"imperial\"?");
            this.unitType = in.next();

        } while (!(this.unitType.equalsIgnoreCase("metric") || this.unitType.equalsIgnoreCase("imperial")));
    }

    private void readMeasurementData(){
        if (this.unitType.equalsIgnoreCase("metric")){
            readMetricData();
        } else {
            readImperialData();
        }
    }

    private void readImperialData(){
        System.out.print("Enter your height in inches: ");
        this.setHeight(in.nextDouble());
        System.out.print("Enter your weight in pounds: ");
        this.setWeight(in.nextDouble());

        if(this.height < 0 || this.weight < 0){
            System.exit(0);
        }
    }

    private void readMetricData(){
        System.out.print("Enter your height in meters: ");
        this.setHeight(in.nextDouble());
        System.out.print("Enter your weight in kilograms: ");
        this.setWeight(in.nextDouble());

        if(this.height < 0 || this.weight < 0){
            System.exit(0);
        }
    }

    public void calculateBmi(){
        if(this.unitType.equalsIgnoreCase("metric")){
            calculateBMIMetric();
        } else if (this.unitType.equalsIgnoreCase("Imperial")){
            calculateBMIImperial();
        } else {
            readUserData();
            calculateBmi();
        }
    }

    private void calculateBMIMetric(){
        this.BMI = this.weight / (this.height * this.height);
        calculateBmiCategory();
    }

    private void calculateBMIImperial(){
        this.BMI = (703 * this. weight) / (this.height * this.height);
        calculateBmiCategory();
    }

    private void calculateBmiCategory(){
        if(this.BMI < 18.5){
            this .BMICategory = "underweight";
        } else if(this.BMI < 25){
            this.BMICategory = "normal weight";
        }else if(this.BMI < 30){
            this.BMICategory = "overweight";
        } else {
            this.BMICategory = "obese";
        }
    }

    public void displayBmi(){
        if(this.BMICategory.equals(null)){
            calculateBmi();
        }
        System.out.printf("With a BMI of %.1f you are %s\n", this.BMI, this.BMICategory);
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.Height;
    }

    public double getBmi(){
        return this.BMI;
    }

    public String getBmiCategory(){
        return this.BMICategory;
    }

    private void setHeight(double height){
        this.height = height;
    }

    private void setWeight(double weight){
        this.weight = weight;
    }

    
}