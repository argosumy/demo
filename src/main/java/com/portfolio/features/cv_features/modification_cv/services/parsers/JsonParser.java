package com.portfolio.features.cv_features.modification_cv.services.parsers;


import java.util.List;
import java.util.Map;

public interface JsonParser<T> {
    List<T> parse(Map<String, String> data);
}
