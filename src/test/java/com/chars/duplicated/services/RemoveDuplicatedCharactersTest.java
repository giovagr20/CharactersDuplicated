package com.chars.duplicated.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatedCharactersTest {

    @Test
    void testRemoveWithStandardInput() {
        assertEquals("ABCD123", RemoveDuplicatedCharacters.remove("AABBCCD112233"));
    }

    @Test
    void testRemoveWithOnlyLetters() {
        assertEquals("ABC", RemoveDuplicatedCharacters.remove("AABBCC"));
        assertEquals("AB", RemoveDuplicatedCharacters.remove("AAABBB"));
        assertEquals("XYZ", RemoveDuplicatedCharacters.remove("XXYYZZ"));
    }

    @Test
    void testRemoveWithOnlyNumbers() {
        assertEquals("123", RemoveDuplicatedCharacters.remove("111222333"));
        assertEquals("1", RemoveDuplicatedCharacters.remove("11111"));
        assertEquals("789", RemoveDuplicatedCharacters.remove("777888999"));
    }

    @Test
    void testRemoveWithMixedInput() {
        assertEquals("A1B2", RemoveDuplicatedCharacters.remove("A1A1B2B2"));
        assertEquals("a1B2", RemoveDuplicatedCharacters.remove("aa11BB22"));
        assertEquals("a1B", RemoveDuplicatedCharacters.remove("aaaa111BBB"));
    }

    @Test
    void testRemoveWithEmptyString() {
        assertEquals("", RemoveDuplicatedCharacters.remove(""));
    }

    @Test
    void testRemoveWithSingleCharacter() {
        assertEquals("A", RemoveDuplicatedCharacters.remove("AAAAA"));
        assertEquals("1", RemoveDuplicatedCharacters.remove("11111"));
        assertEquals("z", RemoveDuplicatedCharacters.remove("zzzzz"));
    }

    @Test
    void testRemoveWithSpecialCharacters() {
        assertEquals("!@#", RemoveDuplicatedCharacters.remove("!!@@##"));
        assertEquals("$%^&*", RemoveDuplicatedCharacters.remove("$$$$%%%%^^^^&&&&****"));
        assertEquals("a@1#", RemoveDuplicatedCharacters.remove("aaa@@@111###"));
    }

    @Test
    void testRemoveWithSpaces() {
        assertEquals("ABC", RemoveDuplicatedCharacters.remove("A A B B C C"));
        assertEquals("AB", RemoveDuplicatedCharacters.remove("  A  A  B  B  "));
        assertEquals("ab", RemoveDuplicatedCharacters.remove("  a  a  b  b"));
        assertEquals("", RemoveDuplicatedCharacters.remove("        "));
    }

    @Test
    void testRemoveWithCaseSensitivity() {
        assertEquals("AaBbCc", RemoveDuplicatedCharacters.remove("AAaaBBbbCCcc"));
        assertEquals("aABb", RemoveDuplicatedCharacters.remove("aaaaAAAABBBBbbbb"));
        assertEquals("A1a", RemoveDuplicatedCharacters.remove("AAA111aaa"));
    }

    @Test
    void testRemoveWithUnicodeCharacters() {
        assertEquals("你好世界", RemoveDuplicatedCharacters.remove("你你你好好世世界界"));
        assertEquals("😊", RemoveDuplicatedCharacters.remove("😊😊"));
        assertEquals("A😊1", RemoveDuplicatedCharacters.remove("AA😊😊11"));
    }

    @Test
    void testRemoveWithLongString() {
        String input = "A".repeat(1000) + "B".repeat(1000) + "C".repeat(1000);
        assertEquals("ABC", RemoveDuplicatedCharacters.remove(input));
    }

    @Test
    void testRemoveWithPunctuation() {
        assertEquals(",.!?", RemoveDuplicatedCharacters.remove(",,..!!??"));
        assertEquals("Helo,", RemoveDuplicatedCharacters.remove("HHHHelloo,,,,"));
    }

    @Test
    void testRemoveWithNumbersMixedWithLetters() {
        assertEquals("A1B2C3", RemoveDuplicatedCharacters.remove("A1A1B2B2C3C3"));
        assertEquals("1a2b3c", RemoveDuplicatedCharacters.remove("11aa22bb33cc"));
    }

    @Test
    void testRemoveWithRepeatedPatterns() {
        assertEquals("AB", RemoveDuplicatedCharacters.remove("ABABABAB"));
        assertEquals("1234", RemoveDuplicatedCharacters.remove("123412341234"));
        assertEquals("ABCD", RemoveDuplicatedCharacters.remove("ABCDABCD"));
    }

    @Test
    void testRemoveWithWhitespaceAndTabs() {
        assertEquals("", RemoveDuplicatedCharacters.remove("     \t\t\t"));
        assertEquals("ABC", RemoveDuplicatedCharacters.remove("AA BB\t\tCC"));
    }

    @Test
    void testRemoveWithSpecialUnicode() {
        assertEquals("⚡✨🔥", RemoveDuplicatedCharacters.remove("⚡⚡✨✨🔥🔥"));
        assertEquals("🚀🌕⭐", RemoveDuplicatedCharacters.remove("🚀🚀🌕🌕⭐⭐"));
    }

    @Test
    void testRemoveWithControlCharacters() {
        assertEquals("", RemoveDuplicatedCharacters.remove("\n\n\t\t"));
        assertEquals("AB", RemoveDuplicatedCharacters.remove("AA\n\nBB\n"));
    }

    @Test
    void testRemoveWithNumericSequences() {
        assertEquals("1234567890", RemoveDuplicatedCharacters.remove("11223344556677889900"));
        assertEquals("0123456789", RemoveDuplicatedCharacters.remove("00112233445566778899"));
    }
}
