public class patternprint {
    public static void main(String[] args) {
        String[] pattern = {
            "?", 
            "# # #", 
            "? ? ? ? ?", 
            "# # # # # # #", 
            "? ? ? ? ? ? ? ? ?"
        };

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}
