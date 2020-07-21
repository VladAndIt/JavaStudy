package CodWars;

public class Class210720 {
    public static void main(String[] args) {
        //System.out.println(expandedForm(70304));
        System.out.println(expandedForm(9000000));
    }

    public static String expandedForm(int num){
        String n = num + "";//your code here
        String nA = ""; //your code here
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i)!='0') {
                nA += n.charAt(i);
                for(int j = i+1; j < n.length(); j++){
                    nA += "0";
                }
                if(i+1 < n.length()){
                    if(n.charAt(n.length()-1)!='0') nA += " + ";
                }
            }
        }
        return nA;
    }
}

