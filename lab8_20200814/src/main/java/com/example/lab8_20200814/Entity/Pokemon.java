package com.example.lab8_20200814.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pokemon {

    private int id;
    private String name;
    private int baseExperience;
    private int height;
    private boolean isDefault;
    private int order;
    private int weight;
    private List<Ability> abilities;
    private List<Type> types;

    @Getter
    @Setter
    public static class Ability {
        private AbilityInfo ability;

        @Getter
        @Setter
        public static class AbilityInfo {
            private String name;
            private String url;
        }
    }

    @Getter
    @Setter
    public static class Type {
        private int slot;
        private TypeInfo type;

        @Getter
        @Setter
        public static class TypeInfo {
            private String name;
            private String url;
        }
    }
}
