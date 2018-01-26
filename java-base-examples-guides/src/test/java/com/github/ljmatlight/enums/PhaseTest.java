package com.github.ljmatlight.enums;

import com.github.ljmatlight.enums.Phase.Transition;
import org.junit.Test;

/**
 * Description：用 EnumMap 代替序数索引 - B
 * <br /> Author： galsang
 */
public class PhaseTest {

    @Test
    public void testEnumMap() {

        System.out.println(Transition.from(Phase.SOLID, Phase.GAS));
        System.out.println(Transition.from(Phase.GAS, Phase.SOLID));
        System.out.println(Transition.from(Phase.LIQUID, Phase.GAS));

    }

}