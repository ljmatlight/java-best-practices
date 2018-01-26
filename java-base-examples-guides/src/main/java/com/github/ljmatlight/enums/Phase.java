package com.github.ljmatlight.enums;

import java.util.EnumMap;
import java.util.Map;

/**
 * Description： 用 EnumMap 代替序数索引 - B
 * <br /> Author： galsang
 */
public enum Phase {

    /**
     * 固体
     */
    SOLID,

    /**
     * 液体
     */
    LIQUID,

    /**
     * 气体
     */
    GAS;

    /**
     * 气体放热液化成为液体,凝华成为固体
     * 液体放热凝固成为固体,吸热汽化成为气体
     * 固体吸热熔化成为液体,升华成为气体
     */
    public enum Transition {

        /**
         * 熔化
         */
        MELT(SOLID, LIQUID),

        /**
         * 凝固
         */
        FREEZE(LIQUID, SOLID),

        /**
         * 汽化
         */
        BOIL(LIQUID, GAS),

        /**
         * 液化
         */
        CONDENSE(GAS, LIQUID),

        /**
         * 升华
         */
        SUBLIME(SOLID, GAS),

        /**
         * 凝华
         */
        DEPOSIT(GAS, SOLID);

        private final Phase src;

        private final Phase dst;

        Transition(Phase src, Phase dst) {
            this.src = src;
            this.dst = dst;
        }

        // Map<src, <dst, transition>>
        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<>(Phase.class);

        static {
            for (Phase p: Phase.values()){
                m.put(p, new EnumMap<>(Phase.class));
            }
            for (Transition t: Transition.values()){
                m.get(t.src).put(t.dst, t);
            }
        }

        public static final Transition from(Phase src, Phase dst){
            return m.get(src).get(dst);
        }

        @Override
        public String toString() {
            return this.name() + ": " + this.src.name() + " to " + this.dst.name();
        }
    }

}
