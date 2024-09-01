public class TipeDataString {
    public static void main(String[] args) {
        // perbedaan primitive  dan non primtive
        String firstName = "Thomson";
        String lastName = "Situmorang";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(fullName.toLowerCase());
    }
}
