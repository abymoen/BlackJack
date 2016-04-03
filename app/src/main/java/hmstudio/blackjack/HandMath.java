package hmstudio.blackjack;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by alex on 2016-03-31.
 */
public class HandMath {
    private SecureRandom card = new SecureRandom();
    private int Dealtcard;

    public int addUserTotal(int currenttot){

    Dealtcard = card.nextInt(13) + 1;

     if (Dealtcard >= 10){
         Dealtcard = 10;
     }
    return Dealtcard;
    }


}
