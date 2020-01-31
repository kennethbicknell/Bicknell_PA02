import java.util.Scanner;

public class BMICalculator{
    private String unitType;
    private double height;
    private double weight;
    private Scanner in;
    
    public static void main(String[] args) throws Exception {
        BMICalculator test = new BMICalculator();
        test.readUserData();
        test.printData();
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
        System.out.print("Enter your height: ");
        this.height = in.nextFloat();
        System.out.print("Enter your weight: ");
        this.weight = in.nextDouble();

        if(this.height < 0 || this.weight < 0){
            System.exit(0);
        }
    }

    private void readMetricData(){
        System.out.print("Enter your height: ");
        this.height = in.nextFloat();
        System.out.print("Enter your weight: ");
        this.weight = in.nextDouble();

        if(this.height < 0 || this.weight < 0){
            System.exit(0);
        }
    }

    
}