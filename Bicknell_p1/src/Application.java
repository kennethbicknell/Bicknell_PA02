import java.util.Scanner;
public class Application {
    public static void main(String[] args){
        Encrypter encrypter = new Encrypter(4,7);
        Decrypter decrypter = new Decrypter(4, 7);
        Scanner in = new Scanner(System.in);
        
        String userOperation;
        int userData = 0000;
        int[] modifiedData = {};
        
        userOperation = getUserOperation(in);
        userData = getUserData(in, userOperation);

        if (userOperation.equals("encrypt")){
            System.out.print("Your encrypted data is: ");
            modifiedData = encrypter.encrypt(userData);
        }else{
            modifiedData = decrypter.decrypt(userData);
        }
        
        printArray(modifiedData);
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static String getUserOperation(Scanner in){
        String operation = "";
        while(!(operation.equals("encrypt") || operation.equals("decrypt"))){
            System.out.println("Would you like to encrypt or decrypt some data?");
            System.out.println("Please input response as \"encrypt\" or \"decrypt\".");

            operation = in.next().toLowerCase();
        }

        return operation;
    }

    private static int getUserData(Scanner in, String operation){
        
        int userData = Integer.MAX_VALUE;
        while( userData < 0 || userData > 9999){
            System.out.println("Please enter the data you would like to " + operation + ".");
            System.out.println("NOTE: values should be from 0000 to 9999 inclusive.");
            userData = in.nextInt();
        }

        return userData;
    }
}