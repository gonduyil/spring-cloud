package org.gonduyil.consumer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liyudong
 * @version 1.1.1
 * @title Tests
 * @description TODO
 * @create 2022/11/30 17:37
 */
public class Tests {

    public static void main(String[] args) {


        // 文件删除前两个字符
        String filename = "/Users/liyudong/dev/source/gonduyil/using-spring-cloud/provider/信息系统.json";

        List<String> result = readLineFile(filename);


        writeLineFile(
                filename + ".res",
                result.stream()
                        .filter(line -> (line != null && line.length() > 2))
                        .map(line -> line.substring(2, line.length()))
                        .collect(Collectors.toList())

        );

    }

    public static List<String> readLineFile(String filename) {

        List<String> results = new LinkedList<>();
        try {

            FileInputStream in = new FileInputStream(filename);

            InputStreamReader inReader = new InputStreamReader(in, "UTF-8");

            BufferedReader bufReader = new BufferedReader(inReader);

            String line = null;

            int i = 1;

            while ((line = bufReader.readLine()) != null) {

                System.out.println("第" + i + "行：" + line);
                results.add(line);
                i++;

            }

            bufReader.close();

            inReader.close();

            in.close();

            return results;

        } catch (Exception e) {

            e.printStackTrace();

            System.out.println("读取" + filename + "出错！");
            return null;
        }
    }


    public static void writeLineFile(String filename, List<String> content) {

        try {

            FileOutputStream out = new FileOutputStream(filename);

            OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");

            BufferedWriter bufWrite = new BufferedWriter(outWriter);

            for (int i = 0; i < content.size(); i++) {

                bufWrite.write(content.get(i) + "\r\n");

            }

            bufWrite.close();

            outWriter.close();

            out.close();

        } catch (Exception e) {

            e.printStackTrace();

            System.out.println("读取" + filename + "出错！");

        }

    }


}
