public static String caesarCipher(String s, int k) {
    StringBuilder result = new StringBuilder();
    k = k % 26; // handle shifts larger than 26

    for (char c : s.toCharArray()) {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            result.append((char) ((c - base + k) % 26 + base));
        } else {
            result.append(c); // non-letters stay unchanged
        }
    }

    return result.toString();
}
