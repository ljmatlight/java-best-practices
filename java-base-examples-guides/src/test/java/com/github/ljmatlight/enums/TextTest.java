package com.github.ljmatlight.enums;

import org.junit.Test;

import java.util.EnumSet;

/**
 * Description：
 * <br />Author： ljmatlight（随风浮云）
 */
public class TextTest {
    @Test
    public void applyStyles() throws Exception {

        Text text = new Text();
        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC));
    }

}