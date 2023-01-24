package Day15;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // .append for adding to string from back
        sb.append(15);
        sb.append(" marks");
        System.out.println(sb);

        // length of StringBuilder
        System.out.println(sb.length());

        // .insert at string at any index
        sb.insert(0, 'M'); // insert in first index
        System.out.println(sb);

        // .insert in middle
        sb.insert(4, 'S');
        System.out.println(sb);

        // .replace in string
        sb.replace(1, 3, "y");
        System.out.println(sb);

        // .delete for deleting substring from string
        sb.delete(0, 3);
        System.out.println(sb);

        // .setCharAt for setting a charecter in particular index
        sb.setCharAt(3, 'A');
        System.out.println(sb);

        // .charAt() for know what charecter present in particular index
        System.out.println(sb.charAt(1));

        // .reverse for reversing string
        sb.reverse();
        System.out.println(sb);

        // .toString for converting StringBuilder to string
        sb.toString();
        System.out.println(sb);

    }
}
