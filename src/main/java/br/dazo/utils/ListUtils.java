package br.dazo.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListUtils {

    public static <T> Set<T> getDuplicated(List<T> list) {

        Set<T> items = new HashSet<>();

        return list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());

    }
  
}
