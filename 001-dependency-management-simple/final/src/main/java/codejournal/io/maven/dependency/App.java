package codejournal.io.maven.dependency;

import com.google.common.base.Strings;

public class App {

    public static void main(String[] args) {

        final String s1 = null;
        final String s2 = "";
        final String s3 = "Hello World";

        final boolean s1IsNullOrEmpty = (s1 == null || s1.isEmpty());
        final boolean s2IsNullOrEmpty = Strings.isNullOrEmpty(s2);
        final boolean s3IsNullOrEmpty = Strings.isNullOrEmpty(s3);

        System.out.println(String.format("String[%s] -> isNullOrEmpty[%s]", s1, s1IsNullOrEmpty));
        System.out.println(String.format("String[%s] -> isNullOrEmpty[%s]", s2, s2IsNullOrEmpty));
        System.out.println(String.format("String[%s] -> isNullOrEmpty[%s]", s3, s3IsNullOrEmpty));
    }
}
