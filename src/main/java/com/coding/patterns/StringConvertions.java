package com.coding.patterns;

import java.util.*;
import java.util.stream.Collectors;

public class StringConvertions {
    public static void main(String[] args) {

        String str = "Java,Programming";
        List<Character> chList = new ArrayList<>();

        char []charArray = str.toCharArray();
        Character ch = Character.valueOf(str.charAt(0));
        char c = ch.charValue();

        char c2 = str.charAt(0);

        String[] strArray = str.split(",");
        List<String> strList = Arrays.stream(strArray).toList();
        System.out.println(strList);

        for (char ch1: charArray) {
            chList.add(ch1);
        }
        System.out.println(chList);

       List<Character> cList = str.chars().mapToObj(c1 -> (char)c1).collect(Collectors.toList());
       int jCount = Collections.frequency(cList,'J');
       System.out.println(jCount);

       Map<Character,Integer> countMap = new HashMap<>();

       cList.forEach(e->{
           countMap.put(e,countMap.getOrDefault(e,0)+1);
       });

       List<Character> duplicateList = countMap.entrySet().stream().filter(e -> e.getValue() > 1 ).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Duplicate:"+duplicateList);

        System.out.println(countMap);
        Set<Character> set = new LinkedHashSet<>(cList);

        System.out.println("Unique:"+set);

    }
}
