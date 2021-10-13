public class String_Builder {
    public static void main(String[] args) {
        // StringBuilder str=new StringBuilder("Tony");
        // System.out.println(str);

        // char at index 0
        // System.out.println(str.charAt(0));

        // set char at index 0
        // str.setCharAt(0, 'P');
        // System.out.println(str);

        // str.insert(2, 'n');
        // System.out.println(str);

        // // delete the extra n
        // str.delete(2, 4);
        // System.out.println(str);
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
    }
}
