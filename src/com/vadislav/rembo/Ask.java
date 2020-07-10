package com.vadislav.rembo;

public class Ask implements SharedConstants {
    public void answer(int result){
        switch(result){
            case SharedConstants.NO:
                System.out.println("No!");
                break;
            case SharedConstants.YES:
                System.out.println("Yes!");
                break;
            default:
                System.out.println("Maybe!");
        }
    }
}
