package BraceChecker;

public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }


    public void check() {
        Stack st = new Stack();
        char ar[] = text.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            switch (ar[i]) {
                case '(':
                case '[':
                case '{':
                    st.push(ar[i]);
                    break;
                case ')':
                    char oNe = st.pop();
                    if (oNe != '(') {
                        System.err.println("Error ) at " + i);
                    }
                    break;

                case ']':
                    char tWo = st.pop();
                    if (tWo != '[') {
                        System.err.println("Error ] at " + i);
                    }
                    break;

                case '}':
                    char tHree = st.pop();
                    if (tHree != '{') {
                        System.err.println("Error } at " + i);
                    }
                    break;
                default:
                    break;


            }

        }
        while (!st.isEmty()){
            System.err.println("Error: opened "+st.pop() + " but dont close" );
        }


    }

}




