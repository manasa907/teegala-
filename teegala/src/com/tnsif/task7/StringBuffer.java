package com.tnsif.task7;

public class StringBuffer {

    public static void main(String[] args) {
        // Use fully qualified name to avoid conflict
        java.lang.StringBuffer sb = new java.lang.StringBuffer("Hello");

        // 1. Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. Insert
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // 3. Replace
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);

        // 4. Delete
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);

        // 5. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. Capacity (default is 16 + length of string)
        java.lang.StringBuffer sb2 = new java.lang.StringBuffer();
        System.out.println("Default capacity: " + sb2.capacity());

        // 7. Ensure capacity
        sb2.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb2.capacity());

        // 8. Length
        System.out.println("Length of sb: " + sb.length());
    }
}
