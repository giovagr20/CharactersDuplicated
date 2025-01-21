package com.chars.duplicated;

import com.chars.duplicated.services.RemoveDuplicatedCharacters;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("result: " + RemoveDuplicatedCharacters.remove("AABBCCD112233"));
        System.out.println("result: " + RemoveDuplicatedCharacters.remove(StringUtils.EMPTY));
    }
}