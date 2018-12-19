/**
 * Richard Fitzgerald
 * 12/18/18
 * CH5 PC3 - Charge Account Validation
 * APCS
 */
public class ChargeAccountValidation {
    
    private int numEnt;
    private String answer;
    // constructor
    public ChargeAccountValidation(int charge){
        numEnt = charge;
    }
    // validates whether it is a real charge number
    public void validation(){
        int[] account = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 50505552,
            7825877, 1250355, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
        boolean n = false;
        for(int x = 0; x < 18; x++){
            if(account[x] == numEnt){
                n = true;
                answer = "True";
            }
         if(n == false){
             answer = "False";
         }
        }
        // returns the answer
    }
    public String getAnswer(){
        return answer;
    }
}