public class Application {
    public static void main(String[] args) throws Exception {
        Encrypter encrypter = new Encrypter(4,7);
        int[] result = encrypter.encrypt(1234);
        printArray(result);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}