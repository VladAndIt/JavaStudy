package Complete_reference_java_11.Part_1.Chapter_12_Enum_AutoPack.Enum;

public class AskMe {
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
    static void answer(Answer result){
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
        }
    }
}
