package by.brest.vw.zzap.taf.utils;

import java.security.SecureRandom;
import java.util.Random;

public class Util {
    public static String generateNickname(int numberOfCharacters) {
        String name = "";
        char ch;

        for (int i = 0; i < numberOfCharacters; i++) {
            do {
                ch = (char) (Math.random() * 74 + 48);
            } while ((57 < ch && ch < 65) || (90 < ch && ch < 97));
            name = name + ch;
        }
        return name;
    }
    public static String generatePassword() {
        Random random = new SecureRandom();
        final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String digits = "0123456789";
        final String specialCharacters = "!@#$%&*";
        final String allCharacters = letters + digits + specialCharacters;

        int length = random.nextInt(9) + 8;
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomCharacter = allCharacters.charAt(randomIndex);
            password.append(randomCharacter);
        }
        return password.toString();
    }
}

