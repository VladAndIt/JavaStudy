package Chapter_12_Enum_AutoPack.Enum;

import java.util.Random;

public class Question {

    Random random = new Random();

    Answer ask(){
        int prob = (int) (60*random.nextDouble());

        if (prob < 15)
            return Answer.MAYBE;
        else if (prob < 30)
            return Answer.NO;
        else if (prob < 60)
            return Answer.YES;
        else
            return Answer.NEVER;
    }
}
