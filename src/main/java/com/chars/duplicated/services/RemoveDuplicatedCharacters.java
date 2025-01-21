package com.chars.duplicated.services;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;

public class RemoveDuplicatedCharacters {

    public static String remove(String message) {
        if (StringUtils.isBlank(message)) {
            return StringUtils.EMPTY;
        }

        String processedMessage = message.trim().replaceAll("\\s+", "");

        return processedMessage.chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .distinct()
                .collect(Collectors.joining());

    }
}
