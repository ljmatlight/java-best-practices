package com.github.ljmatlight.enums;

import java.util.Set;

/**
 * Description：用 EnumSet 代替位域
 * <br />Author： ljmatlight（随风浮云）
 */
public class Text {

    public enum Style {
        BOLD,
        ITALIC,
        UNDERLINE,
        STRIKETHROUGH
    }

    public void applyStyles(Set<Style> styles) {
        System.out.println("styles === " + styles);
    }

}
