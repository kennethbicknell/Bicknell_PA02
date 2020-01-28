 public class Encrypter{
    
    
    private int digits, encryptionFactor;
    
    public Encrypter(int digits, int encryptionFactor){
        this.digits = digits;
        this.encryptionFactor = encryptionFactor;

    }
    public int[] encrypt(int plainData){
        int cryptData[];
        int digits[] = new int[this.digits];
        
        seperateIntoDigit(digits, plainData);
        swap(0, 2, digits);
        swap(1, 3, digits);
        addEncyptionFactor(digits);
        cryptData = digits;

        


        
        
        
        
        return cryptData;
    }

    private void seperateIntoDigit(int[] digits, int plainData){
        for(int i = (this.digits - 1); i >= 0; i--){
            digits[i] = plainData % 10;
            plainData = plainData / 10;
        }
    }

    private void swap(int pos1, int pos2, int[] array){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private void addEncyptionFactor(int[] digits){
        for(int i = 0; i < this.digits; i++){
            digits[i] += this.encryptionFactor;
            digits[i] %= 10;
        }
    }

}