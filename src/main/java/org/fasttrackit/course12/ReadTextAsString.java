package org.fasttrackit.course12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {
    public static void main(String[] args) throws IOException {
        String data = new String(Files.readAllBytes(
                Paths.get("c:\\work\\docs\\test.txt")));

        System.out.println(data);
    }
}
