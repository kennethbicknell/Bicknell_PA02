/*
    same process as encrypt except subtract 7 and add 10 if negative
*/
public class Decrypter{
    private int digits, encryptionFactor;
    
    public Decrypter(int digits, int encryptionFactor){
        this.digits = digits;
        this.encryptionFactor = encryptionFactor;

    }

    public int[] decrypt(int plainData){
        int cryptData[];
        int digits[] = new int[this.digits];
        
        seperateIntoDigit(digits, plainData);
        swap(0, 2, digits);
        swap(1, 3, digits);
        undoEncryptionFactor(digits);
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

    private void undoEncryptionFactor(int[] digits){
        for (int i = 0; i < digits.length; i++){
            if(digits[i] < this.encryptionFactor){
                digits[i] += 10;
                digits[i] -= this.encryptionFactor;
            } else {
                digits[i] -= this.encryptionFactor;
            }
        }
    }

}