package com.vadislav.rembo;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();
    public int ask(){
        int probability = (int) (10 * rand.nextDouble());
        if(probability < 3) return SharedConstants.NO;
        else if (probability < 6) return SharedConstants.YES;
        else return SharedConstants.MAYBE;
    }
}
