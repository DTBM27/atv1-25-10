import java.util.Stack;

public class invercao {
    public static String reverseWords(String input) {
        Stack<Character> charStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                charStack.push(c);
                inWord = true;
            } else {
                while (!charStack.isEmpty()) {
                    result.append(charStack.pop());
                }
                if (inWord) {
                    result.append(c);
                } else {
                    result.append(c);
                }
                inWord = false;
            }
        }

        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String input2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";

        String output1 = reverseWords(input1);
        String output2 = reverseWords(input2);

        System.out.println(output1);
        System.out.println(output2);
    }
}
