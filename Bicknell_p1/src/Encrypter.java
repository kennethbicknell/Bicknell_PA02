public class Encrypter{
    final static int DIGITS = 4;
    
    public int encrypt(int plainData){
        int cryptData = 0;
        int digits[] = new int[DIGITS];
        
        seperateIntoDigit(digits, plainData);
        swap(0, 2, digits);
        swap(1, 3, digits);
        addEncyptionFactor(digits);
        cryptData = combineIntoInt(digits);

        


        
        
        
        
        return cryptData;
    }

    private void seperateIntoDigit(int[] digits, int plainData){

    }

    private void swap(int pos1, int pos2, int[] array){

    }

    private void addEncyptionFactor(int[] digits){

    }

    private int combineIntoInt(int[] digits){
        int combinedInt = 0;


        return combinedInt;
    }

}