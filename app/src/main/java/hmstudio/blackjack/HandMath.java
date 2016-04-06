package hmstudio.blackjack;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by alex on 2016-03-31.
 */
public class HandMath {

    private SecureRandom card = new SecureRandom();
    private int dealtCard;



    public int addCardTotal(int currenttot){

    dealtCard = card.nextInt(13) + 1;

     if (dealtCard >= 10){
         dealtCard = 10;
     }
    return dealtCard;
    }


}
